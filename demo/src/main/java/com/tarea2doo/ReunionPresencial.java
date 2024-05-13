package com.tarea2doo;

import java.time.Instant;
import java.util.List;

public class ReunionPresencial extends Reunion {
    private String sala;
    static long timestampini;
    static long timestampfin;

    public ReunionPresencial(String sala){
        this.sala = sala;
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
        timestampini = horaInicio.getEpochSecond();
        System.out.println("Reunion iniciada");
        // Implementar lógica
    }

    @Override
    public void finalizar() {
        horaFin = Instant.now();
        timestampfin = horaFin.getEpochSecond();
        System.out.println("Reunion finalizada");
        // Implementar lógica
    }
}