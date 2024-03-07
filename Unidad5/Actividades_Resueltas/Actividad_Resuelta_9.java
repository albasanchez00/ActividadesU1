package Unidad5.Actividades_Resueltas;

import java.util.*;

/*
1.Leeremos las puntuaciones en el orden en el que terminen los participantes y las ordenaremos.
2.A continuación, realizaremos una insercción ordenada (por cada programador de exhibición).
3.Una mala idea sería insertar al final la puntuación de los programadores de exhibición y volver a
 ordenar, ya que esto es muy costoso en tiempo. Es más eficiente una insercción ordenada.
*/
public class Actividad_Resuelta_9 {
    static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {
        int puntos[]=new int[5];
        for (int i=0;i<puntos.length;i++){
            System.out.println("Puntos del programador (" + (i+1) +") -> ");
            puntos[i]= sc.nextInt();
        }
        Arrays.toString(puntos);
        System.out.println("Puntuacion -> " + Arrays.toString(puntos));

        System.out.println("Puntos del programador de exhibición: ");
        int puntosExhi= sc.nextInt();
        int indiceInserccion = 0;
        while (puntosExhi!=1){
            int pos=Arrays.binarySearch(puntos,puntosExhi);
            if (pos<0){
                indiceInserccion=-pos-1;
            }else {
                indiceInserccion=pos;
            }
        int copia[]=new int[puntos.length+1];
            System.arraycopy(puntos,0,copia,0,indiceInserccion);
            System.arraycopy(puntos,indiceInserccion,copia,indiceInserccion+1,puntos.length-indiceInserccion);
            copia[indiceInserccion]=puntosExhi;
            puntos=copia;
            System.out.println("Puntos del programador de exhibición: ");
            puntosExhi= sc.nextInt();
        }
        System.out.println("Puntuación final: " + Arrays.toString(puntos));
    }
}
