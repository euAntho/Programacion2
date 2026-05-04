package com.uce;

import com.uce.Objetos.Persona;
import com.uce.funciones.Calculadora;
import com.uce.funciones.CalculadoraIMC;
import com.uce.funciones.ClaseEstatica;
import com.uce.funciones.implimentacion;

import java.util.Scanner;

import com.uce.Objetos.Alumno;
import com.uce.Objetos.Book;

public class Main {

    public static void main(String[] args) {
       

        /*implimentacion classimplementacion = new implimentacion();
        classimplementacion.stop=5;
        int factorial = classimplementacion.factorial();

        System.out.println("El factorial es: "+factorial);*/

       // Persona juan = new Persona();
        //juan.nombre ="Juan";
        //juan.apelido = "Perez";
        //juan.edad = 30;
        //juan.dinero = 40;

        //juan.dinero =30;
        //juan.setnombre(nombre: "Carlos");

        //Persona pedro = new Persona();
        //pedro.nombre = "Pedro";
        //pedro.apelido = "Gomez";
        //pedro.edad = 25;
        //pedro.dinero = 50;//


       /* Alumno Alumno1 = new Alumno();

        System.out.println(Alumno1.getNombre());

        Alumno Alumno2 = new Alumno("josias", 2350535254L, 22, 1.72, 80.0);
        System.out.println(Alumno2.getNombre());

        Alumno Alumno3 = new Alumno("josias", 2350535254L, 22, 1.72, 80);
        System.out.println(Alumno2.getNombre());


        CalculadoraIMC Calculadora = new CalculadoraIMC();
        System.out.println( Calculadora.CalcularIMC(Alumno2.getPeso(), Alumno2.getEstatura()));

        System.out.println(80/1.72 );*/



 
        /*System.out.println(ClaseEstatica.atributoEstatico);
        ClaseEstatica claseEstatica = new ClaseEstatica();
        claseEstatica.metodoEstatico();

        Book libro1 = new Book();

        System.out.println(ClaseEstatica.atributoEstatico);*/

        Scanner sc = new Scanner(System.in);
        Calculadora calc = new Calculadora();

        System.out.println("Ingrese el primer número: ");
        double a = sc.nextDouble();

         System.out.println("Ingrese el segundo número: ");
        double b = sc.nextDouble();

        System.out.println("Elija la operacion: ");

        System.out.println("Suma: " + calc.suma(a, b));
        System.out.println("Resta: " + calc.resta(a, b));
        System.out.println("Multiplicación: " + calc.multiplicacion(a, b));
        System.out.println("División: " + calc.dividir(a, b));

        System.out.println("PI: " + calc.Pi());
        System.out.println("Euler: " + calc.Euler());

        System.out.print("Ingrese un número entero para factorial: ");
        int n = sc.nextInt();

        System.out.println("Factorial: " + calc.factorial(n));

    }
}