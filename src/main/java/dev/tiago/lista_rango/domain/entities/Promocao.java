package dev.tiago.lista_rango.domain.entities;

import java.math.BigDecimal;

public class Promocao {
    private Long id;
    private boolean ativa;
    private String descricao;
    private BigDecimal precoPromocional;
    private String periodo;

    @Override
    public String toString() {
        return "Promocao{" +
                "id=" + id +
                ", ativa=" + ativa +
                ", descricao='" + descricao + '\'' +
                ", precoPromocional=" + precoPromocional +
                ", periodo='" + periodo + '\'' +
                '}';
    }
}
