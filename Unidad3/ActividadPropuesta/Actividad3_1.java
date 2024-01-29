package Unidad3.ActividadPropuesta;

import java.util.Scanner;

public class Actividad3_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int edad, edadMinima, edadMaxima;
        System.out.println("Introduce la edad -> ");//Esta linea se tendra que repetir
        edad=sc.nextByte();
        edadMinima=edad;
        edadMaxima=edad;
        /*******/
        while (edad!=-1){ //se repetira mientras el usuario no escriba -1
            //ondicionales if
            if (edadMinima>edad){
                edadMinima=edad;
            }
            if (edadMaxima<edad){
                edadMaxima=edad;
            }
            System.out.println("Introduce la edad -> ");
            edad=sc.nextByte();
        }
        System.out.println("La edad minima ingresada es -> " + edadMinima);
        System.out.println("La edad maxima ingresada es -> " + edadMaxima);
    }
}


//DATOS
//LEER LA EDAD
//1.Entrada asignar a la vaiable
//  -edadMinima=edad
//  -edadMinima=edad
//mientras edad!=-1
//  comparo edadMinima>edad
//      edadMinima=edad;
//  comparo edadMaxima<edad
//      edadMaxima=edad;
