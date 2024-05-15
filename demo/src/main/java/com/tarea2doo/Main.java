package com.tarea2doo;
import java.time.Duration;
import java.time.Instant;
import java.util.Date;
import java.time.LocalTime;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("1","funlanito", "juarez"," fj@udec.cl");
        Departamento depa1 = new Departamento("depa1");

        System.out.println(depa1.getCantidadEmpleados());
        depa1.addEmpleado(empleado1);
        System.out.println(depa1.getCantidadEmpleados());

        Date hoy = new Date();
        Instant horaPrevista = Instant.now();

        LocalTime inicio = LocalTime.of(13, 0); // Hora de inicio
        LocalTime fin = LocalTime.of(14, 30);
        Duration duracion = Duration.between(inicio, fin);

        ReunionPresencial reunion1 = new ReunionPresencial("401",tipoReunion.MARKETING, hoy, horaPrevista, duracion);

        depa1.invitar(reunion1);

        List<Asistencia> asistencias = reunion1.obtenerAsistencias();

        reunion1.iniciar(asistencias);

        System.out.println(reunion1.getTipoReunion());


        try {
            Thread.sleep(650000); // Pausa durante 60 minutos (1 segundo = 1000 milisegundos)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        reunion1.finalizar();
        reunion1.calcularTiempoReal();
    }
}