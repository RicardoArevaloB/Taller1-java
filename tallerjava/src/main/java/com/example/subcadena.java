package com.example;

import java.util.Scanner;

public class subcadena {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Ingresa la cadena s: ");
        String s = sc.nextLine();
        if (s.length() < 1 || s.length() > 100) {
            System.out.println("Error la cadena debe tener entre 1 y 100 caractares. ");
            return;
        }

        if (!s.matches("[a-zA-Z ]+")) {
            System.out.println("Error solo se permiten caracteres del alfabeto ingles vueleve a ejecutar el programa");
            return;
        }

        System.out.print("Ingresa el valor start (numero indice inicio): ");
        int start = sc.nextInt();
        System.out.println("Ingresa el valor end (numero indice final):");
        int end = sc.nextInt();

        String subcadena = s.substring(start, end);

        System.out.println("La subcadena es: " + subcadena);

        sc.close();
        }
    }
}
