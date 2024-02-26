package Unidad4.Actividades_Resueltas;

import java.util.Scanner;

public class Unidad4_Actividad_4 {
    //Comparamos los parametros a y b y devuelve el mayor de ambos
    public static int maximo(int a, int b) {
        Scanner sc=new Scanner(System.in);
        int max;
        if (a>b){ //si a es mayor que b
            max=a;
        }else { //si son iguales o b mayor que a
            max=b;
        }
        return (max); //Devuevle el valor de la variable max
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce un número -> ");
        int a= sc.nextInt();
        System.out.println("Introduce otro número -> ");
        int b= sc.nextInt();
        System.out.println("El numero mayor es: " + maximo(a,b));
    }
}
