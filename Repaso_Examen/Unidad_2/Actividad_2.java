package Repaso_Examen.Unidad_2;

import java.util.Scanner;

public class Actividad_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Introduce el primer número -> ");
        int num1= sc.nextInt();
        System.out.print("Introduce el segundo número -> ");
        int num2= sc.nextInt();
        if (num1==num2){
            System.out.println("Ambos números son iguales.");
        } else {
            System.out.println("Ambos números no son iguales.");
        }
    }
}
