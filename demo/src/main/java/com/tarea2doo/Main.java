package com.tarea2doo;
import java.time.Duration;
import java.time.Instant;
import java.util.Date;
import java.time.LocalTime;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("1","funlanito", "juarez"," fj@udec.cl");
        Empleado empleado2 = new Empleado("2","Pedro", "martinez"," pedroMar@hotmail.cl");
        Empleado empleado3 = new Empleado("3", "eduardo", "tapia", "eduTap@udec.cl");
        Empleado empleado4 = new Empleado("1","funlanito", "juarez"," fj@udec.cl");
        Empleado empleado5 = new Empleado("2","Pedro", "martinez"," pedroMar@hotmail.cl");
        Empleado empleado6 = new Empleado("3", "eduardo", "tapia", "eduTap@udec.cl");

        Departamento depa1 = new Departamento("depa1");


        depa1.addEmpleado(empleado4);
        depa1.addEmpleado(empleado5);
        depa1.addEmpleado(empleado6);

        System.out.println(depa1.getCantidadEmpleados());
        System.out.println(depa1.getCantidadEmpleados());

        Date hoy = new Date();
        Instant horaPrevista = Instant.now();

        LocalTime inicio = LocalTime.of(13, 0); // Hora de inicio
        LocalTime fin = LocalTime.of(14, 30);
        Duration duracion = Duration.between(inicio, fin);

        ReunionPresencial reunion1 = new ReunionPresencial("401",tipoReunion.MARKETING, hoy, horaPrevista, duracion);

        empleado1.invitar(reunion1);
        empleado2.invitar(reunion1);
        empleado3.invitar(reunion1);

        depa1.invitar(reunion1);

        Asistencia asiste1 = new Asistencia(empleado1);
        Ausencia noasiste1 = new Ausencia(empleado2);


        reunion1.obtenerAsistencias().add(asiste1);

        List<Asistencia> asistencias = reunion1.obtenerAsistencias();

        reunion1.iniciar(asistencias);

        System.out.println(reunion1.getTipoReunion());
        System.out.println(reunion1.getHora());
        System.out.println(reunion1.getInvitados());
        System.out.println(reunion1.obtenerAsistencias());
        System.out.println(reunion1.obtenerPorcentajeAsistencia()+"%");
        System.out.println(reunion1.obtenerAusencias());
        System.out.println(reunion1.obtenerRetrasos());
        System.out.println(" ");

        try {
            Thread.sleep(10000); // Pausa durante 60 minutos (1 segundo = 1000 milisegundos)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Retraso retraso1 = new Retraso(empleado3, Instant.now());
        reunion1.obtenerAsistencias().add(retraso1);
        reunion1.obtenerRetrasos().add(retraso1);

        System.out.println(reunion1.getTipoReunion());
        System.out.println(reunion1.getHora());
        System.out.println(reunion1.getInvitados());
        System.out.println(reunion1.obtenerAsistencias());
        System.out.println(reunion1.obtenerPorcentajeAsistencia()+"%");
        System.out.println(reunion1.obtenerAusencias());
        System.out.println(reunion1.obtenerRetrasos());
        System.out.println(" ");

        try {
            Thread.sleep(10000); // Pausa durante 60 minutos (1 segundo = 1000 milisegundos)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        reunion1.finalizar();
        reunion1.calcularTiempoReal();
    }
}