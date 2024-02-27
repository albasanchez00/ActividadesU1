package Unidad4.Actividades_Aplicacion;

import java.util.Scanner;

public class Actividad_11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double superficie, volumen;
        System.out.println("Introduce el radio de la esfera: ");
        int radio= sc.nextInt();
        superficie=4*(Math.PI)*Math.pow(radio,2);
        volumen=(4*(Math.PI)/3)*Math.pow(radio,3);
        System.out.println("El resulado del volumen es: " + superficie);
        System.out.println("El resulado de la superficie es: " + volumen);
    }
}
