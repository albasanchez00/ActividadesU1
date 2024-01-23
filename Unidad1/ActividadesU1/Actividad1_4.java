package Unidad1.ActividadesU1;

import java.util.Scanner;

public class Actividad1_4 {
    public static void main(String[] args) {
        int aActual;
        int aNacimiento;
        int edad;
        Scanner sc=new Scanner(System.in);
        System.out.print("Año de nacimiento ");
        aNacimiento = sc.nextInt();
        System.out.println("Año actual ");
        aActual = sc.nextInt();
        edad = aActual - aNacimiento;
        System.out.println("Su edad es: " + edad + " años");
    }
}
