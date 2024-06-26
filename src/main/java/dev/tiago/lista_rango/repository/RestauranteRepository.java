package dev.tiago.lista_rango.repository;

import dev.tiago.lista_rango.model.Restaurante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestauranteRepository extends JpaRepository<Restaurante, Long> {
}
