package Unidad5.Actividades_Resueltas;

import java.util.Arrays;
import java.util.Scanner;

/*
*Vamos a crear una tabla con longitud inicial de 0, a la que llamaremos temporal
*Recorreremos la tabla t comprobando que sus elementos no se encuentran en la tabla temporal.
* Si el elemento no está en temporal, lo insertaremos
*/

public class Actividad_Resuelta_7 {
    public static void main(String[] args) {
        int tabla[]=crearArray();
        mostrar(Arrays.toString(tabla));
        buscarDuplicados(tabla);

    }
    public static int[] crearArray() {
        Scanner sc = new Scanner(System.in);
        mostrar("Indique la longitud de la tabla -> ");
        int longitud= sc.nextInt();
        int tabla[]=new int[longitud];
        for (int i=0;i<longitud;i++){
            tabla[i]=(int) (Math.random()*20+1);
        }

        return tabla;
    }

    public static void buscarDuplicados(int tabla[]) {
        int duplicados[]=new int[0];
        for (int i=0;i<tabla.length;i++){
            if (!buscar(duplicados,tabla[i])){
                duplicados=Arrays.copyOf(duplicados,duplicados.length+1);
                duplicados[duplicados.length-1]=tabla[i];
            }
        }
        mostrar(Arrays.toString(duplicados));
    }



    public static boolean buscar(int[] tabla, int numero){
        boolean existe=false; //creamos un booleanos que controle si existe
        int indice=0;

        for (int i=0;i<tabla.length;i++){

        }

        if (indice<tabla.length)
            existe=true;

        return existe;
    }
    public static void mostrar (String texto){
        System.out.println("\t" + texto);
    }
    public static void mostrarLn (String texto){
        System.out.print("\n\t" + texto);
    }
}
