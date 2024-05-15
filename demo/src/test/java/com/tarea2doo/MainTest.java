package com.tarea2doo;

import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    Empleado empleado1 = new Empleado("1","funlanito", "juarez"," fj@udec.cl");
    Empleado empleado2 = new Empleado("2","Pedro", "martinez"," pedroMar@hotmail.cl");
    Empleado empleado3 = new Empleado("3", "eduardo", "tapia", "eduTap@udec.cl");
    Empleado empleado4 = new Empleado("1","funlanito", "juarez"," fj@udec.cl");
    Empleado empleado5 = new Empleado("2","Pedro", "martinez"," pedroMar@hotmail.cl");
    Empleado empleado6 = new Empleado("3", "eduardo", "tapia", "eduTap@udec.cl");

    Departamento depa1 = new Departamento("depa1");

    Date hoy = new Date();
    Instant horaPrevista = Instant.now();

    LocalTime inicio = LocalTime.of(13, 0); // Hora de inicio
    LocalTime fin = LocalTime.of(14, 30);
    Duration duracion = Duration.between(inicio, fin);

    ReunionPresencial reunion1 = new ReunionPresencial("401",tipoReunion.MARKETING, hoy, horaPrevista, duracion);

    @Test
    void CantidadDeEmpleadosCaso3Empleados(){
        depa1.addEmpleado(empleado4);
        depa1.addEmpleado(empleado5);
        depa1.addEmpleado(empleado6);

        assertEquals(3, depa1.getCantidadEmpleados());
    }

    @Test
    void getTipoReunion(){
        assertEquals(tipoReunion.MARKETING, reunion1.getTipoReunion());
    }
    @Test
    void PorcentajeAsistencias(){

        empleado1.invitar(reunion1);
        empleado2.invitar(reunion1);
        empleado3.invitar(reunion1);

        depa1.addEmpleado(empleado4);
        depa1.addEmpleado(empleado5);
        depa1.addEmpleado(empleado6);
        depa1.invitar(reunion1);

        Asistencia asiste1 = new Asistencia(empleado1);
        Ausencia noasiste1 = new Ausencia(empleado2);


        reunion1.obtenerAsistencias().add(asiste1);

        List<Asistencia> asistencias = reunion1.obtenerAsistencias();

        assertEquals("16,666668", String.format("%.6f", reunion1.obtenerPorcentajeAsistencia()));
    }

}