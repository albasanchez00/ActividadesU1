package Unidad3.Actividades_Resueltas;

import java.util.Scanner;

public class Actividad3_10 {
    public static void main(String[] args) {
        double suma=0; //Esta variable guardará la suma d elos 10 primeros impares.
        for (int i =1; i<=10; i++){
         int esImpar=2+i-1; //Aqui pedimos que nos calcule si es impar.
         suma+=esImpar;
        }
        System.out.println("La suma de lo 10 primeros números impares es -> " + suma);
    }
}
