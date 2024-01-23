package Unidad1.VariosU1;

import java.util.Scanner;

public class Enunciado2 {
    public static void main(String[] args){
        Scanner sn=new Scanner (System.in);
        System.out.println("Indicar el precio del producto");
        Double precio=sn.nextDouble(); //:Leer por consola
        System.out.println("Indicar el descuento"); //Solicitar que ingrese el descuento
        Double precioFinal=precio-(precio*(sn.nextDouble()/100)); // operación matemática
        System.out.println(precioFinal);


    }
}
