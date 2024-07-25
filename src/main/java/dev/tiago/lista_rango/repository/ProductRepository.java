package dev.tiago.lista_rango.repository;

import dev.tiago.lista_rango.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Produto, Long> {
}
