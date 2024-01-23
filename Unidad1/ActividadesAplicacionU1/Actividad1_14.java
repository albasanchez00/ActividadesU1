package Unidad1.ActividadesAplicacionU1;

import java.util.Scanner;

public class Actividad1_14 {
    public static void main(String[] args) {
        int base, altura;
        double area;

        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce la base del triangulo: ");
        base = sc.nextInt();
        System.out.println("Introduce la altura del triangulo: ");
        altura = sc.nextInt();

        area = (base * altura) / 2;

        System.out.println("El área del triangulo es de: " + area);
    }
}

