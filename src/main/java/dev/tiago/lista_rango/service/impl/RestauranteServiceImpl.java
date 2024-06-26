package dev.tiago.lista_rango.service.impl;

import dev.tiago.lista_rango.model.Restaurante;
import dev.tiago.lista_rango.service.RestauranteService;
import org.springframework.stereotype.Service;

/**
 * Implementação da <b>Strategy</b> {@link RestauranteService}, a qual
 * pode ser injetada pelo Spring (via {@link org.springframework.beans.factory.annotation.Autowired}. Com
 * isso ela se torna um {@link Service} e será tratada como Singleton
 */
@Service
public class RestauranteServiceImpl implements RestauranteService {
    // TODO Strategy: Implementar os métodos definidos na interface


    @Override
    public Iterable<Restaurante> buscarTodos() {
        // FIXME Buscar todos os Restaurantes.
        return null;
    }

    @Override
    public Restaurante buscarPorId(Long id) {
        // FIXME Buscar Restaurante por ID
        return null;
    }

    @Override
    public void cadastrar(Restaurante restaurante) {
        // FIXME Cadastrar novo restaurante
    }

    @Override
    public void atualizar(Long id, Restaurante restaurante) {
        // FIXME Buscar Restaurante por id. Caso exista:
        // FIXME Alterar Restaurante e salvar
    }

    @Override
    public void remover(Long id) {
        // FIXME Remover Restaurante por id
    }
}
