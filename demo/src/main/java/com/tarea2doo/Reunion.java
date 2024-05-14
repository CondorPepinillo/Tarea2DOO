package com.tarea2doo;

import java.time.Duration;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.List;

public abstract class Reunion {
    private final Date fecha;
    private final Instant horaPrevista;
    private final Duration duracionPrevista;
    private Instant horaInicio;
    private Instant horaFin;

    static long timestampini;
    static long timestampfin;
    static tipoReunion tipo;

    public  Reunion(tipoReunion tipo, Date fecha, Instant horaPrevista, Duration duracionPrevista){
        this.tipo = tipo;
        this.fecha = fecha;
        this.horaPrevista = horaPrevista;
        this.duracionPrevista = duracionPrevista;
    }


    public tipoReunion getTipoReunion(){
        return  tipo;
    };


    public List obtenerAsistencias() {
        return null;
    }


    public List obtenerAusencias() {
        // Implementar lógica
        return null;
    }


    public List obtenerRetrasos() {
        // Implementar lógica
        return null;
    }


    public int obtenerTotalAsistencia() {
        // Implementar
        return obtenerAsistencias().size();
    }


    public float obtenerPorcentajeAsistencia() {
        // Implementar lógica
        return 0;
    }


    public void calcularTiempoReal() {
        System.out.println("la reunion duro " + (timestampfin - timestampini) +"segundos");
    }

    public void iniciar() {
        horaInicio = Instant.now();
        ZoneId zoneId = ZoneId.systemDefault(); // Obtiene la zona horaria del sistema
        ZonedDateTime zonedDateTime = ZonedDateTime.ofInstant(horaInicio, zoneId); // Convierte a la zona horaria del sistema

        timestampini = horaInicio.getEpochSecond();
        System.out.println("Reunion iniciada a las: " + zonedDateTime);
    }


    public void finalizar() {
        horaFin = Instant.now();
        ZoneId zoneId = ZoneId.systemDefault(); // Obtiene la zona horaria del sistema
        ZonedDateTime zonedDateTime = ZonedDateTime.ofInstant(horaFin, zoneId); // Convierte a la zona horaria del sistema

        timestampfin = horaFin.getEpochSecond();
        System.out.println("Reunion finalizada a las: " + zonedDateTime);

    }
}