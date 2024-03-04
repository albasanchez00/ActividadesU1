package Unidad5.Actividades_Propuestas;

import java.util.Scanner;

/*
*Solicitar al usuario el número de elementos y luego mostrar de
 forma inversa los números introducidos.
 */
public class Actividad_Propuesta_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        mostrar("Indique el número de elementos enteros a insertar ->");
        int longitud= sc.nextInt();
        int [] numeros=new int[longitud];
        for (int i=0;i<longitud;i++){
            mostrar("Indique el número ->");
            numeros[i]= sc.nextInt();
        }
        //Vamos a mostrar de forma inversa.
        mostrar("Muestra de forma inversa los números insertados.");
        mostrar("················································");
        for (int i=numeros.length-1;i>=0;i--){
            mostrar("-> " +numeros[i] );
        }
    }

    public static void mostrar(String texto) {
        System.out.println("\t"+texto);
    }
}
