package com.example;

import java.util.Scanner;

public class cuatro {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("escriba un numero para determinar si es par o impar ");
            int numero = sc.nextInt();
            if (numero % 2 == 0) {
                System.out.println("el numero " + numero +" es par");
                
            }else{
                System.out.println("el numero " + numero + " es impar");
            }
            
            sc.close();
        }
    }
}
