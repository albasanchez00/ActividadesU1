package Unidad2.Actividades_Resueltas;

import java.util.Scanner;

public class Actividad2_14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int dia,mes,anio;
        int diaDelMes=0;
        System.out.println("Introduce el día: ");
        dia= sc.nextInt();
        System.out.println("Introduce el mes: ");
        mes= sc.nextInt();
        System.out.println("Introduce el año: ");
        anio= sc.nextInt();

        diaDelMes = switch (mes){
            case 2 -> 28;
            case 4,6,9,11 -> 30;
            default -> 31;
        };

        dia++;
        if (dia>diaDelMes){
            dia=1;
        }
        mes++;
        if (mes>diaDelMes){
            mes=1;
            anio++;
        }
        if (anio==0){
            anio=1;
        }
        System.out.println(dia + "/" + mes + "/" + anio);
    }

}
