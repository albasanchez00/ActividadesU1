package Unidad4.Explicaciones;

import java.util.Scanner;

public class Unidad4_Ejemplo_Conversor {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Indique en € el importe a convertir ->");
        double euros = sc.nextDouble();
        menu(euros); //lamada a una funcion con pase de parámetros


    }

    public static void menu(double euros) {
        char opcion;
        do {
            mostrar("·····CONVERSOR DE MONEDA·····");
            mostrar("\ta-> Libra.");
            mostrar("·\tb-> Yen Japonés.");
            mostrar("\tc-> Dólar EEUU.");
            mostrar("\td-> Dólar Canada.");
            mostrar("\tx-> Salir.");
            mostrar("Indica la moneda a convertir.");
            opcion=sc.next().charAt(0);
            switch (opcion){
                case 'a' -> {
                    System.out.println(euros + "€ = " + euros * 0.85543 + "£ GBP");
                }
                case 'b' -> {
                    System.out.println(euros + "€ = " + euros * 163.196 + "¥ JPY");
                }
                case 'c' -> {
                    System.out.println(euros + "€ = " + euros * 1.08495 + "$ USD");
                }
                case 'd' -> {
                    System.out.println(euros + "€ = " + euros * 1.46576 + "$ CAD");
                }
                case 'x' -> {
                    mostrar("¿Estás seguro de salir?");
                    mostrar("Pulsa x para confirmar");
                    opcion = sc.next().charAt(0);
                    if (opcion != 'x') {
                        menu(euros);
                    } else {
                        break;
                    }
                }
                default -> mostrar("Opción no válida");
            }
        } while (opcion != 'x');{}
    }


    public static void mostrar(String texto) {
        System.out.println("\t" + texto);
    }
}
