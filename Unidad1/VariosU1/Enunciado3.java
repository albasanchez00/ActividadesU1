package Unidad1.VariosU1;

/**
 * Enunciado:
 *
 */

import java.util.Scanner;

public class Enunciado3 {
    public static void main(String[] args){
        Scanner sn=new Scanner(System.in); //Declarar el scanner
        System.out.println("Indica cuantas niñas hay matriculadas");
        short ninas=sn.nextShort();
        System.out.println("Indicar cuantos niños hay matriculados");
        short ninos=sn.nextShort();
        int totalMatriculados=ninas+ninos;
        double porcentajeNinas=(double) (ninas*100/totalMatriculados); // regla de 3
        double porcentajeNinos=(double) (ninos*100/totalMatriculados); // regla de 3
        System.out.println("El porcentaje de niñas matriculadas es " +porcentajeNinas);
        System.out.println("El porcentaje de niños matriculados es " +porcentajeNinos);

    }
}
