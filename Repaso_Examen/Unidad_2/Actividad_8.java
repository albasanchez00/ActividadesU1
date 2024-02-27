package Repaso_Examen.Unidad_2;

import java.util.Scanner;

public class Actividad_8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double a,b,c;
        double x1,x2,d;
        System.out.println("Introduce un valor para a -> ");
        a= sc.nextDouble();
        System.out.println("Introduce un valor para b -> ");
        b= sc.nextDouble();
        System.out.println("Introduce un valor para c -> ");
        c= sc.nextDouble();
        //Calculamos el discriminante
        d=Math.pow(b,2)-(4*a*c);
        if (d<0){
            System.out.println("ERROR. No existen soluciones reales.");
        } else {
            if (a==0){
                System.out.println("No es una ecuacion de 2º grado.");
            } else {
                x1=(-b+Math.sqrt(d)/2*a);
                x2=(-b-Math.sqrt(d)/2*a);
                System.out.println("Solucion 1 -> " + x1);
                System.out.println("Solucion 2 -> " + x2);
            }
        }
    }
}
