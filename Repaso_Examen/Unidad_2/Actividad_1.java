package Repaso_Examen.Unidad_2;

import java.util.Scanner;

public class Actividad_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("Introduce un número para saber si es par/impar:");
        num= sc.nextInt();
        if (num%2==0){
            System.out.println("El número introducido es par -> " + num);
        } else {
            System.out.println("El número introducido es impar -> " + num);
        }

    }
}
