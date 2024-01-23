package Unidad2.Actividades_Resueltas;

import java.util.Scanner;

public class Actividades2_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1, num2;
        System.out.println("Introduce el primer número: ");
        num1= sc.nextInt();
        System.out.println("Introduce el segundo número: ");
        num2 = sc.nextInt();
        if (num1>num2){
            System.out.println(num1 + " es mayor que " + num2);
        } else {
            System.out.println(num2 + " es mayor que " + num1);
        }
    }
}
