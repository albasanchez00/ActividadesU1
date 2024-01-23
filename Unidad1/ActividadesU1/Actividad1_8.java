package Unidad1.ActividadesU1;

import java.util.Scanner;

public class Actividad1_8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce tu edad ");
        int edad = sc.nextInt();
        boolean mayorEdad = edad >= 18;
        System.out.println("Mayoría de edad " + mayorEdad);
    }
}
