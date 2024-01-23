package Unidad1.ActividadesU1;

import java.util.Scanner;

public class Actividad1_14 {
    public static void main(String[] args) {
        double n;
        int redondeo;
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce un número decimal (con punto): ");
        n = sc.nextDouble();

        redondeo = (int) + (n + 0.5);

        System.out.println("Redondeado es: " + redondeo);
    }
}
