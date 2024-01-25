package Unidad2.Unidad2_ActividadesFinales;

import java.util.Scanner;

public class Actividad2_15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double base, altura;
        double area;
        System.out.println("Introduce un valor para la base-> ");
        base=sc.nextDouble();
        System.out.println("Introduce un valor para la altura-> ");
        altura=sc.nextDouble();

        area=((base*altura)/2);

        if (base<=0){
            System.out.println("Por favor introduzca valores positivos");
        } else if (altura<=0) {
            System.out.println("Por favor introduzca valores positivos");
        } else {
            System.out.println("El área del triangulo es-> " + area);
        }

    }
}
