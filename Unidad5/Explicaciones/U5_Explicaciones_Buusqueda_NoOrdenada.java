package Unidad5.Explicaciones;
/*
*Busquedas en Arrays no Ordenadas.
*La busqueda se hace por medio de un algoritmo utilizando un bucle para encontrar el primer
 elemento encontrado dentro de larray, mostrandu su índice.
*/
public class U5_Explicaciones_Buusqueda_NoOrdenada {
    public static void main(String[] args) {
        int[] numeros={5,3,7,977,3,6,8,1,4,98,44};
        mostrar("Longitud de la tabla ->" + numeros.length);
        int indice=0; //Declaramos el índice en 0 para que empiece desde ese punto el recorrido del bucle
        int numBuscado=977; //Ejemplo de un número a buscar.
        while (indice<numeros.length && numeros[indice]!=numBuscado){
            indice++; //Se incrementa el índice para ir recorriendo las posiciones del array.
        }
        if (indice<numeros.length) //Confirmamos que el índice no se ha salido del rango
        mostrar("La posición del número buscado es -> "+indice);
        else //Si es mayor o igual que la longitud, quiere decir que no se ha encontrado el elemento buscado
            mostrar("El número buscado no está en la tabla");

        //Ejemlpo de busqueda, utilizando una función, con cadena de carácteres:
        String nombre[]={"María","Pedro","Juan","Irene","Isabel","José","Alba","Enrique"};
        buscarTexto(nombre,"Alba");
    }

    public static void mostrar(String texto) {
        System.out.println("\t"+texto);
    }

    public static void mostrarLn(String texto) {
        System.out.print("\n\t"+texto);
    }

    public static void buscarTexto(String texto[], String buscar) {
        int indice=0;
        while (indice<texto.length && !texto[indice].equals(buscar)){
            indice++;
        }
        if (indice<texto.length)
            mostrar("La posición del nombre buscado es -> "+indice);
        else
            mostrar("El nombre buscado no está en la tabla");
    }

}


