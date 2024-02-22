package Repaso;

import java.util.Scanner;

public class Ejemplo_Bucles {
    public static void main(String[] args) {
        //Declaramos nuestras variables
        int habitantes,total=0;

        String nombreUsu;
        String poblacion;


        /*
        Luego tenemos las declaraciones de las clase Scanner que nos permite leer la informacion
        que solicitamos, siempre relacionado con el tipo de dato que se va a escribir
         */
        //Declaracion
        Scanner sc=new Scanner(System.in);
        //Ej: Solicita el nimbre, la poblacion y numero de habitantes que sean las 5 capitales de provincias CLM
        //Sumar el total de habitantes de las 5 capittales


        //Condicionales


        //Bucles
        //Utilizamos un bucle desde 1 hasta 5 y lee lkos datos.
        for (int i=1;i<=5;i++){
            System.out.println("Indica la Provincia -> ");
            poblacion= sc.nextLine();
            System.out.println("Indica el número de habitantes -> ");
            habitantes= sc.nextInt();sc.nextLine();
            System.out.println("Indica tu nombre -> ");
            nombreUsu= sc.nextLine();
            /*
            Condicional -> si el numero de habitantes es menor que 20.000, indicar que hay un error y que restar 1 a i
            para que vuelva a solicitar la informacion.
             */
            if (habitantes<20000){
                i--;
                System.out.println("Los habitantes de " + poblacion + "son más de " + habitantes + ". Vuelve  a insertar la información.");
            } else {
                total+=habitantes;
            }

        }
        System.out.println("El número de habitantes de las Provincias de CLM es " + total);
    }
}
