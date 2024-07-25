package dev.tiago.lista_rango.service;

import dev.tiago.lista_rango.model.Produto;

import java.util.Set;

public interface ProductService {

    public Set<Produto> findAll();

    public Produto findById(Long id);

    public Produto create(Produto product);

    public Produto update(Long id, Produto product);

    public void delete(Long id);
}
