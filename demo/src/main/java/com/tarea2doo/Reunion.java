package com.tarea2doo;

import java.time.Duration;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;

/**
 *  Clase abstracta Reunion
 *  Esta clase define los atributos y métodos de una reunión.
 * Se encarga de gestionar la información de la reunión, como la fecha, hora, duración, invitados, asistencias, etc.
 * Además, permite iniciar y finalizar la reunión, así como calcular el tiempo real de la reunión.
 */
public abstract class Reunion {
    private final Date fecha; // Fecha de la reunión
    private final Instant horaPrevista; // Hora prevista de la reunión
    private final Duration duracionPrevista; // Duración prevista de la reunión
    private Instant horaInicio; // Hora de inicio de la reunión
    private Instant horaFin; // Hora de fin de la reunión
    private List<Invitacion> invitados; // Lista de invitados a la reunión
    private List<Asistencia> asistencias; // Lista de asistencias a la reunión

    static long timestampini; // Timestamp de inicio de la reunión
    static long timestampfin; // Timestamp de fin de la reunión
    static tipoReunion tipo; // Tipo de la reunión

    /**
     * Constructor de la clase Reunion.
     * @param tipo Tipo de la reunión
     * @param fecha Fecha de la reunión
     * @param horaPrevista Hora prevista de la reunión
     * @param duracionPrevista Duración prevista de la reunión
     */
    public  Reunion(tipoReunion tipo, Date fecha, Instant horaPrevista, Duration duracionPrevista){
        this.tipo = tipo;
        this.fecha = fecha;
        this.horaPrevista = horaPrevista;
        this.duracionPrevista = duracionPrevista;
        this.invitados = new ArrayList<Invitacion>();
        this.asistencias = new ArrayList<Asistencia>();
    }


    /**
     * Devuelve el tipo de la reunión
     * @return Tipo de la reunión
     */
    public tipoReunion getTipoReunion(){
        return  tipo;
    };



    /**
     * Devuelve la lista de asistencias a la reunión
     * @return Lista de asistencias
     */
    public List<Asistencia> obtenerAsistencias() {
        return asistencias; // Devuelve la lista de asistencias
    }

    /**
     * Devuelve la lista de ausencias a la reunión
     * @return Lista de ausencias
     */
    public List obtenerAusencias() {
        return null; // FALTA IMPLEMENTAR
    }

    /**
     * Devuelve la cantidad total de asistencias a la reunión
     * @return Cantidad total de asistencias
     */
    public int obtenerTotalAsistencia() {
        return obtenerAsistencias().size(); // Devuelve la cantidad total de asistencias
    }

    /**
     * Devuelve la cantidad de retrasos a la reunión
     * @return Cantidad de retrasos
     */
    public List obtenerRetrasos() {
        return null; // FALTA IMPLEMENTAR
    }

    /**
     * Devuelve el porcentaje de asistencia a la reunión
     * @return Porcentaje de asistencia
     */
    public float obtenerPorcentajeAsistencia() {
        return 0; // FALTA IMPLEMENTAR
    }


    /**
     * Calcula el tiempo real de la reunión
     */
    public void calcularTiempoReal() {
        System.out.println("la reunion duro " + (timestampfin - timestampini) +"segundos"); // Calcula el tiempo real de la reunión
    }

    /**
     * Inicia la reunión
     * @param asistencias
     */
    public void iniciar(List<Asistencia> asistencias) {
        ZoneId zoneId = ZoneId.systemDefault(); // Obtiene la zona horaria del sistema
        ZonedDateTime zonedDateTime = ZonedDateTime.ofInstant(horaInicio, zoneId); // Convierte a la zona horaria del sistema
        horaInicio = Instant.now(); // Define la hora de inicio de la reunión
        this.asistencias = asistencias; // Asigna la lista de asistencias
        timestampini = horaInicio.getEpochSecond(); // Obtiene el timestamp de inicio de la reunión
        System.out.println("Reunion iniciada a las: " + zonedDateTime); // Imprime la hora de inicio de la reunión
    }

    /**
     * Finaliza la reunión
     */
    public void finalizar() {
        ZoneId zoneId = ZoneId.systemDefault(); // Obtiene la zona horaria del sistema
        ZonedDateTime zonedDateTime = ZonedDateTime.ofInstant(horaFin, zoneId); // Convierte a la zona horaria del sistema
        horaFin = Instant.now(); // Define la hora de fin de la reunión
        timestampfin = horaFin.getEpochSecond(); // Obtiene el timestamp de fin de la reunión
        System.out.println("Reunion finalizada a las: " + zonedDateTime); // Imprime la hora de fin de la reunión
    }

    /**
     * Devuelve la hora prevista de la reunión
     * @return
     */
    public Instant getHora() {
        return horaPrevista; // Devuelve la hora prevista de la reunión
    }

    /**
     * Agrega un invitado a la reunión
     * @param invitado
     */
    public void addInvitado(Invitacion invitado) {
        invitados.add(invitado); // Agrega el invitado a la lista de invitados
    }

    /**
     * Devuelve la lista de invitados a la reunión
     * @return
     */
    public List<Invitacion> getInvitados() {
        return invitados; // Devuelve la lista de invitados
    }

}