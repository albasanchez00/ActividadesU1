package Unidad3.Explicaciones;

import java.util.Scanner;

public class Unidad3_Ejemplo_Salidas_Anticipadas_Continue {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        String nombresIng="";
        String todosNombres="";
        for (byte i=1; i<=14;i++){
            System.out.print("Indica tu nombre -> ");
            nombresIng=sn.nextLine();
            if (nombresIng.equals("Manuel") || nombresIng.equals("manuel")){
                continue;
            }
            todosNombres+=nombresIng+"\n";
        }
        System.out.println("***Alumnos***\n"+todosNombres);
    }
}
/*
*Hacer una lista de 14 personas, y saltar los que se llamen manuel
*/