package com.example;

import java.util.Random;
import java.util.Scanner;

public class siete {
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            Random random = new Random();

        int numeroAleatorio = random.nextInt(100) + 1;

        int intentoUsuario;
        boolean adivinado = false;

        System.out.println("¡Adivina el número entre 1 y 100!");


        while (!adivinado) {
            System.out.print("Ingresa tu intento: ");
            intentoUsuario = sc.nextInt();

            if (intentoUsuario < numeroAleatorio) {
                System.out.println("El número es mayor que " +intentoUsuario + ". ¡Sigue intentando!");
            } else if (intentoUsuario > numeroAleatorio) {
                System.out.println("El número es menor que " +intentoUsuario + ". ¡Sigue intentando!");
            } else {
                System.out.println("¡Felicidades! Adivinaste el número: " + numeroAleatorio);
                adivinado = true; 
            }
        }

        // Cerrar el scanner
        sc.close();
        }
       
        
    }
}
