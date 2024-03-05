package Unidad5.Explicaciones;

import java.util.Arrays;

/*
*Busquedas en Arrays no Ordenadas.
*La busqueda se hace por medio de un algoritmo utilizando un bucle para encontrar el primer
 elemento encontrado dentro de larray, mostrando su índice.
*/
public class U5_Explicaciones_Buusqueda_Ordenada {
    public static void main(String[] args) {
        int numeros[]={13,15,18,12,11,16,19,17};
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
        int pos=Arrays.binarySearch(numeros,1);
        mostrar("Posición -> " + pos);
        if(pos<0) {
            mostrarErr("Este número no existe en la tabla");
            int indiceInsertar = pos - 1;
            mostrar("El número indicao debería ir en el índice " + indiceInsertar + " para mantener la tabla ordenda.");
        }
    }

    public static void mostrar(String texto) {
        System.out.println("\t"+texto);
    }

    public static void mostrarLn(String texto) {
        System.out.print("\n\t"+texto);
    }

    public static void mostrarErr(String texto) {
        System.err.println("\t"+texto);
    }

}


