package Unidad4.Explicaciones;

import java.util.Scanner;

public class Unidad4_Ejemplo_Return {
    public static void main(String[] args) {
        String nombreUsuario=llamadaNombre(3);
        System.out.print("Tu nombre es -> " + nombreUsuario);
        int suma= funcionSumar(2,4);
        System.out.print("\nEl resultado de a + b = " + suma);
    }
    public static String llamadaNombre(int contador) {
        Scanner sc=new Scanner(System.in);
        String nombre="";
        System.out.print("Indica el nombre -> ");
        nombre= sc.nextLine();
        return nombre;
    }

    public static int funcionSumar(int a, int b) {
        return a+b;
    }
}
