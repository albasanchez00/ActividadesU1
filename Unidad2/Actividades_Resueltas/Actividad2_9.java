package Unidad2.Actividades_Resueltas;

import java.util.Scanner;

public class Actividad2_9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduzca un número enre 0 y 99.999: ");
        int num = sc.nextInt();
        if (num<10){
            System.out.println("El numero introducido tiene 1 cifra");
        } else if (num<100) {
            System.out.println("El numero introducido tiene 2 cifras");
        } else if (num<1000) {
            System.out.println("El numero introducido tiene 3 cifras");
        } else if (num<10000) {
            System.out.println("El numero introducido tiene 4 cifras");
        } else if (num<100000) {
            System.out.println("El numero introducido tiene 5 cifras");
        } else {
            System.out.println("El numero introducido no se encuentra entre 0 y 99.999");
        }

    }
}
