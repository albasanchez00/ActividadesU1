package Unidad5.Explicaciones;

import java.util.Arrays;
import java.util.Scanner;

public class U5_Explicaciones_Copiar_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Copiar un array, crear dos arrays con la misma longitud.
        int arrayUno[]=new int[5];
        for (int i=0;i<arrayUno.length;i++){
            arrayUno[i]=(int) (Math.random()*100+1);
        }
        mostrar(Arrays.toString(arrayUno));
        //Si necesitas un array se puede hacer de la siguiente manera:
        int arrayDos[]=new int[5];

        //copyOf construye y devuelve una copia del origen al destino con la longitud indicada.
        arrayDos=Arrays.copyOf(arrayUno,arrayUno.length);
        mostrar(Arrays.toString(arrayDos));

        //copyOfRange
        //Crea y devuelve una tabla donde se copian los elementos indcados en el rango.
        //Indice desde donde comienza hasta donde termina, sin incluir este elemento,
        int arrayTres[]=Arrays.copyOfRange(arrayUno,2,4);
        mostrar(Arrays.toString(arrayTres));

        //Copiar con un método de la clase System ->
            //Insertar o borrar elementos en una tabla
        int arrayCuatro[]=new int[5];
        System.arraycopy(arrayUno,0,arrayCuatro,0,arrayUno.length);
        mostrar(Arrays.toString(arrayCuatro));
    }

    public static void mostrar(String texto) {
        System.out.println("\t"+texto);
    }

    public static void mostrarLn(String texto) {
        System.out.print("\n\t"+texto);
    }
}
