package Unidad3.Actividades_Resueltas;

import java.util.Scanner;

public class Actividad3_12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int notas;
        boolean suspenso=false;
        for (int i=1; i<=5; i++){
            System.out.print("Introduce notas (de 0 a 10) -> ");
            notas= sc.nextInt();
            if (notas < 5){
                suspenso=true;
            }
        }
        if (suspenso){
            System.out.println("Hay alumnos suspensos");
        } else {
            System.out.println("No hay alumnos suspensos");
        }
    }
}
