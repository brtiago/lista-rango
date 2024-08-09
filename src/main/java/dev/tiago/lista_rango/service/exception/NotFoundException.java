package dev.tiago.lista_rango.service.exception;

public class NotFoundException extends BusinessException {

    public NotFoundException(String s) {
        super("Resource not found.");
    }
}
