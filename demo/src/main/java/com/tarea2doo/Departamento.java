package com.tarea2doo;
import java.util.ArrayList;

public class Departamento {
    ArrayList<String> EMPLEADOS_DEL_DEPARTAMENTO = new ArrayList<String>();
    private int CANTIDAD_EMPLEADOS = 0;

    public  Departamento(){

    }

    public  void  addEmpleado(Empleado empleado){
        EMPLEADOS_DEL_DEPARTAMENTO.add(empleado.nombre);
        CANTIDAD_EMPLEADOS += 1;
    }
}
