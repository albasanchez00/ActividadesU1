package Unidad2.Actividades_Resueltas;

import java.util.Scanner;

public class Actividad2_8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double x1, x2, d;
        double a,b,c;
        System.out.println("Inreoduce un valor para a: ");
        a= sc.nextInt();
        System.out.println("Inreoduce un valor para b: ");
        b= sc.nextInt();
        System.out.println("Inreoduce un valor para c: ");
        c= sc.nextInt();

        //calculamos el discriminante (d).
        d=(b*b-4*a*c);
        if (d<0) {
            System.out.println("No existen soluciones reales");
        } else {
            if (a == 0) {
                System.out.println("No es una ecucación de 2º grado");
            } else {
                x1=(-b + Math.sqrt(d))/(2*a);
                x2=(-b - Math.sqrt(d))/(2*a);
                System.out.println("Solución 1: " + x1);
                System.out.println("Solución 2: " + x2);
            }
        }
    }
}
