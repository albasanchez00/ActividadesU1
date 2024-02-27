package Repaso_Examen.Unidad_1;

import java.util.Scanner;

public class Actividad_7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double  longitud,area;
        System.out.print("Introduce el radio -> ");
        double  radio= sc.nextDouble();
        longitud=Math.PI*radio;
        area=Math.PI*Math.pow(radio,2);
        System.out.println("El área de la circunferencia es -> " + area);
        System.out.println("La longitud de la circunferencia es -> " + longitud);
    }
}
