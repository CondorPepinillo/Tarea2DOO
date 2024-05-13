package com.tarea2doo;

import java.util.List;

public class ReunionPresencial extends Reunion {
    private String sala;

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
    public float calcularTiempoReal() {
        // Implementar lógica
        return 0;
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