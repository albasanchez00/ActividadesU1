package Unidad5.Actividades_Resueltas;


import java.util.Arrays;

/*
*Crea cinco elementos:
* Enteros, doubles y booleanos
* Mostrarlos -> usa una funcion
 */
public class Actividad_Resuelta_1 {
    public static void main(String[] args) {
        //crear el array de números:
        int[] numeros=new int[10];
        int suma=0;
        for (int i=0;i<numeros.length;i++){
            numeros[i]= (int) (Math.random()*100+1);
            suma+=numeros[i];
        }
        System.out.println(Arrays.toString(numeros));
        System.out.println("La suma de todos los elementos =" + suma);

        //Salida interesante -> con foreach
        for (int elemento:numeros){
            System.out.print(elemento + " + " );
        }
        System.out.print("= "+ suma);

        String[] id=new String[5];
        //Inicializa con un valor predeterminado (un array).
        Arrays.fill(id,"nombre");
        System.out.println(Arrays.toString(id));
        double[] puntuacion=new double[10];
        //Inicializa los indices comprendidos de 0 a 5 con el valor de 55:
        Arrays.fill(puntuacion,0,5,55);
        System.out.println(Arrays.toString(puntuacion));


    }
}
