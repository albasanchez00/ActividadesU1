package Unidad2.Actividades_Resueltas;

import java.util.Scanner;

public class Actividad2_10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int notaEntera;
        System.out.println("Introduce una nota entera entre 0 y 10: ");
        notaEntera= sc.nextInt();

        if (notaEntera<4){
            System.out.println("Insuficiente: " + notaEntera);
        } else if (notaEntera==5) {
            System.out.println("Suficiente: " + notaEntera);
        } else if (notaEntera==6) {
            System.out.println("Bien: " + notaEntera);
        } else if (notaEntera>6 && notaEntera<9) {
            System.out.println("Notable: " + notaEntera);
        } else if (notaEntera>8 && notaEntera==10) {
            System.out.println("Sobresaliente: " + notaEntera);
        } else {
            System.out.println("Ese valor no es entero o no se encuentre entre 0 y 10");
        }
    }
}
