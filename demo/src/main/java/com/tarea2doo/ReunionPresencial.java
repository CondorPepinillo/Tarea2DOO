package com.tarea2doo;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ReunionPresencial extends Reunion {
    private String sala;

    public ReunionPresencial(String sala, tipoReunion tipo, Date fecha, Instant horaPrevista, Duration duracionPrevista){
        super(tipo, fecha, horaPrevista, duracionPrevista);
        this.sala = sala;
    }
}
