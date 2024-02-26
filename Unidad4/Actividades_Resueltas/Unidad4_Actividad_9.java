package Unidad4.Actividades_Resueltas;

import java.util.Scanner;

public class Unidad4_Actividad_9 {
    static int maximo(int a, int b, int c){
        int aux= maximo(a,b);
        return (maximo(aux, c));
    }
    //Comparamos los parametros a y b y devuelve el mayor de ambos
    public static int maximo(int a, int b) {
        Scanner sc=new Scanner(System.in);
        int max=Math.max(a,b); //Valor máximo.
        /*Valor mínimo:
        * int min=Math.minx(a,b);
        */
        return max;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int max= maximo(2,9,7);
        System.out.println("El mayor es -> " + max);
    }
}
