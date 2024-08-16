package dev.tiago.lista_rango.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalTime;

@Entity
public class IntervaloTempo {
    private LocalTime abertura;
    private LocalTime fechamento;

    @Id
    private Long id;

    public IntervaloTempo(LocalTime abertura, LocalTime fechamento) {
        this.abertura = abertura;
        this.fechamento = fechamento;
    }

    public LocalTime getAbertura() {
        return abertura;
    }

    public LocalTime getFechamento() {
        return fechamento;
    }

    private void validateTimeIntervals() {
        if (abertura == null || fechamento == null) {
            throw new IllegalArgumentException("Os horários de abertura e fechamento não podem ser nulos.");
        }

        if (!isValidTimeInterval(abertura) || !isValidTimeInterval(fechamento)) {
            throw new IllegalArgumentException("Os horários de abertura e fechamento devem estar alinhados com intervalos de 15 minutos.");
        }
    }

    private boolean isValidTimeInterval(LocalTime time) {
        // Verifica se os minutos estão alinhados com o intervalo de 15 minutos
        return time.getMinute() % 15 == 0;
    }

}
