package Unidad1.ActividadesAplicacionU1;

import java.util.Scanner;

public class Actividad1_15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double exp2 = 2;
        int a, b, x, c;
        double calculo;

        System.out.println("Introduce el valor de a: ");
        a = sc.nextInt();
        System.out.println("Introduce el valor de b: ");
        b = sc.nextInt();
        System.out.println("Introduce el valor de c: ");
        c = sc.nextInt();
        System.out.println("Introduce el valor de x: ");
        x = sc.nextInt();

        calculo = (a * Math.pow(x, exp2)) + (b * x) + c;

        System.out.println("El valor de y es: " + calculo);
    }

}
