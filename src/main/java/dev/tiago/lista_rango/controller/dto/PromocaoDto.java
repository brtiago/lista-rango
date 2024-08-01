package dev.tiago.lista_rango.controller.dto;

import dev.tiago.lista_rango.model.Produto;
import dev.tiago.lista_rango.model.Promocao;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;


public record PromocaoDto(
        Long id,
        boolean ativa,
        String descricao,
        List<Produto> produtos,
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
