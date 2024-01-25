package Unidad2.Unidad2_Actividades;

import java.util.Scanner;

public class Actividad_2_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("Introduce un número: ");
        num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");
        }
    }
}
