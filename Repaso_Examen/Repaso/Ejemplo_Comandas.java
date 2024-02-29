package Repaso_Examen.Repaso;

import java.util.Scanner;

/*
Enunciado
*Crear un programa que permita a traves de un menu
(toritlla,croquetas,jamon y queso. bebidas)
*Indicar lo que el cliente solicita, y  crear o mostrar el toal de su pedido,
tomando el cuenta, los precios
-Toritlla:2€ string
-Croquetas:8€
-Jamon y queso:15€ string
-Bebidas:3€
 */
public class Ejemplo_Comandas {
    public static void main(String[] args) {
        //Declaraciones de variables
        Scanner sc=new Scanner(System.in);
        int cuenta=0;
        int cant=0;
        double total=0;
        double iva=0.21;
        String detallePedido="";
        byte opcion=0;
        /*
        * Crear un bucle con el menú
        */
        System.out.println("·····Menú Cofee House·····");
        System.out.println("\t1. Torillas");
        System.out.println("\t2. Croquetas");
        System.out.println("\t3. Jamón y queso");
        System.out.println("\t4. Bebidas");
        System.out.println("\t5. Salir");
        do {

            System.out.print("\n\t Indique su opción -> ");
            opcion= sc.nextByte();
            switch (opcion){
                case 1-> {
                    System.out.print("\t Inserta la cantidad -> ");
                    cant= sc.nextInt();
                    cuenta+=(2*cant);
                    detallePedido+="\t" + cant + "\tTortillas\n";
                }
                case 2-> {
                    System.out.print("\t Inserta la cantidad -> ");
                    cant= sc.nextInt();
                    cuenta+=(8*cant);
                    detallePedido+="\t" + cant + "\tCroquetas\n";
                }
                case 3-> {
                    System.out.print("\t Inserta la cantidad -> ");
                    cant= sc.nextInt();
                    cuenta+=(15*cant);
                    detallePedido+= "\t" + cant + "Jamón y queso\n";
                }
                case 4-> {
                    System.out.print("\t Inserta la cantidad -> ");
                    cant= sc.nextInt();
                    cuenta+=(3*cant);
                    detallePedido+="\t" + cant + "\tBebidas\n";
                }
                case 5-> System.out.println("\t·····Generando cuenta·····");
                default -> {
                    System.err.println("Opción no valida");
                }
            }

        }while (opcion!=5);
        iva *= cuenta;
        total = iva + cuenta;
        System.out.println("\n\n·········Factura Simplificada·········");
        System.out.println("\tPedido: \n" + detallePedido);
        System.out.println("\tTotal sin IVA: " + cuenta +"€");
        System.out.print("\tIVA:");
        System.out.printf("%15.2f",iva);
        System.out.println("€\n\tImporte total (con IVA): " + total +"€");
        System.out.println("······································");

        //double iva=0.21;
        /*"%15.2f" -> Sirve para mostrar solo dos decimales*/
        //System.out.printf("%0.00f", iva);

    }
}
