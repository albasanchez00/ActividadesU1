package Unidad1.ActividadesU1;

import java.util.Scanner;

public class Actividad1_10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean llueve, finalizandoTareas, irBiblioteca;

        System.out.println("¿Está lloviendo? (true/false): ");
        llueve = sc.nextBoolean();
        System.out.println("¿Has terminado la tarea? (true/false): ");
        finalizandoTareas = sc.nextBoolean();
        System.out.println("¿Tienes que ir a la biblioteca? (true/false): ");
        irBiblioteca = sc.nextBoolean();

        boolean salir = !llueve && finalizandoTareas || irBiblioteca;
        System.out.println("Puedes salir: " + salir);
    }
}
