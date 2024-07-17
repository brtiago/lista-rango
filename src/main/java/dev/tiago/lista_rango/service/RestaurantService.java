package dev.tiago.lista_rango.service;

import dev.tiago.lista_rango.model.Restaurant;

import java.util.List;

/**
 *  Interface que define o padrão <b>Strategy</b> no domínio restaurante.
 *  Com isso podemos ter múltiplas implementações dessa interface caso necessário.
 */


public interface RestaurantService {
    List<Restaurant> findAll();

    Restaurant findById(Long id);

    void create(Restaurant restaurante);

    void update(Long id, Restaurant restaurante);

    void delete(Long id);
}
