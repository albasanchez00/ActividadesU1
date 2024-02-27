package Unidad4.Actividades_Aplicacion;

import java.util.Scanner;

public class Actividad_12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double resultado;
        System.out.println("Introduce un valor para x1 -> ");
        double x1= sc.nextDouble();
        System.out.println("Introduce un valor para x2 -> ");
        double x2= sc.nextDouble();
        System.out.println("Introduce un valor para y1 -> ");
        double y1= sc.nextDouble();
        System.out.println("Introduce un valor para y2 -> ");
        double y2= sc.nextDouble();
        resultado=distancia(x1,x2,y1,y2);

    }
    static double distancia(double x1, double x2, double y1,double y2) {
        Scanner sc=new Scanner(System.in);
        double distancia, d1, d2;
        d1=Math.pow((x1-x2),2);
        d2=Math.pow((y1-y2),2);
        distancia= Math.sqrt(d1 + d2);
        System.out.println("El resultado es: " + distancia);
        return x1;
    }

}
