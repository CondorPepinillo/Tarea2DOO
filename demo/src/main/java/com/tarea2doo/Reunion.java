package com.tarea2doo;

import java.time.Duration;
import java.time.Instant;
import java.util.Date;
import java.util.List;

public abstract class Reunion {
    Date fecha = new Date();
    Instant horaPrevista = Instant.now();
    Duration duracionPrevista = Duration.ofHours(1);
    Instant horaInicio = Instant.now();
    Instant horaFin = Instant.now();

    public abstract void setFecha(String fecha);

    public abstract void setHora(String hora);

    public abstract void setDuracionPrevista(int duracionPrevista);

    public abstract void setTipoReunion(int tipoReunion);

    public abstract void getTipoReunion();


    public abstract List obtenerAsistencias();

    public abstract List obtenerAusencias();

    public abstract List obtenerRetrasos();

    public abstract int obtenerTotalAsistencia();

    public abstract float obtenerPorcentajeAsistencia();

    public abstract void calcularTiempoReal();

    public abstract void iniciar();

    public abstract void finalizar();
}