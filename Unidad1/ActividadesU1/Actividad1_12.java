package Unidad1.ActividadesU1;

import java.util.Scanner;

public class Actividad1_12 {
    //al pedirnos una media entera para el ususario usaremos int
    public static void main(String[] args) {
        int nota1, nota2, nota3;
        int mediaBoletin;

        //al pedirnos una media decimal utilizaremos double
        double mediaExp;
        Scanner sc=new Scanner(System.in);
        //despues mostramos los resultados por partes
        System.out.print("Media del primer trimestre ");
        nota1 = sc.nextInt();

        System.out.print("Media segundo trimestre ");
        nota2 = sc.nextInt();

        System.out.print("Media tercer trimestre ");
        nota3 = sc.nextInt();

        //calculamos la media con decimales
        mediaExp = (nota1 + nota2 + nota3) / 3.0;
        mediaBoletin = (int) mediaExp;

        //mostramos la media con decimales
        System.out.println("Boletin de calificaciones: " + mediaBoletin);
        System.out.println("Expediente academico:  " + mediaExp);
    }

}
