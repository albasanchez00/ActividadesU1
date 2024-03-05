package Unidad5.Actividades_Propuestas;

import java.util.Scanner;

/*
*Insertar 10 nombres y telefonos y luego mostrarlos
*
*/

public class Actividad_Propuesta_Busqueda {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] nombre=new String[1];
        int[] telefono=new  int[1];
        for (int i=0;i<nombre.length;i++){
            mostrarSinln("Indique el Nombre Nº " + (i+1) + " ->");
            nombre[i]= sc.next();
            mostrarSinln("Indique el Teléfono Nº " + (i+1) + " ->");
            telefono[i]= sc.nextInt();
        }
        /*Mostrar los Nombre y numeros insertados*/
        mostrarerr("----------------------------------------");
        mostrar("Lista de teléfonos");
        mostrar("Nombre\tTeléfono");
        for (int i=0;i<nombre.length;i++){
            mostrar(nombre[i] + "\t" + telefono[i]);
            mostrar("----------------------------------------");
        }

        //Envio el nombre a la función buscar nombre y recibo el índice donde está ubicado,
        //luego muestro el número del índice recibido.
        mostrar("¿Quieres buscar un nombre y te indique el número?");
        String nombreBuscr= sc.next();
        int indiceNumero=buscarTexto(nombre,nombreBuscr);
        if (indiceNumero<nombre.length){
            mostrar("**** E N C O N T R A D O ****");
            mostrar(nombre[indiceNumero] + "Teléfono: " + telefono[indiceNumero]);
        } else
            mostrar("No se encuentra " + nombreBuscr + " en la tabla actual.");



        mostrar("¿Quieres cambiar algún número telefónico? Indique el nombre ->");
        indiceNumero=buscarTexto(nombre,nombreBuscr);
        if (indiceNumero<nombre.length){
            mostrar("Indica el nuevo Nº telefónico ->");
            telefono[indiceNumero]=sc.nextInt();
        }
    }




    public static void mostrar(String texto) {
        System.out.println("\t"+texto);
    }

    public static void mostrarSinln(String texto) {
        System.out.print("\n\t"+texto);
    }

    public static void mostrarerr(String texto) {
        System.err.println("\t"+texto);
    }

    public static int buscarTexto(String[] texto, String buscar) {
        int indice=0;
        while (indice<texto.length && !texto[indice].equals(buscar)){
            indice++;
        }
        return indice;
    }
}
