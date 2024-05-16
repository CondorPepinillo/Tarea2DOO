package com.tarea2doo;
import java.time.Duration;
import java.time.Instant;
import java.util.Date;

/**
 * Clase ReunionPresencial
 * Esta clase define los atributos y métodos de una reunión presencial.
 * Se encarga de gestionar la información de una reunión presencial, como la sala.
 */
public class ReunionPresencial extends Reunion {
    private String sala; // Sala de la reunión

    /**
     * Constructor de la clase ReunionPresencial
     * @param sala
     * @param tipo
     * @param fecha
     * @param horaPrevista
     * @param duracionPrevista
     */
    public ReunionPresencial(String sala, tipoReunion tipo, Date fecha, Instant horaPrevista, Duration duracionPrevista){
        super(tipo, fecha, horaPrevista, duracionPrevista);
        this.sala = sala;
    }

    String getSala(){
        return sala;
    }
}
