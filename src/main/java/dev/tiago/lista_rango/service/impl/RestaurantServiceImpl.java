package dev.tiago.lista_rango.service.impl;

import dev.tiago.lista_rango.model.DiaSemana;
import dev.tiago.lista_rango.model.Funcionamento;
import dev.tiago.lista_rango.model.Restaurant;
import dev.tiago.lista_rango.repository.RestaurantRepository;
import dev.tiago.lista_rango.service.RestaurantService;
import org.springframework.stereotype.Service;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.NoSuchElementException;

import static java.util.Optional.ofNullable;

/**
 * Implementação da <b>Strategy</b> {@link RestaurantService}, a qual
 * pode ser injetada pelo Spring (via {@link org.springframework.beans.factory.annotation.Autowired}. Com
 * isso ela se torna um {@link Service} e será tratada como Singleton
 */

@Service
public class RestaurantServiceImpl implements RestaurantService {
    // TODO Strategy: Implementar os métodos definidos na interface

    private final RestaurantRepository restaurantRepository;

    public RestaurantServiceImpl(RestaurantRepository restaurantRepository) {
        this.restaurantRepository = restaurantRepository;
    }

    @Override
    public List<Restaurant> findAll() {
        return this.restaurantRepository.findAll();
    }

    @Override
    public Restaurant findById(Long id) {
        return this.restaurantRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public Restaurant create(Restaurant restaurantToCreate) {
        ofNullable(restaurantToCreate).orElseThrow(() -> new BusinessException("Restaurant to create must not be null."));


        if(restaurantToCreate.getId() != null && restaurantRepository.existsById(findById(restaurantToCreate.getId()))) {
            throw new IllegalArgumentException("Este restaurante já existe.");
        }
        return null;
    }

    @Override
    public void update(Long id, Restaurant restaurante) {
        // FIXME Buscar Restaurante por id. Caso exista:
        // FIXME Alterar Restaurante e salvar
    }

    @Override
    public void delete(Long id) {
        // FIXME Remover Restaurante por id
    }


    public void setOperatingHours(DiaSemana dia, String abertura, String fechamento) {
        // Testar se a lista horarioFuncionamentos contem o dia da semana. Nao pode permitir cadastro do mesmo di amais de uma vez
        if (operatingHours.contains(dia)) {

        }

        // converter string to localtime
        LocalTime openingHour = convertStringtoLocalTime(abertura);
        LocalTime closingHour = convertStringtoLocalTime(fechamento);

        // verifica se os horarios sao validos
        if (validateInterval(openingHour,closingHour)) {
            // Cria um objeto HorarioFuncionamento e adiciona para a lista horarioFuncionamentos
            Funcionamento horarioFuncionamento = new Funcionamento();
        }

    }

    private boolean validateInterval(LocalTime horarioAbertura, LocalTime horarioFechamento) {
        if(!isIntervalValid(horarioAbertura) || !isIntervalValid(horarioFechamento)){
            throw new IllegalArgumentException("Os horários devem estar em intervalos de 15 minutos.");
        } else return true;
    }

    private LocalTime convertStringtoLocalTime(String hora) {
        return LocalTime.parse(hora, DateTimeFormatter.ofPattern("HH:mm"));
    }

    private boolean isIntervalValid(LocalTime time) {
        int minutes = time.getMinute();
        return minutes % 15 == 0;
    }

}
