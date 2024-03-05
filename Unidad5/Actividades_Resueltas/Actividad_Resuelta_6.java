package Unidad5.Actividades_Resueltas;

/*
1.Solicitar la apuesta a la primitiva y verificar si
 exiten dichos números.
*/

import java.util.Arrays;
import java.util.Scanner;

public class Actividad_Resuelta_6 {
    public static void main(String[] args) {
        int combiGanadora[]=new int [6];
        int numero;
        for (int i=0;i<6;i++){
            numero=(int) (Math.random()*49+1);
            //Si el random duplica un número en la primitiva eso no se da,
            //por lo que hay que validar!
            //Hay que hacer una busqueda en el array.
            int indice=0;
            /*Minetras que indice sea menor que el n total o que ele array y la combinacion ganadora, sera distinto a la combinacion ganadora
            * Si está bien el indice se incrementa.
            * Si no esta bien devolvera "error"*/
            while (indice<combiGanadora.length && combiGanadora[indice]!=numero){
                indice++; //Se incrementa el indice para ir recorriendo las posiciones del array.
            }
            if (indice>=combiGanadora.length){
                combiGanadora[i]=numero;
            }else {
                i--;
            }
        }
        Scanner sc=new Scanner(System.in);
        mostrar("- Indica tu apuesta - ");
        int apuesta[]=new int[6];
        for (int i=0;i<6;i++){
            mostrar("Número "+ (i+1)+"->");
            apuesta[i]=sc.nextInt();
        }
        mostrar("Tu apuesta es -> " + Arrays.toString(apuesta));
        mostrar("Número de aciertos en tu apuesta " + primitiva(apuesta,combiGanadora));
        mostrar("La combinación ganadora es -> "+ Arrays.toString(combiGanadora));
    }

    public static int primitiva(int apuesta[], int ganadora[]) {
        int aciertos=0;
        Arrays.sort(apuesta);
        Arrays.sort(ganadora);
        for (int elemento:apuesta){
            //Como la tabla ganadora esá ordenada, utilizamos el  binarySeach.
            if (Arrays.binarySearch(ganadora,elemento)>=0){
                aciertos++; //Hemos acertado ese número.
            }
        }
        return aciertos;
    }


    public static void mostrar(String texto) {
        System.out.println("\t"+texto);
    }

    public static void mostrarLn(String texto) {
        System.out.print("\n\t"+texto);
    }
}
