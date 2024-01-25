package Unidad2.Unidad2_ActividadesFinales;

import java.util.Scanner;

public class Actividad2_16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num, vAbsoluto;
        System.out.println("Introduce un número-> ");
        num= sc.nextInt();
        vAbsoluto=Math.abs(num);
        System.out.println("El valor absoluto es-> " + vAbsoluto);
    }
}
