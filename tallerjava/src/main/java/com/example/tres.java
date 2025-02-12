package com.example;

import java.util.Scanner;

public class tres{
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Por favor, ingresa tu nombre: ");
            String nombre = sc.nextLine();
        
            System.out.print("Ahora, ingresa tu edad: ");
            int edad = sc.nextInt();
        
            System.out.println("Hola tu nombre es " + nombre + " y Tienes " + edad + " años.");
        
            sc.close();
            
        }
    }
}