package Unidad3.Actividades_Resueltas;

import java.util.Scanner;

public class Actividad3_5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int resultado, operador1, operador2;
        int operacionesSeguidas=0;
        do {
            operador1=(int)Math.floor(Math.random()*100+1);
            operador2=(int)Math.floor(Math.random()*100+1);
            System.out.print(operador1 + " + " + operador2 + " = ");
            resultado= sc.nextInt();
            operacionesSeguidas++;
        } while (resultado==operador1+operador2);
        System.out.println("A conseguido realizar " + (operacionesSeguidas-1) + " sumas seguidas");
    }
}
