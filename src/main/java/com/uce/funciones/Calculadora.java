package com.uce.funciones;

public class Calculadora {

    public double suma(double a,double  b){
        return a+b;
    }
    
    public double resta(double a,double b){
        return a-b;
    }

    public double multiplicacion(double a,double b){
        return a+b;
    }

    public double dividir(double a, double b) {
        return a/b;
    }

        public  static final double Pi =  Math.PI;

    public static final double Euler = Math.E; 

    public static long factorial(int n) {
        if(n<0){
            throw new IllegalArgumentException("No existe factorial de negativos");
        }

        long resultado =1;
        for (int i=1; i<=n; i++){
            resultado *=i;
        }
        return resultado;
    }

