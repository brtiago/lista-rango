package dev.tiago.lista_rango.service;

import dev.tiago.lista_rango.model.Prato;

import java.util.Set;

public interface ProductService {

    public Set<Prato> findAll();

    public Prato findById(Long id);

    public Prato create(Prato product);

    public Prato update(Long id, Prato product);

    public void delete(Long id);
}
