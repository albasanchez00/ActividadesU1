package Unidad3.Actividades_Resueltas;

import java.util.Scanner;

public class Actividad3_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int etiquetaArbol, arbolMayorAltura, altArbol;
        int etiqueta=1;
        System.out.print("Altura del arbol ("+ etiqueta +") em cm: ");
        altArbol=sc.nextInt();
        arbolMayorAltura=altArbol;
        etiquetaArbol=1;
        while (altArbol!=-1){
            if (altArbol>arbolMayorAltura){
                arbolMayorAltura=altArbol;
                etiquetaArbol=etiqueta;
            }
            etiqueta++;
            System.out.print("Altura del arbol ("+ etiqueta +") en cm: ");
            altArbol=sc.nextInt();
        }
        if (arbolMayorAltura == -1){
            System.out.println("No se ha introducido ningun árbol");
        } else {
            System.out.println("La altura mas alta registrada es -> " + arbolMayorAltura);
            System.out.println("La su etiqueta asignada es -> " + etiquetaArbol);
        }
    }
}
