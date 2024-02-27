package Repaso_Examen.Unidad_3;

import java.util.Scanner;

public class Actividad_8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n, suma=0;
        double media;
        for (int i=1; i<=10; i++){
            System.out.println("Introduce un número-> ");
            n= sc.nextInt();
            suma+=n;
        }
        media=suma/10;
        System.out.println("La media es: " + media);
    }
}
