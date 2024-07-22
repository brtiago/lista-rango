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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getPrecoPromocional() {
        return precoPromocional;
    }

    public void setPrecoPromocional(BigDecimal precoPromocional) {
        this.precoPromocional = precoPromocional;
    }

    public LocalDateTime getPeriodo() {
        return periodo;
    }

    public void setPeriodo(LocalDateTime periodo) {
        this.periodo = periodo;
    }
}
