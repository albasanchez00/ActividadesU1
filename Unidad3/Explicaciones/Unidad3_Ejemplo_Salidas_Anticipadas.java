package Unidad3.Explicaciones;

import java.util.Scanner;

public class Unidad3_Ejemplo_Salidas_Anticipadas {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        byte edad;
        byte menores=0;
        for (byte i=1; i<=7; i++){
            System.out.println("Indica la edad -> ");
            edad= sc.nextByte();
            if (edad<18){
                System.out.println("No tiene permitido entrar");
                menores++;
                i--;
            }
            if (i==5){
                System.out.println("Han intentado entrar " + menores + " menores de edad.");
                System.out.println("***********Aforo Completo");
                break;
            }
        }
    }
}
