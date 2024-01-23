package Unidad1.ActividadesU1;

import java.util.Scanner;

public class Actividad1_9 {
    public static void main(String[] args) {
        //asignamos una variable
        int numero;

        //pedimos el numero al usuario
        System.out.println("Escribe un numero: ");

        //Haciendo lo siguiente creamos y leermos en una misma instrucción
        numero =  new Scanner(System.in) .nextInt();

        //calcula el resto de dividir el numero
        //entre 2 y el resultado de esta operacion la compara con 0
        boolean esPar = (numero % 2) == 0;
        System.out.println("Es par: " + esPar);
    }
}
