package Unidad3.Actividades_Resueltas;

import java.util.Scanner;

public class Actividad3_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num, cuadrado;
        boolean positivo, esPar;
        System.out.print("Introduce un número (0 exit)-> ");
        num= sc.nextInt();
        while (num!=0){
            esPar= num % 2 == 0 ? true:false;
            positivo = num > 0 ? true:false;
            cuadrado=num+num;
            System.out.println("¿Este número es par? " + esPar);
            System.out.println("¿Este número es positivo? " + positivo);
            System.out.println("El cuadrado de este número es -> " + cuadrado);
            System.out.print("Introduce un número (0 exit) -> ");
            num= sc.nextInt();
        }
    }
}
