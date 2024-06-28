package dev.tiago.lista_rango.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.time.LocalTime;
import java.util.Map;

@Entity
public class HorarioFuncionamento {

    @Id
    private Long id;

    @ManyToOne
    Restaurante restaurante;

    DiaSemana dia;

    private LocalTime aberturaa;

    private LocalTime fechamento;

    private Map<DiaSemana, IntervaloTempo> horarios;
}
