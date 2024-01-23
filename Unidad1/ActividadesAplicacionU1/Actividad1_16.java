package Unidad1.ActividadesAplicacionU1;

import java.util.Scanner;

public class Actividad1_16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int seg, min, hora;
        System.out.println("Introduce una cantidad de segundos:");
        seg = sc.nextInt();

        min=seg/60;
        seg%=60;
        hora=min/60;
        min%=60;

        System.out.println(hora+":"+min+":"+seg);
    }
}
