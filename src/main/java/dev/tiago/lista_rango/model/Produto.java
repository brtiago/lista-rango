package dev.tiago.lista_rango.model;

import java.awt.image.BufferedImage;
import java.math.BigDecimal;

public class Produto {
    private Long id;
    private BufferedImage foto;
    private String nome;
    private BigDecimal preco;
    private CategoriaProduto categoriaProduto;
    private Promocao promocao;

    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", foto=" + foto +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", categoriaProduto=" + categoriaProduto +
                ", promocao=" + promocao +
                '}';
    }


}
