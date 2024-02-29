package Unidad4.Actividades_Aplicacion;

import java.util.Scanner;

public class Actividad_14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        segundos();
    }

    public static void segundos() {
        Scanner sc=new Scanner(System.in);
        int dias,mins,horas;
        System.out.println("Introduce una cantidad de dias -> ");
        dias= sc.nextInt();
        System.out.println("Introduce una cantidad de horas -> ");
        horas= sc.nextInt();
        System.out.println("Introduce una cantidad de minutos -> ");
        mins= sc.nextInt();
        int dia=0,hora = 0,min=0,segd=0,segh=0,segm=0;
        segd= dia*86400;
        segh= hora*3600;
        segm= min*60;
        System.out.println("El resultado son ->");
        System.out.println("Dias-Segundos -> " + segd);
        System.out.println("Horas-Segundos -> " + segh);
        System.out.println("Minutos-Segundos -> " + segm);
        return;
    }
}
