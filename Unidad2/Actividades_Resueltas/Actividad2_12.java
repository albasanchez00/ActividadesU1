package Unidad2.Actividades_Resueltas;

import java.util.Scanner;

public class Actividad2_12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int dia,mes,anio;
        boolean fechaCorrecta;
        System.out.println("Introduce un día: ");
        dia= sc.nextInt();
        System.out.println("Introduce un mes: ");
        mes= sc.nextInt();
        System.out.println("Introduce un año: ");
        anio= sc.nextInt();
        if (anio==0){
            System.out.println("No es un valor valido");
            fechaCorrecta=false;
        } else if (mes==2 && (1 <= dia && dia <= 28)) {
            fechaCorrecta=true;
        } else if ((mes==4 || mes==6 || mes==9 || mes==11) && (1<= dia && dia <=30)) {
            fechaCorrecta=true;
        } else if ((mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12) && (1<= dia && dia <=31)) {
            fechaCorrecta=true;
        } else {
            fechaCorrecta=false;
        }
        if (fechaCorrecta){
            System.out.println("Fecha OK: " + dia + "/" + mes + "/" + anio);
        } else {
            System.out.println("Fecha incorrecta.");
        }
    }
}
