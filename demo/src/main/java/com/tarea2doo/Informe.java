package com.tarea2doo;

import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.time.Duration;
import java.time.ZoneOffset;
import java.util.Date;
import java.util.SplittableRandom;

/**
 * Clase Informe
 * Esta clase define los atributos y métodos de un informe.
 * Se encarga de gestionar la información presente en el informes además de crearlos.
 * La informacion presente en los informes con respecto a la reunion es: sala o enlace, fecha, hora, y duración previstas, notas relacionadas a la reunión, inicio, termino, y duración real de la reunión y empleados invitados, asistentes, retrasados, y ausentes.
 */
public class Informe {
    String DatosIniReunion ="";
    String Notas="";
    String horaDeInicio="";
    String duracionReunion="";
    String horaDeFin="";
    String Invitados= "";
    String Asistentes="";
    String Retrasados="";
    String Ausencias="";

    /**
     * Constructor de la clase Informe.
     * @param reunion reunión de la cual se hara el informe
     * @param path Ruta en la cual se creara el INFORME.txt
     */
    public Informe(Reunion reunion, String path){
        File file = new File(path);
        /**
         * Datos de la planeación de la reunion: sala o enlace, tipo de reunion(MARKETING, TECNICA U OTRA), fecha, hora prevista y duracion prevista
         */
        if (reunion instanceof ReunionPresencial) {
            DatosIniReunion += "SALA: "+ ((ReunionPresencial) reunion).getSala() + "\n" +
                    "TIPO DE REUNION: " + reunion.getTipoReunion() + "\n" +
                    "FECHA: " +  reunion.getFecha().getDate() + "/" + (reunion.getFecha().getMonth()+1) + "/" + (reunion.getFecha().getYear() + 1900)+ "\n" +
                    "HORA PREVISTA: " + reunion.getHora().atZone(ZoneOffset.systemDefault()).getHour() + ":"+ reunion.getHora().atZone(ZoneOffset.systemDefault()).getMinute() + "\n" +
                    "DURACION PREVISTA: " + reunion.getDuracionPrevista() + "\n";
        }
        else {
            DatosIniReunion += "ENLACE: "+ ((ReunionVirtual) reunion).getEnlace() + "\n" +
                    "TIPO DE REUNION: " + reunion.getTipoReunion() + "\n" +
                    "FECHA: " +  reunion.getFecha().getDate() + "/" + (reunion.getFecha().getMonth()+1) + "/" + (reunion.getFecha().getYear() + 1900)+ "\n" +
                    "HORA PREVISTA: " + reunion.getHora().atZone(ZoneOffset.systemDefault()).getHour() + ":"+ reunion.getHora().atZone(ZoneOffset.systemDefault()).getMinute() + "\n" +
                    "DURACION PREVISTA: " + reunion.getDuracionPrevista() + "\n";
        }

        /**
         * Se agregan todas las notas que esten relacionadas a la reunión
         */
        for(int i = 0; i < reunion.getNotas().size(); i++){
            Notas += reunion.getNotas().get(i).getContenido() + "\n";
        }

        /**
         * Momentos en los que realmente comenzo y terminó la reunion ademas de cuanto duró.
         */
        horaDeInicio += reunion.getHoraInicio().atZone(ZoneOffset.systemDefault());
        horaDeFin += reunion.getHoraFin().atZone(ZoneOffset.systemDefault());
        duracionReunion += "la reunion duro " + (reunion.timestampfin - reunion.timestampini) + "segundos";

        /**
         * La informacion de los invitados a la reunión.
         */
        for(int i = 0; i < reunion.getInvitados().size(); i++){
            Invitados += reunion.getInvitados().get(i).getDatosEmpleado().getId() +" "+ reunion.getInvitados().get(i).getDatosEmpleado().getNombre() +" "+
                    reunion.getInvitados().get(i).getDatosEmpleado().getApellido() +" "+ reunion.getInvitados().get(i).getDatosEmpleado().getCorreo()+ "\n";
        }

        /**
         * La informacion de los que asistieron a la reunión
         */
        for(int i = 0; i < reunion.obtenerAsistencias().size(); i++){
            Asistentes += reunion.obtenerAsistencias().get(i).getEmpleado().getId() + " " + reunion.obtenerAsistencias().get(i).getEmpleado().getNombre() +" "+
                    reunion.obtenerAsistencias().get(i).getEmpleado().getApellido() + " " + reunion.obtenerAsistencias().get(i).getEmpleado().getCorreo() + "\n";
        }

        /**
         * La informacion de los que llegaron atrasados a la reunión.
         */
        for(int i = 0; i < reunion.obtenerRetrasos().size(); i++){
            Retrasados += reunion.obtenerRetrasos().get(i).getEmpleado().getId() + " " + reunion.obtenerRetrasos().get(i).getEmpleado().getNombre() +" "+
                    reunion.obtenerRetrasos().get(i).getEmpleado().getApellido() + " " + reunion.obtenerRetrasos().get(i).getEmpleado().getCorreo() + "\n";
        }
        /**
         * La informacion de los que se ausentaron de la reunión
         */
        for (int i = 0; i < reunion.obtenerAusencias().size(); i++){
            Ausencias += reunion.obtenerAusencias().get(i).getEmpleado().getId() + " " + reunion.obtenerAusencias().get(i).getEmpleado().getNombre() +" "+
                    reunion.obtenerAusencias().get(i).getEmpleado().getApellido() + " " + reunion.obtenerAusencias().get(i).getEmpleado().getCorreo() + "\n";
        }
        /**
         * Escribiendo en el informe todo lo antes dicho
         */
        try {
            file.createNewFile();
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Reunion\n");
            bw.write("Datos iniciales de la reunion: \n" + DatosIniReunion);
            bw.write("\n");

            bw.write("NOTAS:\n");
            bw.write(Notas+"\n");

            bw.write("INICIO DE LA REUNION:\n");
            bw.write(horaDeInicio+"\n\n");

            bw.write("LA REUNION TERMINO: \n");
            bw.write(horaDeFin+"\n\n");

            bw.write("DURACIÓN DE LA REUNION: \n");
            bw.write(duracionReunion + "\n\n");

            bw.write("INVITADOS:\n");
            bw.write(Invitados + "\n\n");

            bw.write("ASISTENTES:\n");
            bw.write(Asistentes + "\n\n");

            bw.write("RETRASOS:\n");
            bw.write(Retrasados + "\n\n");

            bw.write("AUSENCIAS:\n");
            bw.write(Ausencias + "\n\n");

            bw.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
