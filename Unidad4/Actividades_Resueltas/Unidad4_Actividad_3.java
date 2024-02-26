package Unidad4.Actividades_Resueltas;

import java.util.Scanner;

public class Unidad4_Actividad_3 {

    public static void areayVolumen(double radio, double altura, int opcion) {
        Scanner sc=new Scanner(System.in);
        double area, volumen;
        switch (opcion) {
            case 1->{
                volumen=2*Math.PI*Math.pow(radio, 2) * altura;
                System.out.println("El volumen es de: " + volumen);
            }
            case 2->{
                area=2*Math.PI*radio*(altura+radio);
                System.out.println("El área es de: " + area);
            }
            default -> System.out.println("Indicador del cálculo erróneo");
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduzca el radio-> ");
        double radio=sc.nextDouble();
        System.out.println("Introduzca la altura-> ");
        double alt=sc.nextDouble();
        System.out.println("¿Qué desea calcular (1.Área / 2.Volúmen)? -> ");
        int tipoCalculo =sc.nextInt();
        System.out.println();
        areayVolumen(radio,alt,tipoCalculo);
    }


}
