package com.tarea2doo;

import java.time.Instant;

public class Retraso extends Asistencia{
    Instant hora =Instant.now();

    public Instant getHora() {
        return hora;
    }
    public void setHora(Instant hora) {
        this.hora = hora;
    }
}