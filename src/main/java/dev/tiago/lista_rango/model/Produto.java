package dev.tiago.lista_rango.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

import java.math.BigDecimal;

@Entity
public class Produto {
    @Id
    private Long id;
    private String foto;
    private String nome;
    private int quantity;
    private BigDecimal preco;
    private CategoriaProduto categoriaProduto;
    @OneToOne
    private Promocao promocao;

    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", foto=" +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", categoriaProduto=" + categoriaProduto +
                ", promocao=" +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public CategoriaProduto getCategoriaProduto() {
        return categoriaProduto;
    }

    public void setCategoriaProduto(CategoriaProduto categoriaProduto) {
        this.categoriaProduto = categoriaProduto;
    }

    public Promocao getPromocao() {
        return promocao;
    }

    public void setPromocao(Promocao promocao) {
        this.promocao = promocao;
    }
}
