package com.tarea2doo;

public class Main {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("1","funlanito", "juarez"," fj@udec.cl");
        Departamento depa1 = new Departamento("depa1");
        System.out.println(depa1.obtenerCantidadEmpleados());
        depa1.addEmpleado(empleado1);
        System.out.println(depa1.obtenerCantidadEmpleados());
        ReunionPresencial reunion1 = new ReunionPresencial("sala1");

        Organizador orga1 = new Organizador();
        Reunion reunion = orga1.organizarReunion();

        orga1.iniciarReunion(reunion);


        try {
            Thread.sleep(10000); // Pausa durante 10 segundos (1 segundo = 1000 milisegundos)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        orga1.finalizarReunion(reunion);
        orga1.calcularTiempoRealReunion(reunion);
    }
}