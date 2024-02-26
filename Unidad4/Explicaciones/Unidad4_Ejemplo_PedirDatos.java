package Unidad4.Explicaciones;

import java.util.Scanner;

public class Unidad4_Ejemplo_PedirDatos {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String nombre;
        String apellido;
        byte edad;
        System.out.println("Idque el nombre -> ");
        nombre= sc.next();
        System.out.println("Idque el apellido -> ");
        apellido= sc.next();
        System.out.println("Idque la edad -> ");
        edad= sc.nextByte();
        incrementoEdad(nombre,apellido,edad);
        quitarEdad(nombre,apellido,edad);
    }

    public static void incrementoEdad(String nom,String ape,byte ed) {
        ed+=10;
        System.out.println(nom + " " +ape + " tendras dentro de 10 años " + ed + " años!");
    }

    public static void quitarEdad(String nomUsu, String apeUsu, byte edadUsu) { //Ambito Local
        int contador=0;
        edadUsu-=10;
        System.out.println(nomUsu + " " +apeUsu + " tendras dentro de 10 años " + edadUsu + " años!");
        for (int i=1; i<=edadUsu;i++){ //La variable "i" tiene ambito de bloque (solo funcionara dentro del bucle for)
            System.out.println(nomUsu + " " + apeUsu + "->" + i);
        }
    }
}
