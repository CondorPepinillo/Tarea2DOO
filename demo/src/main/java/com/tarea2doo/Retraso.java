package com.tarea2doo;

import java.time.Instant;

public class Retraso extends Asistencia{
    private final Instant hora;
    public Retraso(Empleado empleado, Instant hora) {
        super(empleado);
        this.hora = hora;
    }
    public Instant getHora() {
        return hora;
    }
}