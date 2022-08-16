package com.ciclo3.proyecto;

public class Empleado {

    //Atributos
    private String nombreEmpleado;
    private String correoEmpleado;

    //Constructores
    public Empleado() {
    }

    public Empleado(String nombreEmpleado, String correoEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
        this.correoEmpleado = correoEmpleado;
    }

    //Getters and Setters
    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getCorreoEmpleado() {
        return correoEmpleado;
    }

    public void setCorreoEmpleado(String correoEmpleado) {
        this.correoEmpleado = correoEmpleado;
    }
}
