package dev.tiago.lista_rango.repository;

import dev.tiago.lista_rango.model.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {
}
