package com.tarea2doo;
import java.time.Instant;
import java.util.List;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ReunionVirtual extends Reunion {
    private String enlace;
    static long timestampini;
    static long timestampfin;
    static tipoReunion tipo;

    public ReunionVirtual(String enlace, tipoReunion tipo){
        this.enlace = enlace;
        this.tipo = tipo;
    }
    @Override
    public void getTipoReunion(){
        System.out.println("la reunion es de tipo: " + tipo);
    }

    @Override
    public List obtenerAsistencias() {
        // Implementar lógica
        return null;
    }

    @Override
    public List obtenerAusencias() {
        // Implementar lógica
        return null;
    }

    @Override
    public List obtenerRetrasos() {
        // Implementar lógica
        return null;
    }

    @Override
    public int obtenerTotalAsistencia() {
        // Implementar lógica
        return 0;
    }

    @Override
    public float obtenerPorcentajeAsistencia() {
        // Implementar lógica
        return 0;
    }

    @Override
    public void calcularTiempoReal() {
        System.out.println("la reunion duro " + (timestampfin - timestampini) +"segundos");
    }

    @Override
    public void iniciar() {
        horaInicio = Instant.now();
        ZoneId zoneId = ZoneId.systemDefault(); // Obtiene la zona horaria del sistema
        ZonedDateTime zonedDateTime = ZonedDateTime.ofInstant(horaInicio, zoneId); // Convierte a la zona horaria del sistema

        timestampini = horaInicio.getEpochSecond();
        System.out.println("Reunion iniciada a las: " + zonedDateTime);
    }

    @Override
    public void finalizar() {
        horaFin = Instant.now();
        ZoneId zoneId = ZoneId.systemDefault(); // Obtiene la zona horaria del sistema
        ZonedDateTime zonedDateTime = ZonedDateTime.ofInstant(horaFin, zoneId); // Convierte a la zona horaria del sistema

        timestampfin = horaFin.getEpochSecond();
        System.out.println("Reunion finalizada a las: " + zonedDateTime);
        // Implementar lógica
    }
}