package com.example.demo.models;

public class Estudiante extends Persona{
    private String carrera;
    private String codigo;
    public Estudiante() {
    }
    public Estudiante(String codigo, String carrera) {
        this.codigo = codigo;
        this.carrera = carrera;
    }

    public Estudiante(String nombre, String apellido, int edad, String carrera, String codigo) {
        super(nombre, apellido, edad);
        this.carrera = carrera;
        this.codigo = codigo;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}   
