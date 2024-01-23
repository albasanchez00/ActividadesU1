package Unidad1.ActividadesAplicacionU1;

import java.util.Scanner;

public class Actividad1_20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce un número real:");
        int nReal = sc.nextInt();
        double total;

        total = Math.sqrt(nReal);
        System.out.println("Su raiz cuadrada es: " + total);
    }
}
