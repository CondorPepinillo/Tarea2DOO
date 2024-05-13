package com.tarea2doo;

public class Empleado implements Invitable {
    private String id;
    private String nombre;
    private String apellido;
    private String correo;

    public Empleado(String id, String nombre, String apellido, String correo){
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getId() {
        return id;
    }

    public String getCorreo() {
        return correo;
    }

    @Override
    public void invitar() {

    }
}