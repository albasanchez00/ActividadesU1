package Unidad5.Explicaciones;

import java.util.Arrays;
import java.util.Scanner;

public class U5_Explicaciones_Tablas {
    public static void main(String[] args) {
        //La declaracion array o tabla y debe contener 3 elementos:
        // 1. Tipo de datos
        // 2. Nombre de la variable
        // 3. longitud
        int[] edad = new int[5];
        edad[0]=14;
        edad[1]=24;
        edad[2]=34;
        edad[3]=44;
        edad[4]=54;
        //Valores -> Array edad.
        System.out. print(Arrays.toString(edad));

        //Ejemplo. Solicitar con Scanner las edades....
        //  Solicitar 1º cuantas edades voy a insertar....
        Scanner sc=new Scanner(System.in);
        mostrar("Indique el número de edades a insertar -> ");
        int longitud= sc.nextInt();
        byte[] edades=new byte[longitud];  //creamos el array con la longitud leida

        /*
         *Necesitamos pregutnar las edades, para ello necesitamos crear un bucle sencillo para
         *que recorra las posiciones del array e inserte los valores.
         * Utilizamos la valirable longitud para saber donde debe parar el bucle.
        */
        for (int i=0;i<longitud;i++){
            mostrar("Indique la edad Nº " + (i+1));
            edad[i]= sc.nextByte();
        }
        //Valores -> Array edades.
        //System.out.print(Arrays.toString(edades));

        //Bucle foreach (para recorrer tablas).
        for (int ed:edades){ // se declara una variable, llamada elemento y que recorre el array.
            System.out.println("Edad isertada ->"+ed);
        }

        //Metodos de la API de Java sobre los arrays.
        //Conocer la longitud de un array.
        mostrar("Longitud del array Edad -> " +edad.length);
        mostrar("Longitud del array Edades -> " +edades.length);
        for (int i=0;i<edad.length;i++){
            mostrar("La edad insertada en la posición " + (i+1)+ " es -> "+ edad[i]);
        }

        //Referencias en los arrays, variables, etc.
        mostrar("***********REFERENCIAS DE MEMORIA***********");
        System.out.println(edad);
        System.out.println(edades);
    }

    public static void mostrar(String texto) {
        System.out.println("\t"+texto);
    }
}
