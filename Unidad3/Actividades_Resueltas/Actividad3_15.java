package Unidad3.Actividades_Resueltas;

import java.util.Scanner;

public class Actividad3_15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Indica cuántos números de * tendra el triángulo ->");
        int n= sc.nextInt();
        //Bucles dependientes:
        int contador=0;
        for (int fila=1;fila<=n;fila++){
            for (int col=fila;col<=n;col++){
                System.out.print("* ");
                contador++;
            }
            System.out.println(" ");
        }
        System.out.println("Se han mostrado " + contador + " *");
    }
}
