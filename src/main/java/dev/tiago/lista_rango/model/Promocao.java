package dev.tiago.lista_rango.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;
@Entity
public class Promocao {
    @Id
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
