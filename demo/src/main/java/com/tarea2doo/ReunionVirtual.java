package com.tarea2doo;

import java.time.Duration;
import java.time.Instant;
import java.util.Date;

public class ReunionVirtual extends Reunion {
    private String enlace;

    public ReunionVirtual(String enlace, tipoReunion tipo, Date fecha, Instant horaPrevista, Duration duracionPrevista){
        super(tipo, fecha, horaPrevista, duracionPrevista);
        this.enlace = enlace;
    }

}