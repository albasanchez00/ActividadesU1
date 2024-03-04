package Unidad5.Actividades_Propuestas;


/*
*Crea cinco elementos:
* Enteros, doubles y booleanos
* Mostrarlos -> usa una funcion
 */
public class Actividad_Propuesta_1 {
    public static void tabla1(String[] args) {
        int[] entero = new int[5];
        entero[0]=10;
        entero[1]=20;
        entero[2]=30;
        entero[3]=40;
        entero[4]=50;

        double[] doble = new double[5];
        doble[0]=1.56;
        doble[1]=2.40;
        doble[2]=3.78;
        doble[3]=4.87;
        doble[4]=5.34;

        boolean[] booleano = new boolean[5];
        booleano[0]=true;
        booleano[1]=false;
        booleano[2]=true;
        booleano[3]=false;
        booleano[4]=true;

    }

    public static void main(int entero, double doble, boolean booleano) {
        for (int i=0;i<entero;i++){

        }

    }
    public static void mostrar(String texto){

        System.out.print("\t" + texto + ": ");

    }
}
