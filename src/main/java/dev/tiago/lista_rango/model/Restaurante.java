package dev.tiago.lista_rango.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import org.springframework.format.annotation.DateTimeFormat;

import java.awt.image.BufferedImage;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
@Entity
public class Restaurante {
    @Id
    private Long id;
    //private BufferedImage foto;
    private String nome;
    private String endereco;

    @OneToMany
    private List<HorarioFuncionamento> horarioFuncionamentos;

    /*private LocalTime aberturaSemana;

    private LocalTime aberturaFimDeSemana;

    private LocalTime fechamentoSemana;

    private LocalTime fechamentoFimDeSemana;*/

    @OneToMany
    private List<Produto> produtos;

    public void definirHorario(DiaSemana dia, String abertura, String fechamento) {
        // Testar se a lista horarioFuncionamentos contem o dia da semana. Nao pode permitir cadastro do mesmo di amais de uma vez

        // verifica se os horarios sao validos

        // Converte strings em LocalTime

        // Cria um objeto HorarioFuncionamento e adiciona para a lista horarioFuncionamentos
    }

    private boolean validarIntervalo(LocalTime horarioAbertura, LocalTime horarioFechamento) {
        if(!isIntervalValid(horarioAbertura) || !isIntervalValid(horarioFechamento)){
            throw new IllegalArgumentException("Os horários devem estar em intervalos de 15 minutos.");
        } else return true;
    }

    private LocalTime convertStringtoLocalTime(String hora) {
        LocalTime localTime = LocalTime.parse(hora, DateTimeFormatter.ofPattern("HH:mm"));

    }

    private boolean isIntervalValid(LocalTime time) {
        int minutes = time.getMinute();
        return minutes % 15 == 0;
    }

}
