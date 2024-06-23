package dev.tiago.lista_rango.domain.entities;

import java.awt.image.BufferedImage;
import java.util.List;

public class Restaurante {
    private Long id;
    private BufferedImage foto;
    private String nome;
    private String endereco;
    private String funcionamento;
    private List<Produto> produtos;

    public String toString() {
        return "Restaurante{" +
                "id=" + id +
                ", foto=" + foto +
                ", nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", funcionamento='" + funcionamento + '\'' +
                ", produtos=" + produtos +
                '}';
    }


    public Restaurante(
            BufferedImage foto,
            String nome,
            String endereco,
            String funcionamento,
            List<Produto> produtos) {

        

        this.foto = foto;
        this.nome = nome;
        this.endereco = endereco;
        this.funcionamento = funcionamento;
        this.produtos = produtos;
    }
}
