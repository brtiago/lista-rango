package dev.tiago.lista_rango.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String logo;
    private String name;
    private String address;

    @OneToMany
    private List<Funcionamento> horarioFuncionamentos;

    @OneToMany
    private List<Produto> produtos;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Funcionamento> getHorarioFuncionamentos() {
        return horarioFuncionamentos;
    }

    public void setHorarioFuncionamentos(List<Funcionamento> horarioFuncionamentos) {
        this.horarioFuncionamentos = horarioFuncionamentos;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
}
