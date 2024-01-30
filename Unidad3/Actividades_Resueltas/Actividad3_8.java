package Unidad3.Actividades_Resueltas;

import java.util.Scanner;

public class Actividad3_8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        int suma=0;
        double media;
        for (int i=0;i<=10;i++){
            System.out.println("Introduce un número (10 max) -> ");
            n= sc.nextInt();
            suma+=n;
        }
        media=suma/10;
        System.out.println("La media es -> " + media);
    }
}
