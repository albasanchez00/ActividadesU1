package Unidad1.ActividadesAplicacionU1;

import java.util.Scanner;

public class Actividad1_21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double a, b;
        System.out.println("Introduce un valor para a: ");
        a = sc.nextDouble();

        System.out.println("Introduce un valor para b: ");
        b = sc.nextDouble();

        //Se utiliza cuando tienes mas de una condicion
        if (a==b) {
            System.out.println("True. Los números introducidos son iguales");
        }
        else if (a>10) {
            System.out.println("El numero a es mayor que 10");
        }
        else if (a>b) {
            System.out.println("False. El primer número es mayor que el segundo.");
        }
        else  {
            System.out.println("False. El primer número es menor que el segundo.");
        }

        //Lo utilizamos si no damos ninguna condicion aparte de true o false
//        boolean numero = a==b? true : false;
//        System.out.println("Los valores son: " + numero);

    }
}
