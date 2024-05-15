package com.tarea2doo;

import java.time.Instant;

/**
 * Clase Invitacion
 * Esta clase define los atributos y métodos de una invitación.
 * Se encarga de gestionar la información de una invitación, como la hora, la reunión y el invitado.
 */
public class Invitacion{
    private Instant hora;
    private Reunion reunion;
    private Invitable invitable;

    /**
     * Constructor de la clase Invitacion
     * @param hora Hora de la invitación
     * @param reunion Reunión a la que se invita
     * @param invitable Invitable al que se invita
     */
    public Invitacion(Reunion reunion, Invitable invitable){
        this.hora = reunion.getHora();
        this.reunion = reunion;
        this.invitable = invitable;
    }

    /**
     * Devuelve la hora de la invitación
     * @return
     */
    public Instant getHora() {
        return hora;
    }

    /**
     * Devuelve el invitado
     * @return
     */
    public Invitable getInvitable() {
        return invitable;
    }

    /**
     * Devuelve la reunión
     * @return
     */
    public Reunion getReunion() {
        return reunion;
    }
}