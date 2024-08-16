package dev.tiago.lista_rango.repository;

import dev.tiago.lista_rango.model.Prato;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Prato, Long> {
}
