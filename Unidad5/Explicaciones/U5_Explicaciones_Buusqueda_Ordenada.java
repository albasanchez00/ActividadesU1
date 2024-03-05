package Unidad5.Explicaciones;

import java.util.Arrays;

/*
*Busquedas en Arrays no Ordenadas.
*La busqueda se hace por medio de un algoritmo utilizando un bucle para encontrar el primer
 elemento encontrado dentro de larray, mostrando su índice.
*/
public class U5_Explicaciones_Buusqueda_Ordenada {
    public static void main(String[] args) {
        int numeros[]={5,7,2,3,7,8,3,4,5,7,8};
        mostrar("Longitud -> " + numeros.length);
        mostrar("- Sin Ordenar -");

        mostrar(Arrays.toString(numeros));
        Arrays.sort(numeros);
        mostrar("- Ordenado -");
        mostrar(Arrays.toString(numeros));

        /*
        1.Después de ordenar el array, se puede buscar un elemento con
         la clase binarySeach(nombreArray,elementoAbuscar)

        2.El resultado de esta clase es un entero:
            -Si es positivo, es el índice donde se encuentra.
            -Si es negativo o menor que 0. Es el índice donde debería ir posicionado ese
             elemento buscado, pero que no se encuentra.
        */
        int pos=Arrays.binarySearch(numeros,8);
        mostrar("Posición ->" + pos);
    }

    public static void mostrar(String texto) {
        System.out.println("\t"+texto);
    }

    public static void mostrarLn(String texto) {
        System.out.print("\n\t"+texto);
    }

}


