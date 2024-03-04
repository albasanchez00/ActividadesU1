package Unidad5.Explicaciones;

import java.util.Arrays;

public class U5_Explicaciones_Ordenar {
    public static void main(String[] args) {
        //Ordenar un Array, se modifica el array...
        //Se ordena de forma creciente (^).
        //Los datos pueden ser primitivos (numéricos).
        int[] numeros={5,8,7,1,3,9,15};

        //La funcion para ordenar es Arrays,sort(nombreDeArray)
        Arrays.sort(numeros); //El array se modifica y se ordena.
        System.out.println(Arrays.toString(numeros));

        //Ordenar tipos no primitos (String)
        String nombres[]={"Maria","Ana","Xiomara","Beatriz","arantxa"};
        //Primero mostrará los nombres que empiece por mayúscula y por ultimo
        //la que empiece por minúsculas.
        Arrays.sort(nombres);
        System.out.println(Arrays.toString(nombres));
    }
}
