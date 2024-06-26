package dev.tiago.lista_rango.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.awt.image.BufferedImage;
import java.math.BigDecimal;

@Entity
public class Produto {
    @Id
    private Long id;
    //private BufferedImage foto;
    private String nome;
    private BigDecimal preco;
    private CategoriaProduto categoriaProduto;
    //private Promocao promocao;

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


}
