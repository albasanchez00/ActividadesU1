package Unidad4.Ejemplos;

import java.util.Scanner;

public class Ejemplo_PedirDatos {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String nombre;
        String apellido;
        byte edad;
        System.out.println("Idque el nombre -> ");
        nombre= sc.nextLine();
        System.out.println("Idque el apellido -> ");
        apellido= sc.nextLine();
        System.out.println("Idque la edad -> ");
        edad= sc.nextByte();
        incrementoEdad(nombre,apellido,edad);
    }

    public static void incrementoEdad(String nom,String ape,byte ed) {
        ed+=10;
        System.out.println(nom + " " +ape + " tendras dentro de 10 años " + ed + " años!");
    }
}
