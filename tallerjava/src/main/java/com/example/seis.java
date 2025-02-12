package com.example;

import java.util.Scanner;

public class seis {
    public static void main(String[] args) {
         try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Ingresa un número para mostrar su tabla de multiplicar: ");
        int numero = sc.nextInt();

        int contador = 1;

       
        System.out.println("Tabla de multiplicar del " + numero + ":");
        while (contador <= 10) {
            System.out.println(numero + " x " + contador + " = " + (numero * contador));
            contador++; 
        }

        sc.close();
        
        }

    }
    
}
