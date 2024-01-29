package Unidad3.ActividadPropuesta;

import java.util.Scanner;

public class Actividad3_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int eco=1;
        System.out.println("Introduce la cantidad que quieres que se repita la palabra ECO -> ");
        eco= sc.nextInt();
        for (int i=1; i<=eco; i++){
            System.out.println("Eco...");
        }
    }
}
