package dev.tiago.lista_rango.controller.dto;

import dev.tiago.lista_rango.model.CategoriaProduto;
import dev.tiago.lista_rango.model.Prato;
import dev.tiago.lista_rango.model.Promocao;
import static java.util.Optional.ofNullable;

import java.math.BigDecimal;
import java.util.Optional;

public record ProductDto(
        Long id,
        String foto,
        String nome,
        int quantity,
        BigDecimal preco,
        CategoriaProduto categoriaProduto,
        Optional<Promocao> promocao) {

    public ProductDto(Prato model) {
        this (
                model.getId(),
                model.getFotoUrl(),
                model.getNome(),
                model.getQuantity(),
                model.getPreco(),
                model.getCategoriaProduto(),
                ofNullable(model.getPromocao())
        );
    }

    public Prato toModel() {
        Prato model = new Prato();
        model.setId(this.id);
        model.setNome(this.nome);
        model.setFotoUrl(this.foto);
        model.setQuantity(this.quantity);
        model.setPreco(this.preco);
        model.setCategoriaProduto(this.categoriaProduto);
        model.setPromocao(this.promocao.orElse(null));
        return model;
    }
}
