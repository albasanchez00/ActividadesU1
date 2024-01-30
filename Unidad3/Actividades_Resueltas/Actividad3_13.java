package Unidad3.Actividades_Resueltas;

import java.util.Scanner;

public class Actividad3_13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int nota, condicionados=0, aprobados=0, suspensos=0;

        for (int i=1; i<=6;i++){
            System.out.println("Introduce las notas (de 0 a 10) -> ");
            nota= sc.nextInt();
            if (nota<4){
                suspensos++;
            } else if (nota==4) {
               condicionados++;
            } else if (nota>=5) {
                aprobados++;
            }
        }
        System.out.println("Aprobados " + aprobados);
        System.out.println("Condicionados " + condicionados);
        System.out.println("Suspensos " + suspensos);

    }
}
