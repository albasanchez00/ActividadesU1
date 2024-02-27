package Unidad4.Actividades_Resueltas;

import java.util.Scanner;

public class Unidad4_Actividad_8_Salida {
    public static void main(String[] args) {
        // ... (código para capturar entrada)
        Scanner scanner=new Scanner(System.in);
        System.out.println("\t---Elige una opción---");
        System.out.println("\t1. Sumar");
        System.out.println("\t2. Restar");
        System.out.println("\t3. Multiplicar");
        System.out.println("\t4. Dividir");
        System.out.println("\t5. Salir");
        System.out.println("\t---------------------");
        int opcion = scanner.nextInt();
        double resultado = 0;
        System.out.print("Ingresa el primer número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Ingresa el segundo número: ");
        double num2 = scanner.nextDouble();

        switch (opcion) {
            case 1:
                resultado = sumar(num1, num2);
                break;
            case 2:
                resultado = restar(num1, num2);
                break;
            case 3:
                resultado = multiplicar(num1, num2);
                break;
            case 4:
                resultado = dividir(num1, num2);
                break;
            case 5:
                break;
            default:
                System.out.println("Opción inválida.");
                return;
        }
        System.out.println("El resultado es: " + resultado);
    }

    public static double sumar(double a, double b) {
        return a + b;
    }

    public static double restar(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }


    public static double dividir(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("No se puede dividir por cero.");
        }
    }
}
