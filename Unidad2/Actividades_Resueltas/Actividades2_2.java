package Unidad2.Actividades_Resueltas;

import java.util.Scanner;

public class Actividades2_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int valor1, valor2;
        System.out.println("Introduce valor 1: ");
        valor1= sc.nextInt();
        System.out.println("Introduce valor 2: ");
        valor2= sc.nextInt();

        if (valor1 == valor2){
            System.out.println("Ambos valores son iguales.");
        } else {
            System.out.println("Ambos valores son distintos.");
        }

    }
}
