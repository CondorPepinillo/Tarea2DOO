package com.tarea2doo;

/**
 * Clase Empleado
 * Esta clase define los atributos y métodos de un empleado.
 * Se encarga de gestionar la información de un empleado, como el nombre, apellido, correo y id.
 * Además, permite invitar a un empleado a una reunión.
 * @implements Invitable
 */
public class Empleado implements Invitable {
    private String id; // Id del empleado
    private String nombre; // Nombre del empleado
    private String apellido; // Apellido del empleado
    private String correo; // Correo del empleado

    /**
     * Constructor de la clase Empleado
     * @param id Id del empleado
     * @param nombre Nombre del empleado
     * @param apellido Apellido del empleado
     * @param correo Correo del empleado
     */
    public Empleado(String id, String nombre, String apellido, String correo){
        this.id = id; // Id del empleado
        this.nombre = nombre; // Nombre del empleado
        this.apellido = apellido; // Apellido del empleado
        this.correo = correo; // Correo del empleado
    }

    /**
     * Devuelve el nombre del empleado
     * @return
     */
    public String getNombre() {
        return nombre; // Nombre del empleado
    }

    /**
     * Devuelve el apellido del empleado
     * @return
     */
    public String getApellido() {
        return apellido; // Apellido del empleado
    }
    
    /**
     * Devuelve el id del empleado
     * @return
     */
    public String getId() {
        return id; // Id del empleado
    }

    /**
     * Devuelve el correo del empleado
     * @return
     */
    public String getCorreo() {
        return correo; // Correo del empleado
    }

    /**
     * Invitar a un empleado a una reunión
     * @Override
     * @param reunion
     */
    @Override
    public void invitar(Reunion reunion) {
        System.out.println("Invitado: " + nombre + " " + apellido + " " + correo); // Invitar a un empleado a una reunión
        reunion.addInvitado(new Invitacion(reunion, this)); // Invitar a un empleado a una reunión
    }

}