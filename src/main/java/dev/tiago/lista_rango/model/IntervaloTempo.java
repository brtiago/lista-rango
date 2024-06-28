package dev.tiago.lista_rango.model;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class IntervaloTempo {
    private final LocalDateTime horarioAbertura;
    private final LocalDateTime horarioFechamento;

    public IntervaloTempo(LocalDateTime horarioAbertura, LocalDateTime horarioFechamento) {
        this.horarioAbertura = horarioAbertura;
        this.horarioFechamento = horarioFechamento;
        validarIntervalo();
    }

    private void validarIntervalo() {
        if(!isIntervalValid(horarioAbertura) || !isIntervalValid(horarioFechamento)){
            throw new IllegalArgumentException("Os horários devem estar em intervalos de 15 minutos.");
        }
    }

    private boolean isIntervalValid(LocalDateTime dateTime) {
        int minutes = dateTime.getMinute();

        return minutes % 15 == 0;
    }

    public LocalDateTime getHorarioAbertura() {
        return horarioAbertura;
    }

    public LocalDateTime getHorarioFechamento() {
        return horarioFechamento;
    }
}
