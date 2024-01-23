package Unidad1.ActividadesU1;

import java.util.Scanner;

public class Actividad1_13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int nota1, nota2, nota3;
        int notaBoletin;
        double notaExpediente;

        System.out.println("Nota del 1 semestre: ");
        nota1 = sc.nextInt();
        System.out.println("Nota del 2 semenstre: ");
        nota2 = sc.nextInt();
        System.out.println("Nota del 3 trimestre: ");
        nota3 = sc.nextInt();

        notaExpediente = (nota1 + nota2 + nota3) / 3.0;
        notaBoletin = (int) notaExpediente;
        System.out.println("Boletin de calificaiones: " + notaBoletin);
        System.out.println("Expediente academico: " + notaExpediente);
    }
}
