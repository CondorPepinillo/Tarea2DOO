package com.tarea2doo;

import java.time.Duration;
import java.time.Instant;
import java.time.ZoneOffset;
import java.util.Date;
import java.util.List;

public abstract class Reunion {
    Date fecha = new Date();
    Instant horaPrevista = Instant.ofEpochMilli(1715571686000L);
    Duration duracionPrevista = Duration.ofHours(1);
    Instant horaInicio = Instant.ofEpochMilli(1715571686000L);
    Instant horaFin = Instant.ofEpochMilli(1715575286000L);

    public abstract List obtenerAsistencias();

    public abstract List obtenerAusencias();

    public abstract List obtenerRetrasos();

    public abstract int obtenerTotalAsistencia();

    public abstract float obtenerPorcentajeAsistencia();

    public abstract float calcularTiempoReal();

    public abstract void iniciar();

    public abstract void finalizar();

}