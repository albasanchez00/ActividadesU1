package Unidad5.Actividades_Resueltas;

import java.util.*;

public class Actividad_Resuelta_8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int datos[];
        int par[]=new int[0];
        int impar[]=new int[0];
        System.out.println("Escriba n: ");
        int n= sc.nextInt();
        datos=new int[n];
        for (int i=0;i< datos.length;i++){
            System.out.println("Introduzca un número -> ");
            datos[i]= sc.nextInt();
        }
        for (int numero:datos){
            if (numero % 2 == 0){
                par=Arrays.copyOf(par,par.length+1);
                par[par.length-1]=numero;
            } else {
                impar=Arrays.copyOf(impar,impar.length+1);
                impar[impar.length-1]=numero;

            }
        }
        mostrar("Pares: " + Arrays.toString(par));
        mostrar("Impares: " + Arrays.toString(impar));

    }
    public static void mostrar (String texto){
        System.out.println("\t" + texto);
    }
    public static void mostrarLn (String texto){
        System.out.print("\n\t" + texto);
    }

}
