package Unidad5.Actividades_Resueltas;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad_Resuelta_2 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        double [] numeros = new double[5];
        for (int i=0;i<5;i++){
            System.out.println("Introduzca un número ->");
            numeros[i]= sc.nextDouble();
        }
        System.out.println(Arrays.toString(numeros));

    }
}
