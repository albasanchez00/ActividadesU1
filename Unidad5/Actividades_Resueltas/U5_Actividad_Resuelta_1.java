package Unidad5.Actividades_Resueltas;


import java.util.Arrays;

/*
*Crea cinco elementos:
* Enteros, doubles y booleanos
* Mostrarlos -> usa una funcion
 */
public class U5_Actividad_Resuelta_1 {
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



    }
}
