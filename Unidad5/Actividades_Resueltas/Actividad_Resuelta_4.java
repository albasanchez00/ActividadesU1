package Unidad5.Actividades_Resueltas;

import java.util.Scanner;

/*
*Solicitar al usuario el número de elementos y luego mostrar de
 forma inversa los números introducidos.
 */
public class Actividad_Resuelta_4 {
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
    public static void mostrarSinLn(String texto) {
        System.out.println("\t"+texto);
    }


    public static int maximo(int t[]) { //Podemos pasar arrays por parametros a una funcion
        int max= t[0]; //asumimos que al menos hay 1 elemento
        for (int elemento:t){
            if (elemento>max){ //recorremos el array por parametros
                max=elemento; //validamos cada elemento y comparamos con el maximo acumulado.
            }
        }
        return (max);
    }
}

