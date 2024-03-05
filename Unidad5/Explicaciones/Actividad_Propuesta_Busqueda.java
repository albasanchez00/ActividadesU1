package Unidad5.Explicaciones;

import java.util.Scanner;

/*
*Insertar 10 nombres y telefonos y luego mostrarlos
*
*/

public class Actividad_Propuesta_Busqueda {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] nombre=new String[10];
        int[] telefono=new  int[10];
        for (int i=0;i<nombre.length;i++){
            mostrarLn("Indique el Nombre Nº" + (i+1));
            nombre[i]= sc.nextLine();
            mostrarLn("Indique el Teléfono Nº" + (i+1));
            telefono[i]= sc.nextInt();
        }
        /*Mostrar los Nombre y numeros insertados*/
    }




    public static void mostrar(String texto) {
        System.out.println("\t"+texto);
    }

    public static void mostrarLn(String texto) {
        System.out.print("\n\t"+texto);
    }
}
