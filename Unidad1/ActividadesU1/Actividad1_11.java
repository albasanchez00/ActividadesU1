package Unidad1.ActividadesU1;

import java.util.Scanner;

public class Actividad1_11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        final double PRECIO_MANZANAS =2.35;
        final double PRECIO_PERAS = 1.95;
        int vM1Sem, vM2Sem;
        int vP1Sem, vP2Sem;
        double impTotal;

       //pedimos los datos de ambos productos.
        System.out.println("Venta (en kilos) de manzanas ");
        System.out.println("Venta en kilos del 1 semestre: ");
        vM1Sem = sc.nextInt();
        System.out.println("Venta en kilos del 2 semestre: ");
        vM2Sem = sc.nextInt();

        System.out.println("Venta (en kilos) de Peras: ");
        System.out.println("Venta en kilos del 1 semestre: ");
        vP1Sem = sc.nextInt();
        System.out.println("Venta en kilos del 2 semestre: ");
        vP2Sem = sc.nextInt();

        //Calculamos el valor de ambos productos.
        impTotal = (vM1Sem + vM2Sem) * PRECIO_MANZANAS;
        impTotal += impTotal * PRECIO_PERAS;

        //indciamos mostramos ambos resultados.
        System.out.println("El importe total es de: " + impTotal + " euros");
    }
}
