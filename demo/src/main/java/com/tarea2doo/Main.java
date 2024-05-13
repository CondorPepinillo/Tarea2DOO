package com.tarea2doo;

public class Main {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("1","funlanito", "juarez"," fj@udec.cl");
        Departamento depa1 = new Departamento("depa1");
        System.out.println(depa1.obtenerCantidadEmpleados());
        depa1.addEmpleado(empleado1);
        System.out.println(depa1.obtenerCantidadEmpleados());
        ReunionPresencial reunion1 = new ReunionPresencial("sala1");
        reunion1.iniciar();
        try {
            Thread.sleep(10000); // Pausa durante 1 segundo (1000 milisegundos)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        reunion1.finalizar();
        reunion1.calcularTiempoReal();
    }
}