package Repaso_Examen.Unidad_2;

import java.util.Scanner;

public class Actividad_6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner  (System.in);
        System.out.print("Introduce el 1º valor -> ");
        int num1= sc.nextInt();
        System.out.print("Introduce el 2º valor -> ");
        int num2= sc.nextInt();
        if (num1>num2){
            System.out.println("El 1º valor es mayor: " + num1);
        } else if (num1<num2) {
            System.out.println("El 2º valor es mayor: " + num2);
        } else {
            System.out.println("Ambos valores son iguales: " +num1+ " y " +num2);
        }

    }
}
