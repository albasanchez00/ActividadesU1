package Unidad1.ActividadesU1;

import java.util.Scanner;

public class Actividad1_6 {
    public static void main(String[] args) {
        int nota1, nota2;
        double media;
        Scanner sc=new Scanner(System.in);
        System.out.println("Nota 1: ");
        nota1 = sc.nextInt();
        System.out.println("Nota 2: ");
        nota2 = sc.nextInt();
        media = (nota1 + nota2) / 2.0;
        System.out.println("La media es: " + media);
    }
}
