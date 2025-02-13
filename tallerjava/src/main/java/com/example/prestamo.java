package com.example;

import java.util.Scanner;

public class prestamo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el monto del préstamo (en pesos): ");
        double montoPrestamo = sc.nextDouble();

        System.out.print("Ingresa la tasa de interés anual (en porcentaje): ");
        double tasaAnual = sc.nextDouble();

        System.out.print("Ingresa el plazo del préstamo (en años): ");
        int plazoAnios = sc.nextInt();

        double tasaMensual = (tasaAnual / 100) / 12;

        int numeroCuotas = plazoAnios * 12;

        double cuotaMensual = (montoPrestamo * tasaMensual * Math.pow(1 + tasaMensual, numeroCuotas))
                / (Math.pow(1 + tasaMensual, numeroCuotas) - 1);


        System.out.printf("\nCuota fija mensual: %.2f pesos\n\n", cuotaMensual);

        // Inicializar el saldo pendiente
        double saldoPendiente = montoPrestamo;

        // Mostrar la tabla de amortización
        System.out.println("Tabla de Amortización:");
        System.out.printf("%-10s %-15s %-15s %-15s %-15s %-15s\n",
                "Cuota", "Saldo Inicial", "Cuota Mensual", "Interés Pagado", "Capital Pagado", "Saldo Pendiente");
        System.out.println("-----------------------------------------------------------------------------");

        for (int cuota = 1; cuota <= numeroCuotas; cuota++) {
            double interesPagado = saldoPendiente * tasaMensual;

            double capitalPagado = cuotaMensual - interesPagado;

            saldoPendiente -= capitalPagado;


            System.out.printf("%-10d %-15.2f %-15.2f %-15.2f %-15.2f %-15.2f\n", 
            cuota, saldoPendiente + capitalPagado, cuotaMensual, interesPagado, capitalPagado, saldoPendiente);
        }

        sc.close();
    }
}