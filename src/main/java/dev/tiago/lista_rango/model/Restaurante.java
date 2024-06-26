package dev.tiago.lista_rango.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.awt.image.BufferedImage;
import java.time.LocalDateTime;
import java.util.List;
@Entity
public class Restaurante {
    @Id
    private Long id;
    //private BufferedImage foto;
    private String nome;
    private String endereco;
    private LocalDateTime funcionamento;
    @OneToMany
    private List<Produto> produtos;

    public String toString() {
        return "Restaurante{" +
                "id=" + id +
                ", foto=" +
                ", nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", funcionamento='" + funcionamento + '\'' +
                ", produtos=" + produtos +
                '}';
    }
}
