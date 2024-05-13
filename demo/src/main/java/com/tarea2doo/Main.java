package com.tarea2doo;

public class Main {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("1","funlanito", "juarez"," fj@udec.cl");
        Departamento depa1 = new Departamento("depa1");
        System.out.println(depa1.obtenerCantidadEmpleados());
        depa1.addEmpleado(empleado1);
        System.out.println(depa1.obtenerCantidadEmpleados());
    }
}