package dev.tiago.lista_rango.service.impl;

import dev.tiago.lista_rango.model.Produto;
import dev.tiago.lista_rango.repository.ProductRepository;
import dev.tiago.lista_rango.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.HashSet;
import java.util.NoSuchElementException;
import java.util.Set;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Set<Produto> findAll() {
        return new HashSet<>(this.productRepository.findAll());
    }

    public Produto findById(Long id) {
        return this.productRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    public Produto create(Produto product);

    public Produto update(Long id, Produto product);

    publicc void delete(Long id) {
        productRepository.deleteById(id);
    }
}
