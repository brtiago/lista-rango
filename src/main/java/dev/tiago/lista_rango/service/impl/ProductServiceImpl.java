package dev.tiago.lista_rango.service.impl;

import dev.tiago.lista_rango.model.Prato;
import dev.tiago.lista_rango.repository.ProductRepository;
import dev.tiago.lista_rango.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.NoSuchElementException;
import java.util.Set;

import static java.util.Optional.ofNullable;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Set<Prato> findAll() {
        return new HashSet<>(this.productRepository.findAll());
    }

    public Prato findById(Long id) {
        return this.productRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    public Prato create(Prato productToCreate) {
        ofNullable(productToCreate).orElseThrow(() -> new RuntimeException("Restaurant to create must not be null."));

        if(productToCreate.getId() != null && productRepository.existsById(productToCreate.getId())) {
            throw new IllegalArgumentException("Este produto já existe.");
        }

        return this.productRepository.save(productToCreate);
    }


    public Prato update(Long id, Prato product) {
        Prato existingProduct = productRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found"));
        existingProduct.setFotoUrl(product.getFotoUrl());
        existingProduct.setNome(product.getNome());
        existingProduct.setQuantity(product.getQuantity());
        existingProduct.setPreco(product.getPreco());
        existingProduct.setCategoriaProduto(product.getCategoriaProduto());
        existingProduct.setPromocao(product.getPromocao());

        return productRepository.save(existingProduct);
    }

    public void delete(Long id) {
        productRepository.deleteById(id);
    }
}
