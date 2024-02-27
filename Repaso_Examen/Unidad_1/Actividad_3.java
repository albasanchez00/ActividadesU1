package Repaso_Examen.Unidad_1;

import java.util.Scanner;

public class Actividad_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Introduzca su edad -> ");
        int edad= sc.nextInt();
        edad++;
        System.out.println("El año que viene tendrá -> " + edad + " años.");
    }
}
