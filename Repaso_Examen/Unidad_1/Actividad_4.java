package Repaso_Examen.Unidad_1;

import java.util.Scanner;

public class Actividad_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduzca el año actual -> ");
        int anioActual= sc.nextInt();
        System.out.println("Introduzca el año de su nacimiento -> ");
        int anioNaci= sc.nextInt();
        int edad;
        edad=anioNaci- anioActual;
        System.out.println("Usted tiene -> " + edad + " años.");

    }
}
