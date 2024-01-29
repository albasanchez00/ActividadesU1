package Unidad3.Actividades_Resueltas;

import java.util.Scanner;

public class Actividad3_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numero;
        boolean esMayor, esMenor;
        int numSecreto=(int)Math.floor(Math.random()*100+1);
        System.out.println("Introduce un número entre 1 y 100 -> ");
        numero= sc.nextInt();
        while (numSecreto!=numero && numero!=-1){
            if (numSecreto<numero){
                System.out.println("El numero secreto es menor al introducido");
            } else {
                System.out.println("El numero secreto es mayor al introducido");
            }
            System.out.println("Prueba con otro número -> ");
            numero= sc.nextInt();
        }
        System.out.println("El numero secreto era -> " + numSecreto);
    }
}
