package Unidad2.Actividades_Resueltas;

import java.util.Scanner;

public class Actividad2_5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1, num2;
        int mayor, menor;

        System.out.println("Introduce el primer número: ");
       num1= sc.nextInt();
        System.out.println("Introduce el segundo número: ");
       num2= sc.nextInt();
        mayor = num1 > num2 ? num1 : num2;
        menor = num1 < num2 ? num1 : num2;
        System.out.println(mayor + ", " + menor);
    }
}
