package Unidad5.Actividades_Propuestas;


import java.util.Scanner;

/*
*Crea cinco elementos:
* Enteros, doubles y booleanos
* Mostrarlos -> usa una funcion
 */
public class Actividad_Propuesta_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] entero = new int[5];
        entero[0] = 23;
        entero[1] = 52;
        entero[2] = 18;
        entero[3] = 32;
        entero[4] = 45;

        double[] doble = new double[5];
        doble[0] = 3.32;
        doble[1] = 5.2;
        doble[2] = 1.825;
        doble[3] = 78.2;
        doble[4] = 45.0;

        boolean[] booleano = new boolean[5];
        booleano[0] = true;
        booleano[1] = false;
        booleano[2] = true;
        booleano[3] = true;
        booleano[4] = true;

        mostrar(entero, doble, booleano);
    }

    public static void mostrar(int[] entero, double[] doble, boolean[] booleano) {
        System.out.println(entero + "\n" + doble + "\n" + booleano);
    }
}
