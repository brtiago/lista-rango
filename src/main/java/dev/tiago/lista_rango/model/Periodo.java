package dev.tiago.lista_rango.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public abstract class Periodo {

    protected LocalDateTime abertura;
    protected LocalDateTime fechamento;

    protected LocalDateTime diaAbertura;
    protected LocalDateTime diaFechamento;
}
