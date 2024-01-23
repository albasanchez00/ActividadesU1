package Unidad1.ActividadesU1;

import java.util.Scanner;

public class Actividad1_3Copy {
//    Entrada de datos: Pedimos la edad.
//    Procesado: en este caso incrementar la edad en 1
//    Salida de datos: mostrar los resultados
    public static void main(String[] args) {
        int edad;
        Scanner sc=new Scanner(System.in);
        System.out.print("Escriba su edad: ");
        edad = sc.nextInt();
        edad = edad + 1;
        System.out.println("El próximo año su edad será: " + edad + " años");
    }
}
