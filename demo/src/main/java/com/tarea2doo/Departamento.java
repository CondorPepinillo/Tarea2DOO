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
        cantidadEmpleados += 1;
    }

    public int obtenerCantidadEmpleados(){
        return cantidadEmpleados;
    }

    @Override
    public void invitar() {
        //Implementar lógica de la invitación
    }
}