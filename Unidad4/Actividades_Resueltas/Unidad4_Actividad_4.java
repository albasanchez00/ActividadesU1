package Unidad4.Actividades_Resueltas;

import java.util.Scanner;

public class Unidad4_Actividad_4 {
    //Comparamos los parametros a y b y devuelve el mayor de ambos
    public static int maximo(int a, int b) {
        Scanner sc=new Scanner(System.in);
        int max=Math.max(a,b);
        return max;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce un número -> ");
        int a= sc.nextInt();
        System.out.println("Introduce otro número -> ");
        int b= sc.nextInt();
        System.out.println("El numero mayor es: " + maximo(a,b));
    }
}
