package dev.tiago.lista_rango.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Promocao {
    @Id
    private Long id;
    private boolean ativa;
    private String descricao;
    @OneToMany
    private List<Produto> produtos;
    private BigDecimal desconto;
    private LocalDateTime periodo;
    @Override
    public String toString() {
        return "Promocao{" +
                "id=" + id +
                ", ativa=" + ativa +
                ", descricao='" + descricao + '\'' +
                ", precoPromocional=" + desconto +
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

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public BigDecimal getDesconto() {
        return desconto;
    }

    public void setDesconto(BigDecimal desconto) {
        this.desconto = desconto;
    }

    public LocalDateTime getPeriodo() {
        return periodo;
    }

    public void setPeriodo(LocalDateTime periodo) {
        this.periodo = periodo;
    }
}
