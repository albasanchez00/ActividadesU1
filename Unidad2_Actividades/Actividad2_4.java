package Unidad2_Actividades;

import java.util.Scanner;

public class Actividad2_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numero;
        int multiplo;
        System.out.println("Introduzca el numero: ");
        numero = sc.nextInt();
        System.out.println("Introduzca el multiplo: ");
        multiplo = sc.nextInt();

        if (numero % multiplo==0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
