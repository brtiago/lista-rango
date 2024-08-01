package dev.tiago.lista_rango.controller.dto;

import dev.tiago.lista_rango.model.CategoriaProduto;
import dev.tiago.lista_rango.model.Produto;
import dev.tiago.lista_rango.model.Promocao;
import static java.util.Optional.ofNullable;
import static java.util.Collections.emptyList;
import static java.util.stream.Collectors.toList;

import java.math.BigDecimal;
import java.util.Optional;

public record ProductDto(
        Long id,
        String foto,
        String nome,
        int quantity,
        BigDecimal preco,
        CategoriaProduto categoriaProduto,
        Promocao promocao) {

    public ProductDto(Produto model) {
        this (
                model.getId(),
                model.getFoto(),
                model.getNome(),
                model.getQuantity(),
                model.getPreco(),
                model.getCategoriaProduto(),
                ofNullable(model.getPromocao())
                this.promocao = promocao;
        );
    }

    public Produto toModel() {
        Produto model = new Produto();
        model.setId(this.id);
        model.setNome(this.nome);
        model.setFoto(this.foto);
        model.setQuantity(this.quantity);
        model.setPreco(this.preco);
        model.setCategoriaProduto(this.categoriaProduto);
        model.setPromocao(
                ofNullable(this.promocao)
                        .orElse(emptyList())
                        .stream()
                        .map(PromocaoDto::toModel)
                        .collect(toList()));
        return model;
    }
}
