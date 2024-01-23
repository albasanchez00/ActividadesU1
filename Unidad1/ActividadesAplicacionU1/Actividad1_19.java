package Unidad1.ActividadesAplicacionU1;

import java.util.Scanner;

public class Actividad1_19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Cantidad de niños: ");
        double eInfanil = (sc.nextInt())*15.50;
        System.out.println("Cantidad de adultos: ");
        double eAdulto = (sc.nextInt())*20.00;

        double total;
        total = eInfanil + eAdulto;

        double descuento = 0.05;
        double desApli = total >= 100?total * descuento :total;


        System.out.println("Total: " + total + "€" );
        System.out.println("Descuento de: " + desApli + "€" );

    }

}
