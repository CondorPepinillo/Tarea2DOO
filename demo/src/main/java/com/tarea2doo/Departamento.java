package com.tarea2doo;
import java.util.ArrayList;

public class Departamento {
    ArrayList<Empleado> empleadosDelDepartamento = new ArrayList<Empleado>();
    private int cantidadDeEmpleados = 0;

    public  Departamento(){

    }

    public  void  addEmpleado(Empleado empleado){
        empleadosDelDepartamento.add(empleado);
        cantidadDeEmpleados += 1;
    }
}
