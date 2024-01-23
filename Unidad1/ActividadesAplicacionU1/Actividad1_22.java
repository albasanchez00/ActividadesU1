package Unidad1.ActividadesAplicacionU1;

import java.util.Scanner;

public class Actividad1_22 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double longitud, calculo;
        int resultado;

        System.out.println("Introduce la distancia (metros): ");
        longitud = sc.nextDouble();

        calculo = longitud * 100;
        resultado = (int) calculo;
        System.out.println("La longitud a sido de: " + resultado + "cm");
    }
}
