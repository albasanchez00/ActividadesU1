package Repaso_Examen.Unidad_2;

import java.util.Scanner;

public class Actividad_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner  (System.in);
        System.out.print("Introduce el 1º valor -> ");
        int num1= sc.nextInt();
        System.out.print("Introduce el 2º valor -> ");
        int num2= sc.nextInt();
        if (num1>num2){
            System.out.println("El 1º valor es mayor: " + num1);
        } else {
            System.out.println("El 2º valor es mayor: " + num2);
        }
    }
}
