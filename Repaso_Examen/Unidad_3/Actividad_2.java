package Repaso_Examen.Unidad_3;

import java.util.Scanner;

public class Actividad_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int contadorAlumnos=0;
        int sumaEdades=0;
        int mayoresEdad=0;
        double media;
        int edad;
        System.out.print("Introduzca la edad -> ");
        edad= sc.nextInt();
        while (edad>=0){
            sumaEdades+=edad;
            contadorAlumnos++;
            if (edad>=18){
                mayoresEdad++;
            }
            System.out.print("Introduzca la edad -> ");
            edad= sc.nextInt();
        }
        media= (double) sumaEdades/contadorAlumnos;
        System.out.println("Suma de todas las edades -> " + sumaEdades);
        System.out.println("Media -> " + media);
        System.out.println("Suma de todos los alumnos -> " + contadorAlumnos);
        System.out.println("Mayores de edad (+18) -> " + mayoresEdad);
    }
}
