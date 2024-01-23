package Unidad1.VariosU1;


//OTRA FORMA ES UTILIZAR EL METODO Math.abs(), QUE CALCULA EL VALOR ABSOLUTO DE UN NUMERO.

import java.util.Scanner;

public class Enunciado {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in) ;
        System.out.println("Escriba un número (positivo o negativo) : ");
        int n = sc.nextInt() ;
        int valorAbsoluto = Math.abs(n) ;
        System.out.println("El valor absoluto de " + n + " es " + valorAbsoluto);
    }
}
