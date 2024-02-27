package Repaso_Examen.Unidad_1;

import java.util.Scanner;

public class Actividad_10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean llueve, finTarea, blibio;
        System.out.println("¿Está lloviendo? (true/false).");
        llueve=sc.nextBoolean();
        System.out.println("¿Has terminado la tarea? (true/false).");
        finTarea=sc.nextBoolean();
        System.out.println("¿Tienes que ir a la blibioteca? (true/false).");
        blibio=sc.nextBoolean();
        boolean salir=llueve&&finTarea||blibio;
        System.out.println("¿Puedes salir a la calle?" + "\n"+salir);
    }
}
