package Repaso;

import java.util.Scanner;
/*
*Aplicacion que ggestiona la venta de entradas al cine
* A tomar en cuenta:
*   -Las peliculas tiene calificaion (Adultos- TP)
*   -Los precios de los adultos es de 6€ y niños 4.50€
*   -Los miercoles, todas las entradas son a 4.50€
 */
public class Ejemplo_Cine {
    public static void main(String[] args) {
        //Declaracion de variables
        Scanner sc=new Scanner(System.in);
        final double precioNinos=4.5;
        double precioAdultos=6.0; //No utilizamos final
        double totalEntradas=0;
        byte miercoles=0;
        double cantNinos, cantAdultos;
        byte opcionMenu=0;
        String pelicula1="Ferrari", pelicula2="Priscilla", pelicula3="Peppa Cinema Party", pelicula4="Pobres Criaturas (+18)", pelicula5="La Piscina (+18)", pelicula6="Kimetsu no Yaiba (+18)";
        String peliSeleccionada="";
        //Menú opciones:
        System.out.println("--------C I N E M A--------");
        System.out.println("\t1."+pelicula1);
        System.out.println("\t2."+pelicula2);
        System.out.println("\t3."+pelicula3);
        System.out.println("\t4."+pelicula4);
        System.out.println("\t5."+pelicula5);
        System.out.println("\t6."+pelicula6);
        System.out.println("\t7. Facturar y salir");
        System.out.println("------------------------------");
        System.out.println("\t¿Es miercoles?");
        System.out.println("\t1. Si \n\t2. No");
        System.out.println("\tRespuesta->");
        miercoles= sc.nextByte();
        if (miercoles==1){
            precioAdultos=4.50;
        }
        do {
            System.out.print("\tIndica que película quiere ver -> ");
            opcionMenu= sc.nextByte();
            switch (opcionMenu){
                case 1,2,3 -> {
                    if (opcionMenu==1){
                        peliSeleccionada+="\n\t"+pelicula1;
                    } else if (opcionMenu==2) {
                        peliSeleccionada+="\n\t"+pelicula2;
                    } else if (opcionMenu==3) {
                        peliSeleccionada+="\n\t"+pelicula3;
                    }


                    System.out.print("\tNuúmero de niños -> ");
                    totalEntradas= sc.nextDouble()*precioNinos;
                    System.out.print("\tNuúmero de adultos -> ");
                    totalEntradas= sc.nextDouble()*precioAdultos;
                }
                case 4,5,6->{
                    if (opcionMenu==4){
                        peliSeleccionada+="\n\t"+pelicula4;
                    } else if (opcionMenu==5) {
                        peliSeleccionada+="\n\t"+pelicula5;
                    } else if (opcionMenu==6) {
                        peliSeleccionada+="\n\t"+pelicula6;
                    }
                    System.out.print("\tNumero de adultos-> ");
                    totalEntradas+=sc.nextDouble()*precioAdultos;
                }
                case 7->{
                    System.out.println("\t.....Imprimiendo sus entradas");
                }
                default -> System.out.println("Opción no válida....");
            }
        }while (opcionMenu!=7); {
            System.out.println("\t--------Entradas--------");
            System.out.println("\tPelicula: " + peliSeleccionada);
            System.out.println("\tImporte a pagar -> " + totalEntradas +"€");
            System.out.println("\t------------------------)");
        }
    }
}
