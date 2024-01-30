package Unidad3.Actividades_Resueltas;

import java.util.Scanner;

public class Actividad3_11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        double fac=1;
        System.out.println("Introduce un número -> ");
        n= sc.nextInt();
        for (int i=n; i>0; i--){
            fac=fac+i;
        }
        System.out.println("El fatorial de " + n + " es: " + fac);
    }
}
