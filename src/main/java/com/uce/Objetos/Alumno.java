package com.uce.Objetos;
import lombok.Getter;
import lombok.Setter;


public class Alumno {

    @Getter @Setter
    private String nombre;
     @Getter @Setter
    private long ci;
     @Getter @Setter
    private int edad;
     @Getter @Setter
    private double estatura;
    @Getter @Setter
    private int peso;

    public Alumno() {
        this.nombre = "sin nombre";
        this.edad = 1;
        this.estatura = 1;
    }

    public Alumno(String nombre, long ci, int edad, double estatura, double peso) {
        this.nombre = nombre;
        this.ci = ci;
        this.edad = edad;
        this.estatura = estatura;
        this.peso = peso;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }
    
    public double estaturaEnMetros() {

        return estatura/100;
    }

    public double pesoEnKilos() {

        return peso;
    }




    



}
