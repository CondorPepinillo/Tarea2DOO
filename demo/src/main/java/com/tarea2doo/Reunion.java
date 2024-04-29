package com.tarea2doo;

import java.time.Duration;
import java.time.Instant;
import java.util.Date;


public abstract class Reunion {
    Date fecha = new Date();
    Instant horaPrevista = Instant.now();
    Duration duracionPrevista = Duration.ofHours(1);
    Instant horaInicio = Instant.now();
    Instant horaFin = Instant.now();

}
