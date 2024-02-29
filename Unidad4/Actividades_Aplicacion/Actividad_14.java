package Unidad4.Actividades_Aplicacion;

import java.util.Scanner;

public class Actividad_14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int dias;
        int horas;
        int mins;
        System.out.println("Introduce una cantidad de dias -> ");
        dias= sc.nextInt();
        System.out.println("Introduce una cantidad de horas -> ");
        horas= sc.nextInt();
        System.out.println("Introduce una cantidad de minutos -> ");
        mins= sc.nextInt();

    }

    public static void segundos(int seg, int dia, int hora, int min) {
        Scanner sc=new Scanner(System.in);
        seg= dia*86400;
        seg= hora*3600;
        seg= min*60;
        System.out.println("El resultado son ->");
        System.out.println("Dias-Segundos -> " + dia);
        System.out.println("Horas-Segundos -> " + hora);
        System.out.println("Minutos-Segundos -> " + min);
        return;
    }
}
