package com.tarea2doo;

import java.time.Instant;

public class Invitacion{
    private Instant hora;
    private Reunion reunion;
    private Invitable invitable;

    public Invitacion(Reunion reunion, Invitable invitable){
        this.hora = reunion.getHora();
        this.reunion = reunion;
        this.invitable = invitable;
    }

    public Instant getHora() {
        return hora;
    }
    public Invitable getInvitable() {
        return invitable;
    }
    public Reunion getReunion() {
        return reunion;
    }
}