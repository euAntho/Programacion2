package com.uce.Objetos;

public class Persona {
    
    public String nombre;
    public String apelido;
    public int edad;
    public int dinero;

    public void setNombre(String nombre) {
       System.out.println("Hola mi nombre ahora es: "+nombre);
       this.nombre=nombre;
    }

     public void hablar() {
        System.out.println("Hola mi nombre es: "+nombre);
    }

    public void Deciredad(){
        System.out.println("Tengo "+edad+" años");
    }

    
}
