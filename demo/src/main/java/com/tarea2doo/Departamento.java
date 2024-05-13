package com.tarea2doo;

import java.util.ArrayList;

public class Departamento implements Invitable{
    private String nombre;
    private ArrayList<Empleado> empleadosDelDepartamento = new ArrayList<>();
    private int cantidadEmpleados = 0;

    public Departamento(String nombre){
        this.nombre = nombre;
    }

    public void addEmpleado(Empleado empleado){
        empleadosDelDepartamento.add(empleado);
        cantidadEmpleados++;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidadEmpleados() {
        return cantidadEmpleados;
    }

    @Override
    public void invitar() {
        System.out.println("Invitando a los empleados del departamento " + nombre);
        for (Empleado empleado : empleadosDelDepartamento) {
            empleado.invitar();
        }
    }
}