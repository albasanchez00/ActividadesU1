package Unidad5.Actividades_Propuestas;


/*
*Crea cinco elementos:
* Enteros, doubles y booleanos
* Mostrarlos -> usa una funcion
 */
public class Actividad_Propuesta_1 {
    public static void main(String[] args) {

        int[] ref1 = new int[5];
        ref1[0] = 23;
        ref1[1] = 52;
        ref1[2] = 18;
        ref1[3] = 32;
        ref1[4] = 45;

        double[] ref2 = new double[5];
        ref2[0] = 3.32;
        ref2[1] = 5.2;
        ref2[2] = 1.825;
        ref2[3] = 78.2;
        ref2[4] = 45.0;

        boolean[] ref3 = new boolean[5];
        ref3[0] = true;
        ref3[1] = false;
        ref3[2] = true;
        ref3[3] = true;
        ref3[4] = true;

        mostrar(ref1, ref2, ref3);

    }

    public static void mostrar(int[] ref1, double[] ref2, boolean[] ref3) {

        System.out.println(ref1 + "\n" + ref2 + "\n" + ref3);

    }
}
