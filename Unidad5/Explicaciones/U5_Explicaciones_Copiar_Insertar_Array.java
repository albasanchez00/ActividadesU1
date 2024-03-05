package Unidad5.Explicaciones;

import java.util.Arrays;
import java.util.Scanner;

public class U5_Explicaciones_Copiar_Insertar_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numeros[]=new int [6];
        for (int i=0;i<6;i++) {
            numeros[i]= (int) (Math.random() * 49 + 1);
        }
        mostrar("Array antes de crecer. Longitud -> " + numeros.length);
        mostrar(Arrays.toString(numeros));
        numeros=Arrays.copyOf(numeros,numeros.length+5);
        mostrar("Array después de crecer. Longitud -> " + numeros.length);
        numeros[numeros.length-5]=8;
        mostrar(Arrays.toString(numeros));
    }

    public static void mostrar(String texto) {
        System.out.println("\t"+texto);
    }

    public static void mostrarLn(String texto) {
        System.out.print("\n\t"+texto);
    }
}
