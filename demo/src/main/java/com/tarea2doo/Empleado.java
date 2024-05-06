package com.tarea2doo;

public class Empleado {
    private String id;
    protected String nombre;
    private String apellido;
    private String correo;

    public Empleado(String id, String nombre, String apellido, String correo){
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
    }

}
