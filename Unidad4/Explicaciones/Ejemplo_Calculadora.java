package Unidad4.Explicaciones;

import java.util.Scanner;

public class Ejemplo_Calculadora {

    static double resultado;
    static Scanner entrada=new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    static void menu() {
        System.out.println("____________________________");
        System.out.println("|   C A L C U L A D O R A  |");
        System.out.println("|         J A V A          |");
        System.out.println("|--------------------------|");
        System.out.println("| \t1.Sumar                |");
        System.out.println("| \t2.Restar               |");
        System.out.println("| \t3.Multiplicar          |");
        System.out.println("| \t4.Dividir              |");
        System.out.println("| \t5.Raíz Cuadrada        |");
        System.out.println("| \t6.Exponencial          |");
        System.out.println("|__________________________|");
        System.out.print("Indica tu opción ----------> ");
        int opcion= entrada.nextInt();
        operaciones(opcion);
    }

    static void operaciones(int opcion) {
        int numero1=0, numero2=0, base=0, exponente=0;
        if (opcion>=1 && opcion<=4){
            System.out.print("Ingrese el valor del número 1 -> ");
            numero1= entrada.nextInt();
            System.out.print("Ingrese el valor del número 2 -> ");
            numero2= entrada.nextInt();
        }
        switch (opcion) {
            case 1 -> resultado = numero1 + numero2;
            case 2 -> resultado = numero1 - numero2;
            case 3 -> resultado = numero1 * numero2;
            case 4 -> resultado = numero1 / numero2;
            case 5 -> {
                System.out.print("Ingrese el número a calcular de la raíz cuadrada -> ");
                base = entrada.nextInt();
                resultado = Math.sqrt(base);
            }
            case 6->{
                System.out.println("Ingrese la base -> ");
                base=entrada.nextInt();
                System.out.println("Ingrese el exponente -> ");
                exponente=entrada.nextInt();
                resultado= Math.pow(base,exponente);
            }
            default -> {
                System.err.println("Opción no válida.");
                menu();
            }
        }
        System.out.println("El resultado es " + resultado);
        menu();

    }
}
