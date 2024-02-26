package Unidad4.Actividades_Resueltas;

import java.util.Scanner;

public class Unidad4_Actividad_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        String a;
        System.out.println("Introduce el número de veces que deseas mostrar la palabra eco -> ");
        n= sc.nextInt();
        System.out.println("--Antes de llamar a la función--");
        eco(n);
    }

    public static void eco(int a) {
        for (int i=0;i<a;i++){
            System.out.println("Eco...");
        }
    }
}
