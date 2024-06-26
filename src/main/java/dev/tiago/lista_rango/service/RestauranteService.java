package dev.tiago.lista_rango.service;

import dev.tiago.lista_rango.model.Restaurante;

/**
 *  Interface que define o padrão <b>Strategy</b> no domínio restaurante.
 *  Com isso podemos ter múltiplas implementações dessa interface caso necessário.
 */


public interface RestauranteService {
    Iterable<Restaurante> buscarTodos();

    Restaurante buscarPorId(Long id);

    void cadastrar(Restaurante restaurante);

    void atualizar(Long id, Restaurante restaurante);

    void remover(Long id);
}
