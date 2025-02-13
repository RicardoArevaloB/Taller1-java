import java.util.Scanner;

public class InteresCompuesto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el monto inicial de la inversión (en pesos): ");
        double montoInicial = scanner.nextDouble();

        System.out.print("Ingresa la tasa de interés anual (en porcentaje): ");
        double tasaAnual = scanner.nextDouble();

        System.out.print("Ingresa el número de años de inversión: ");
        int años = scanner.nextInt();

        System.out.print("Ingresa la frecuencia de capitalización (1: Anual, 4: Trimestral, 12: Mensual, 2: Semestral): ");
        int frecuencia = scanner.nextInt();

        double tasaPeriodo = (tasaAnual / 100) / frecuencia;

        int totalPeriodos = años * frecuencia;

        double capital = montoInicial;

        System.out.println("\nCrecimiento de la inversión año tras año:");
        System.out.printf("%-10s %-15s %-20s %-20s\n", "Año", "Capital Inicial", "Interés Ganado", "Nuevo Saldo");
        System.out.println("-------------------------------------------------------------");


        for (int año = 1; año <= años; año++) {
            double capitalInicialAño = capital;
            double interesGanadoAño = 0;


            for (int periodo = 1; periodo <= frecuencia; periodo++) {
                double interesPeriodo = capital * tasaPeriodo;
                capital += interesPeriodo;
                interesGanadoAño += interesPeriodo;
            }

            System.out.printf("%-10d %-15.2f %-20.2f %-20.2f\n", año, capitalInicialAño, interesGanadoAño, capital);
        }

        scanner.close();
    }
}