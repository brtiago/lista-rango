package dev.tiago.lista_rango.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.time.LocalTime;
import java.util.Map;

@Entity
public class Funcionamento extends Periodo {

    @Id
    private Long id;

    @ManyToOne
    Restaurant restaurant;

    DiaSemana dia;

    private LocalTime fechamento;

    private Map<DiaSemana, IntervaloTempo> horarios;
}
