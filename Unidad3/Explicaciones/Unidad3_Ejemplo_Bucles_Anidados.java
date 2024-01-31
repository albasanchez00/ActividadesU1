package Unidad3.Explicaciones;

import java.util.Scanner;

public class Unidad3_Ejemplo_Bucles_Anidados {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("**********TABLA  DE MULTIPLICAR***********");
        for (byte i=1;i<=10;i++){
            System.out.println("**TABLA DEL " + i +"**");
            for (byte y=1;y<=10;y++){
                System.out.println(i + " x " + y + " = " + (i*y));
            }
        }
    }
}
