package Unidad2.Unidad2_ActividadesPropuestas;

import java.util.Scanner;
public class Actividad2_5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int aforo, numeroVendidas;
        double precioEntrada, recaudacion;
        System.out.println("Indique el precio por Entrada: ");
        precioEntrada= sc.nextDouble();
        System.out.println("Indique el aforo del local: ");
        aforo= sc.nextInt();
        System.out.println("Número de Entradas vendidas: ");
        numeroVendidas= sc.nextInt();

        //calculamos la recaudacion:
        recaudacion = numeroVendidas * precioEntrada;

        //Tomar decisionas basadas en el AFORO.
        if (numeroVendidas<aforo*0.2){
            System.out.println("No será posible la realización de este concierto.");
        } else if (numeroVendidas<aforo*0.5) {
            precioEntrada= precioEntrada-(precioEntrada*0.25);
            //Otro ejemplo sería
            // precioEntrada-=(precioEntrada*0.25);
            recaudacion=numeroVendidas*precioEntrada;
            System.out.println("Entradas al 25%");
        }else {
            System.out.println("El concierto será realizado.");
        }

        System.out.println("La Recaudacion del concierto es de " + recaudacion + "€");

    }
}

//datos:
//Aforo
//Precio
//numeroVendidos

//si es numero Vendidas <20% del aforo -> No hay concierto

//si numeroVendidas es <50% -> precio: 25%

//Solicitar los datos al usuario.