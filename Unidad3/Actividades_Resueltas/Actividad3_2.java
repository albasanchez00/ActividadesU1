package Unidad3.Actividades_Resueltas;

import java.util.Scanner;

public class Actividad3_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int edad;
        int sumaEdades=0;
        int totalAlumnos=0;
        int mayoresEdad=0;
        double media;
        System.out.println("Introduce la edad-> ");
        edad= sc.nextByte();
        while (edad>=0){
            sumaEdades+=edad;
            totalAlumnos++;
            if (edad>=18){
                mayoresEdad++;
            }
            System.out.println("Introduce la edad-> ");
            edad= sc.nextByte();
        }
        media= sumaEdades/totalAlumnos;
        System.out.println("Total de alumnos ingresados -> " + totalAlumnos);
        System.out.println("Suma de todas las edades introducidas -> " + sumaEdades);
        System.out.println("Media de alumnos -> " + media);
        System.out.println("Alumnos mayores de edad -> " + mayoresEdad);
    }
}
