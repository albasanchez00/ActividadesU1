package Repaso_Examen.Unidad_3;

import java.util.Scanner;

public class Actividad_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double cuadrado;
        boolean esPar, esPositivo;
        System.out.print("Introduzca un número -> ");
        int num= sc.nextInt();
        while (num!=0){
            esPar=num%2==0 ? true:false;
            esPositivo=num>=0 ? true:false;
            cuadrado=Math.pow(num,2);
            System.out.println("¿El numero es par?" + "\n"+esPar);
            System.out.println("¿El numero es positivo?" + "\n"+esPositivo);
            System.out.println("Su cuadrado es ->" + cuadrado);
            System.out.println("Introduzca otro número -> ");
            num= sc.nextInt();
        }


    }
}
