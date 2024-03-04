package Unidad5.Actividades_Resueltas;

import java.util.Arrays;

public class Actividad_Resuelta_5 {
    static int[] rellenaPares (int longitud, int fin) {
        //Creamos la tabla con la longitud adecuada.
        int[] pares=new int[longitud];

        int i=0; //Indica con que elemento de tabla estamos trabajando.

        while (i<pares.length){
            //numero de pares sea igual que la longitud de la tabla.
            int num= (int) (Math.random()*fin+1);
            if (num%2==0){ //si es par.
                pares[i]=num; //lo guardamos en el elemento i.
                i++; //Incrementamos el indicador.
            }
        }
        //Ahora nos falta ordenar la tabla
        Arrays.sort(pares);
        return (pares);
    }
}
