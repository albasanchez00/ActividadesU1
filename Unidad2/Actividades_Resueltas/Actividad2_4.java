package Unidad2.Actividades_Resueltas;

import java.util.Locale;
import java.util.Scanner;

public class Actividad2_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        sc.useLocale(Locale.US);
        System.out.println("Introduce un numero real positivo o negativo: ");
        double num= sc.nextDouble();
        if (-1 < num && num < 1 && num != 0){
            System.out.println("El numero introducido es casi-cero.");
        } else {
            System.out.println("No es un casi-cero.");
        }
    }
}
