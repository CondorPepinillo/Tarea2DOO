package com.tarea2doo;

/**
 * Clase Ausencia
 * Esta clase define los atributos y métodos de una ausencia.
 * Se encarga de gestionar la información de una ausencia, como el empleado.
 */
public class Ausencia extends Asistencia{
    
    /**
     * Constructor de la clase Ausencia
     * @param empleado
     */
    public Ausencia(Empleado empleado) {
        super(empleado);
    }
}