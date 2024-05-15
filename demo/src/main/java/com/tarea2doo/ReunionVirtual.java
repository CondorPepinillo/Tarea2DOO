package com.tarea2doo;

import java.time.Duration;
import java.time.Instant;
import java.util.Date;

/**
 * Clase ReunionVirtual
 * Esta clase define los atributos y métodos de una reunión virtual.
 * Se encarga de gestionar la información de una reunión virtual, como el enlace.
 */
public class ReunionVirtual extends Reunion {
    private String enlace; // Enlace de la reunión

    /**
     * Constructor de la clase ReunionVirtual
     * @param enlace
     * @param tipo
     * @param fecha
     * @param horaPrevista
     * @param duracionPrevista
     */
    public ReunionVirtual(String enlace, tipoReunion tipo, Date fecha, Instant horaPrevista, Duration duracionPrevista){
        super(tipo, fecha, horaPrevista, duracionPrevista);
        this.enlace = enlace;
    }

}