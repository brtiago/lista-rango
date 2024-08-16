package dev.tiago.lista_rango.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String logoUrl;
    private String name;
    private String address;
    private String contato;

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    @OneToMany
    private List<HorarioFuncionamento> horarioFuncionamentos;

    @OneToMany
    private List<Prato> pratos;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public List<HorarioFuncionamento> getHorarioFuncionamentos() {
        return horarioFuncionamentos;
    }

    public void setHorarioFuncionamentos(List<HorarioFuncionamento> horarioFuncionamentos) {
        this.horarioFuncionamentos = horarioFuncionamentos;
    }

    public List<Prato> getProdutos() {
        return pratos;
    }

    public void setProdutos(List<Prato> pratos) {
        this.pratos = pratos;
    }
}
