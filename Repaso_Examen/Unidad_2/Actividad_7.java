package Repaso_Examen.Unidad_2;

import java.util.Scanner;

public class Actividad_7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce el 1º valor -> ");
        int num1= sc.nextInt();
        System.out.println("Introduce el 2º valor -> ");
        int num2= sc.nextInt();
        System.out.println("Introduce el 3º valor -> ");
        int num3= sc.nextInt();
        if (num1>num2&&num2>num3){
            System.out.println(num1 + ", " + num2 + ", "  + num3);
        } else if (num1>num3&&num3>num2) {
            System.out.println(num1 + ", "  + num3 + ", "  + num2);
        } else if (num2>num1&&num1>num3) {
            System.out.println(num2 + ", "  + num1 + ", "  + num3);
        } else if (num2>num3&&num3>num1) {
            System.out.println(num2 + ", "  + num3 + ", "  + num1);
        } else if (num3>num1&&num1>num2){
            System.out.println(num3 + ", "  + num1 + ", "  + num2);
        } else if (num3>num2&&num2>num1) {
            System.out.println(num3 + ", "  + num2 + ", "  + num1);
        }
    }
}
