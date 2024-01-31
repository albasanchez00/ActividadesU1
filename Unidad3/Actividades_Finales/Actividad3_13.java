package Unidad3.Actividades_Finales;

import java.util.Scanner;

public class Actividad3_13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int h, min, seg;
        int suma;
        System.out.print("Introduce la hora -> ");
        h= sc.nextInt();
        System.out.print("Introduce los minutos -> ");
        min= sc.nextInt();
        System.out.print("Introduce los segundos -> ");
        seg= sc.nextInt();
        for (int incremento=0;incremento<=seg;incremento++){
            System.out.println("¿Cuantos segundos quieres incrementar el tiempo?");
            incremento= sc.nextInt();
            suma=seg+incremento;
            seg=suma;
            if (seg>59){
                seg=0;
                min++;
                if (min>59) {
                    min=0;
                    h++;
                    if (h>23){
                        h=0;
                    }
                }
            }
            System.out.println("Hora + " + incremento + " segundos -> " + h + ":" + min + ":" + seg);
        }
    }
}
