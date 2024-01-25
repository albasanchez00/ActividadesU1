package Unidad2.Unidad2_ActividadesFinales;

import java.util.Locale;
import java.util.Scanner;

public class Actividad2_19 {
    public static void main(String[] args) {
        //Indicar los grados y calcular los radianes.
        // radianes = grados*pi/180;
        //grados%=360
        Scanner sc=new Scanner(System.in);
        sc.useLocale(Locale.US);
        double grados=0;
        System.out.println("Introduce los grados del angulo-> ");
        grados= sc.nextDouble();
        grados%=360;
        double radianes=grados*Math.PI/180;
        System.out.print("Los radianes son: "); //no hace salto de linea

        //Redondear a cuatro decimales:
        System.err.printf("%.4f %n",radianes);
    }
}
