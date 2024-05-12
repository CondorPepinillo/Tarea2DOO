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

    @Override
    public void invitar() {
        //Implementar lógica de la invitación
    }
}