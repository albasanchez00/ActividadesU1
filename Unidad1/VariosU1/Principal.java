package Unidad1.VariosU1;

import java.util.Scanner;

public class Principal {
    //PARA CREAR UNA FUNCION PRINCIPAL utilizamos el meodo abreviado PSVM (Public Static Void Main)
    public static void main(String[] args) {
        //MOSTRAR EN PANTALLA TEXTO y resultado (sout).
        //EL TEXTO SIEMPRE IRA ENTRE "" y se mostrara textualmente en la consola
        //para ejecutarlo, pulsamos May + f10
        System.out.println("Hola Mundo");
        //Como solicitar informacion usuario, debermos declarar la clase Scanner
        Scanner sn=new Scanner(System.in);
        System.out.println("Indica tu edad");
        byte edad= sn.nextByte();
        System.out.println("Tu edad es " + edad + " años");

        String mensaje=3<5? "tres es menor que cinco":"tres es mayor que cinco";
        //1.12 Actividad.



    }

}
