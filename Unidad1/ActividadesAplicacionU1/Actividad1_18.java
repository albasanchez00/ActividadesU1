package Unidad1.ActividadesAplicacionU1;

import java.util.Scanner;

public class Actividad1_18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce hormigas capturadas: ");
        int hormigas = (sc.nextInt())*6;

        System.out.println("Introduce arañas capturadas: ");
        int aranas = (sc.nextInt())*8;

        System.out.println("Introduce cochinillas capturadas: ");
        int cochinillas = (sc.nextInt())*14;

        System.out.println(hormigas + " hormigas    " + aranas + " arañas   " + cochinillas + "cochinillas");
    }
}
