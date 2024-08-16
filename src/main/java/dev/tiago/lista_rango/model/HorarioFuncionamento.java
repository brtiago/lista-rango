package dev.tiago.lista_rango.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

@Entity
public class HorarioFuncionamento  {
    public HorarioFuncionamento() {
        horariosPorDia = new EnumMap<>(DayOfWeek.class);
    }

    Map<DayOfWeek, List<IntervaloTempo>> horariosPorDia;
    @Id
    private Long id;

    @ManyToOne
    Restaurant restaurant;

    public void adicionarHorario(DayOfWeek dia, LocalTime abertura, LocalTime fechamento) {
        horariosPorDia.computeIfAbsent(dia, k -> new ArrayList<>())
                .add(new IntervaloTempo(abertura, fechamento));
    }

    public List<IntervaloTempo> obterHorario(DayOfWeek dia) {
        return horariosPorDia.get(dia);
    }

}
