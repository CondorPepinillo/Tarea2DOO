package com.tarea2doo;

/**
 * Clase Nota
 * Esta clase define los atributos y métodos de una nota.
 * Se encarga de gestionar la información de una nota, como el contenido.
 */
public class Nota {
    
    private String contenido; // Contenido de la nota
    
    /**
     * Constructor de la clase Nota
     * @param contenido
     */
    public  Nota(String contenido){
        this.contenido = contenido;
    }

    /**
     * Devuelve el contenido de la nota
     * @return
     */
    public String getContenido() {
        return contenido;
    }
}