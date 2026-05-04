package com.uce.funciones;

public class implimentacion {
        
     public int stop=0;

    public int factorial() {

        int factorial =1;

        for(int i=2; i<stop; i++){
            factorial = factorial * i;
        }
        
        return factorial;
    }
}
