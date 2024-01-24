package Unidad2.Actividades_Resueltas;

import java.util.Scanner;

public class Actividades2_13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int seg, min, hora;
        System.out.println("Introduce los segundos: ");
        seg= sc.nextInt();
        System.out.println("Introduce los minutos: ");
        min= sc.nextInt();
        System.out.println("Introduce las horas: ");
        hora= sc.nextInt();
        seg++;
        if (seg>59){
            seg=0;
        } else if (min>59) {
            min=0;
        } else if (hora>59) {
            hora=0;
        }

        System.out.println("Hora +1 seg: " + hora + ":" + min + ":" + seg);
    }
}
