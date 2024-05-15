package com.tarea2doo;

import java.time.Instant;

/**
 * Clase Retraso
 * Esta clase define los atributos y métodos de un retraso.
 * Se encarga de gestionar la información de un retraso, como la hora.
 */
public class Retraso extends Asistencia{
    private final Instant hora; // Hora del retraso
    
    /**
     * Constructor de la clase Retraso
     * @param empleado
     * @param hora
     */
    public Retraso(Empleado empleado, Instant hora) {
        super(empleado);
        this.hora = hora;
    }

    /**
     * Devuelve la hora del retraso
     * @return
     */
    public Instant getHora() {
        return hora;
    }
}