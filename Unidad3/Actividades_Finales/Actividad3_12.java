package Unidad3.Actividades_Finales;

import java.util.Scanner;

public class Actividad3_12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Indica el número binario para convertirlo a decimal -> ");
        int binario= sc.nextInt();
        int decimal=0;
        int base=1;
        while (binario!=0){
            int unidadBinario=binario%2;
            binario/=10;
            decimal+=base*unidadBinario;
            base*=2;
        }
        System.out.println("El número binario en decimal es -> " + decimal);
    }
}
