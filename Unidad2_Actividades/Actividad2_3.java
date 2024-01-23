package Unidad2_Actividades;

import java.util.Scanner;

public class Actividad2_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1, num2;
        System.out.println("introduce el primer numero; ");
        num1 = sc.nextInt();
        System.out.println("Introduce el segundo numero: ");
        num2 = sc.nextInt();
        if (num1 != num2 || num1 == 0 || num2 == 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
