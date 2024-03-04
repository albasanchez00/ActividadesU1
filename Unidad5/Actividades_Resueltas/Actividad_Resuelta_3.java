package Unidad5.Actividades_Resueltas;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad_Resuelta_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduzca la cantidad de números a introducir ->");
        int cuantosNum=sc.nextInt();
        int [] numeros = new int[5];
        for (int i=numeros.length;i>=0;i++){
            numeros[i]= sc.nextInt();
        }
        System.out.println(Arrays.toString(numeros));

    }
}
