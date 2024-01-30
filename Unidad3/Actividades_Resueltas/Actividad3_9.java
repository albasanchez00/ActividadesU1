package Unidad3.Actividades_Resueltas;

import java.util.Scanner;

public class Actividad3_9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        int tabla,calculo;
        do {
            System.out.print("Introduce un numero entre 1 y 10 -> ");
            n= sc.nextInt();
        } while (!(1<=n && n<=10));
            System.out.println("\\n\\nTabla del " + n);

        for (int i=1; i<=10; i++){
            System.out.println(n + " x " + i + " = " + n * i);
        }
    }
}
