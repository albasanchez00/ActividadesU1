package Unidad5.Actividades_Propuestas;

import java.util.Scanner;

/*
  *Solicitar un numero, realizar la media de los numreo insertados,
   la media de los negativos y la cuenta de 0 introducidos.
*/
public class Actividad_Propuesta_3 {
    public static void main(String[] args) {
   //solicitar cuantos numeros a insertar
        Scanner sc=new Scanner(System.in);
        mostrar("Indica el numero de elementos a insertar -> ");
        int longitud= sc.nextInt();
        int[] numeros=new int[longitud];
        int contadorCeros=0;
        int contadorNegativos=0;
        int contadorPositivos=0;
        double mediaPositivos=0;
        double mediaNegativo=0;
        for (int i=0;i<longitud;i++){
            mostrar("Indica el elemento Nº" + (i+1));
            numeros[i]= sc.nextInt();
            if (numeros[i]<0){
                mediaNegativo+=numeros[i];
                contadorNegativos++;
            } else if (numeros[i]>0) {
                mediaPositivos+=numeros[i];
                contadorPositivos++;
            } else {
                contadorCeros++;
            }
        }
        mediaPositivos/=contadorNegativos;
        mediaNegativo/=contadorPositivos;

        mostrar("La media de los "+contadorPositivos+ " números positivos -> " + mediaPositivos);
        mostrar("La media de los "+contadorNegativos+ " números negativos -> " + mediaNegativo);
        mostrar("El total de 0 es -> "+contadorCeros);

    }

    public static void mostrar(String texto) {
        System.out.println(texto);
    }
}
