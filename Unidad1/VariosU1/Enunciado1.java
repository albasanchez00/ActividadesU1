package Unidad1.VariosU1;

import java.util.Scanner;

public class Enunciado1  {
    //public static void main ->psvm + tabulador
    public static void main(String[] args) {
        int a,b,c;
        Scanner sn=new Scanner(System.in);
        System.out.println("Ingresa un número entero");
        a=sn.nextInt();
        System.out.println("Ingresa un número entero");
        b=sn.nextInt();
        c=a+b;
        System.out.println("El resultado de la suma " + c);

        /*Código Optimizado*/
        int cc; // solo declaro la variable c
        System.out.println("Ingrese un número tipo entero");
        cc= sn.nextInt();//leemos y acumulamos el valor en cc
        System.out.println("Ingrese un número tipo entero");
        cc=cc+sn.nextInt(); // leemos el segundo número y se lo sumamos al valor de cc
        System.out.println("El resultado de la suma de los dos números es igual a " +cc);
    }

}
