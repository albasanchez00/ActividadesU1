package Unidad3.Actividades_Resueltas;

import javax.swing.*;
import java.util.Scanner;

public class Actividad3_5_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int  operador1, operador2, resultadoUser, resultado=0;
        byte opcion=0;
        char simbolo=' ';
        String salida=" ";
        String menu;
        int operacionesSeguidas=0;
        do {
            menu=" ";
            menu="****Menú**** \n";
            menu="1.Sumar\n";
            menu="2.Restar\n";
            menu="3.Multiplicar\n";
            menu="4.Salir \n";
            opcion= (byte) Integer.parseInt(JOptionPane.showInputDialog(menu));
            operador1=(int)Math.floor(Math.random()*100+1);
            operador2=(int)Math.floor(Math.random()*100+1);
            System.out.print(operador1 + " + " + operador2 + " = ");
            resultado= sc.nextInt();
            operacionesSeguidas++;
            switch (opcion){
                case 1-> {
                    simbolo='+';
                    resultado= operador1 + operador2;
                    salida=operador1 + " "+ simbolo + operador2;
                }
                case 2-> {
                    simbolo='-';
                    resultado= operador1 - operador2;
                    salida=operador1 + " "+ simbolo + operador2;
                }
                case 3-> {
                    simbolo='x';
                    resultado= operador1 * operador2;
                    salida=operador1 + " "+ simbolo + operador2;
                }
                case 4-> {
                    break;
                }
            }
        } while (resultado==operador1+operador2);
        System.out.println("A conseguido realizar " + (operacionesSeguidas-1) + " sumas seguidas");

    }
}
