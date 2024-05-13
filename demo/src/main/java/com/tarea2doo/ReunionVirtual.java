package com.tarea2doo;

import java.util.List;

public class ReunionVirtual extends Reunion {
    private String enlace;

    public ReunionVirtual(String enlace){
        this.enlace = enlace;
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
        // Implementar lógica
    }

    @Override
    public void iniciar() {
        // Implementar lógica
    }

    @Override
    public void finalizar() {
        // Implementar lógica
    }
}