package dev.tiago.lista_rango.service.impl;

import dev.tiago.lista_rango.model.Produto;
import dev.tiago.lista_rango.repository.ProductRepository;
import dev.tiago.lista_rango.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.Collections;
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

    public Set<Produto> findAll() {
        return new HashSet<>(this.productRepository.findAll());
    }

    public Produto findById(Long id) {
        return this.productRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    public Produto create(Produto productToCreate) {
        ofNullable(productToCreate).orElseThrow(() -> new RuntimeException("Restaurant to create must not be null."));

        if(productToCreate.getId() != null && productRepository.existsById(findById(productToCreate.getId()))) {
            throw new IllegalArgumentException("Este produto já existe.");
        }

        return this.productRepository.save(productToCreate);
    }


    public Produto update(Long id, Produto product) {
        Produto existingProduct = productRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found"));
        existingProduct.setFoto(product.getFoto());
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
