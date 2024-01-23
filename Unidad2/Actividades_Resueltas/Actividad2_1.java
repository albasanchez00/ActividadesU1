package Unidad2.Actividades_Resueltas;

import java.util.Scanner;

public class Actividad2_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("Introduce un numero para saber si es par/impar: ");
        num = sc.nextInt();

        if (num % 2==0){
            System.out.println("El numero introducido es par.");
        } else {
            System.out.println("El número introducido es impar.");
        }
    }
}
