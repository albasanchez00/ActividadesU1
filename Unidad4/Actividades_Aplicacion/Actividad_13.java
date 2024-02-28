package Unidad4.Actividades_Aplicacion;

import java.util.Scanner;

public class Actividad_13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean esPar;
        int n;
        System.out.println("Introduce un valor para n -> ");
        n= sc.nextInt();
        muestraPares(n);
    }

    public static boolean muestraPares(int n) {
        int i=1;
        while(i <= n){
            if (i % 2 == 0){
                System.out.println(i);
            }
            i ++;
        }
        return false;
    }
}
