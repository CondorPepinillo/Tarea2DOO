package com.tarea2doo;

import java.util.Scanner;

public class Organizador {

    public Reunion organizarReunion() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿La reunión será virtual o presencial? (1: Virtual, 2: Presencial)");
        int tipo = scanner.nextInt();

        Reunion reunion;
        if (tipo == 1) {
            System.out.println("Por favor, introduzca el enlace de la reunión:");
            String enlace = scanner.next();
            reunion = new ReunionVirtual(enlace);
        } else {
            System.out.println("Por favor, introduzca la sala de la reunión:");
            String sala = scanner.next();
            reunion = new ReunionPresencial(sala);
        }

        System.out.println("Por favor, introduzca la fecha de la reunión:");
        String fecha = scanner.next();
        reunion.setFecha(fecha);

        System.out.println("Por favor, introduzca la hora de la reunión:");
        String hora = scanner.next();
        reunion.setHora(hora);

        System.out.println("Por favor, introduzca la duración prevista de la reunión en minutos:");
        int duracionPrevista = scanner.nextInt();
        reunion.setDuracionPrevista(duracionPrevista);

        System.out.println("Por favor, introduzca el tipo de reunión (1: Técnica, 2: Marketing, 3: Otros):");
        int tipoReunion = scanner.nextInt();
        reunion.setTipoReunion(tipoReunion);

        System.out.println("Por favor, introduzca la lista de invitados (separados por comas):");
        String invitados = scanner.next();
        String[] listaInvitados = invitados.split(",");
        for (String invitado : listaInvitados) {
        }

        return reunion;
    }

    public void iniciarReunion(Reunion reunion) {
        reunion.iniciar();
    }
    public void finalizarReunion(Reunion reunion) {
        reunion.finalizar();
    }
    public void calcularTiempoRealReunion(Reunion reunion){
        reunion.calcularTiempoReal();
    }
}