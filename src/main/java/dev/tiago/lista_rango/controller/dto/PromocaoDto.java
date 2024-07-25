package dev.tiago.lista_rango.controller.dto;

import dev.tiago.lista_rango.model.Produto;
import dev.tiago.lista_rango.model.Promocao;
import jakarta.persistence.OneToMany;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import static java.util.Collections.emptyList;
import static java.util.Optional.ofNullable;
import static java.util.stream.Collectors.toList;

public record PromocaoDto(
        Long id,
        boolean ativa,
        String descricao,
        List<Produto>produtos,
        BigDecimal desconto,
        LocalDateTime periodo) {

    public Promocao toModel() {
        Promocao model = new Promocao();
        model.setId(this.id);
        model.setAtiva(this.ativa);
        model.setDescricao(this.descricao);
        model.setProdutos(this.produtos);
        model.setDesconto(this.desconto);
        model.setPeriodo(this.periodo);
        return model;
    }
}
