package dev.tiago.lista_rango.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Promocao {
    private Long id;
    private boolean ativa;
    private String descricao;
    private BigDecimal precoPromocional;
    private LocalDateTime periodo;

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
