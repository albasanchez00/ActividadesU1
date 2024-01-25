package Unidad2.Unidad2_Actividades;

import java.util.Scanner;

public class Actividad2_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("Introduce un número: ");
        num = sc.nextInt();
        if (num > 0) {
            System.out.println("El número es positivo");
        } else {
            System.out.println("El número es negativo");
        }
    }
}
