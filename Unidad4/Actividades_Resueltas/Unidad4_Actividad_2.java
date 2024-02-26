package Unidad4.Actividades_Resueltas;

import java.util.Scanner;

public class Unidad4_Actividad_2 {
    public static void mostrar(int a, int b) {
        Scanner sc=new Scanner(System.in);
        int mayor= a > b ? a : b; //Asignamos a mayor el mayor entre a y b,
        int menor= a < b ? a : b; // y en menor el más pequeño entra a y b.
        for (int i=menor; i<=mayor; i++){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduzca el primer número: ");
        int a= sc.nextInt();
        System.out.println("Introduzca el segundo número: ");
        int b= sc.nextInt();
        mostrar(a,b);
    }


}


