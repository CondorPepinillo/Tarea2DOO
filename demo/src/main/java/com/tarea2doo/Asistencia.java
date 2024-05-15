package com.tarea2doo;
/**
 * Clase Asistencia
 * Esta clase define los atributos y métodos de una asistencia.
 * Se encarga de gestionar la información de la asistencia, como el empleado que asiste.
 */
public class Asistencia {
    private final Empleado empleado; // Empleado que asiste a la reunión

    /**
     * Constructor de la clase Asistencia.
     * @param empleado
     */
    public Asistencia(Empleado empleado) {
        this.empleado = empleado; // Empleado que asiste a la reunión
    }

    /**
     * Devuelve el empleado que asiste a la reunión
     * @return
     */
    public Empleado getEmpleado() {
        return empleado; // Empleado que asiste a la reunión
    }

}