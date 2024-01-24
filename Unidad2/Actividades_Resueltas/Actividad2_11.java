package Unidad2.Actividades_Resueltas;

import java.util.Scanner;

public class Actividad2_11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int dia;
        System.out.println("Introduce un día de la semana numericamente entre 1 y 7: ");
        dia= sc.nextInt();
        switch (dia){
            case 1:{
                System.out.println(dia + " es lunes.");
                break;
            }
            case 2:{
                System.out.println(dia + " es martes.");
                break;
            }
            case 3:{
                System.out.println(dia + " es miercoles.");
                break;
            }
            case 4:{
                System.out.println(dia + " es jueves.");
                break;
            }
            case 5:{
                System.out.println(dia + " es viernes.");
                break;
            }
            case 6:{
                System.out.println(dia + " es sábado.");
                break;
            }
            case 7:{
                System.out.println(dia + " es domingo.");
                break;
            }
        }

    }
}
