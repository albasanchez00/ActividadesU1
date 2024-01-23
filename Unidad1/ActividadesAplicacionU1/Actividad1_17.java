package Unidad1.ActividadesAplicacionU1;

import java.util.Scanner;

public class Actividad1_17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double mm, cm, m;
        double total;

        System.out.println("Introduce una cantidad de milimetros: ");
        mm = sc.nextDouble();
        System.out.println("Introduce una cantidad de centimetros: ");
        cm = sc.nextDouble();
        System.out.println("Introduce una cantidad de metros: ");
        m = sc.nextDouble();

        mm=mm/10;
        m=m*100;
        total = mm + cm + m;

        System.out.println("La suma total en centimetros es: " + total);
    }
}
