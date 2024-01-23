package Unidad1.ActividadesAplicacionU1;

import java.util.Scanner;

public class Actividad1_11 {
    public static void main(String[] args) {
        double precio , iva21, impTotal;

        //pedimos los datos.
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce el precio del producto (euros): ");
        precio = sc.nextDouble();
        System.out.println("Introduce el iva que se aplicará: ");
        iva21 = sc.nextDouble();

        //calculamos el Iva y lo mostramos
        impTotal = (precio * iva21) / 100;
        System.out.println("Importe del IVA: " + impTotal + "euros");
        //calculamos el precio con iva y lo mostramos
        impTotal += precio;
        System.out.println("El precio con IVA es: " + impTotal + " euros");
    }
}
