package Unidad2.Unidad2_ActividadesFinales;

import java.util.Scanner;

public class Actividad2_17 {
    public static void main(String[] args) {
        int num1,num2,resultado;
        num1=(int)Math.floor(Math.random()*100+1);
        num2=(int)Math.floor(Math.random()*100+1);
        System.out.println("Calcule cuento es " + num1 + " + " + num2 + " = ");
        resultado = new Scanner(System.in) .nextInt();
        if (resultado==num1+num2){
            System.out.println("La respuesta es correcta " + resultado);
        } else {
            System.out.println("El calcuo es erroneo " + resultado);
        }
    }
}
