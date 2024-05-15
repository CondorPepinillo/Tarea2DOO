package com.tarea2doo;

import java.util.ArrayList;

/**
 * Clase Departamento
 * Esta clase define los atributos y métodos de un departamento.
 * Se encarga de gestionar la información de los empleados del departamento, como el nombre y la cantidad de empleados.
 * Además, permite invitar a los empleados del departamento a una reunión.
 */
public class Departamento implements Invitable{
    private String nombre; // Nombre del departamento
    private ArrayList<Empleado> empleadosDelDepartamento = new ArrayList<>(); // Lista de empleados del departamento
    private int cantidadEmpleados = 0; // Cantidad de empleados del departamento

    /**
     * Constructor de la clase Departamento
     * @param nombre Nombre del departamento
     */
    public Departamento(String nombre){
        this.nombre = nombre; // Nombre del departamento
    }

    /**
     * Agregar un empleado al departamento
     * @param empleado
     */
    public void addEmpleado(Empleado empleado){
        empleadosDelDepartamento.add(empleado); // Agregar empleado al departamento
        cantidadEmpleados++; // Incrementar cantidad de empleados
    }

    /**
     * Devuelve el nombre del departamento
     * @return
     */
    public String getNombre() {
        return nombre; // Nombre del departamento
    }

    /**
     * Devuelve la cantidad de empleados del departamento
     * @return
     */
    public int getCantidadEmpleados() {
        return cantidadEmpleados; // Cantidad de empleados del departamento
    }

    /**
     * Invitar a los empleados del departamento a una reunión
     * @Override
     * @param reunion 
     */
    @Override
    public void invitar(Reunion reunion) {
        System.out.println("Invitando a los empleados del departamento " + nombre); // Invitar a los empleados del departamento
        reunion.addInvitado(new Invitacion(reunion, this)); // Agregar invitación al departamento
    }
}