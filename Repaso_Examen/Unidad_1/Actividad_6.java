package Repaso_Examen.Unidad_1;

import java.util.Scanner;

public class Actividad_6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int nota1, nota2;
        double media;
        System.out.print("Introduce la 1ª nota -> ");
        nota1= sc.nextInt();
        System.out.print("Introduce la 2ª nota -> ");
        nota2= sc.nextInt();
        media=(nota1+nota2)/2;
        System.out.println("La media de ambas notas es -> " + media);
    }
}
