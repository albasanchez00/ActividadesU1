package Unidad2.Unidad2_ActividadesFinales;

import java.util.Scanner;




public class Actividad2_14 {
    public static void main(String[] args) {
        //Declaración de las variables
        Scanner sc=new Scanner(System.in);
        byte num; //numweo que leere
        System.out.println("Introduce un numero entre 1 y 99 -> ");
        num= sc.nextByte();
        String salida="";
        /*
        *1.Numeros especiales = SWITCH: once, doce, tece, catorce, quience,
        * dieciseis, diecisiete, dieciocho, diecinueve
        * 2.Calculamos las decenas -> byte u=num%10     d=num/10   ->   switch con las decenas: diez, veinte...
        * 3.Si u!=0 creamos una condicion que al concatenar con "y"
        * 4.Swich de nidades del 1 al 9.
         */


        /*
        *2->Logica, .....hacer un switch del 1 al 99, escribiendo ttodos los posibles resultados...
         */
        //Desarollo de la logica.
        switch (num){
            case 11-> salida="Once";
            case 12-> salida="Doce";
            case 13-> salida="Trece";
            case 14-> salida="Catorce";
            case 15-> salida="Quince";
            case 16-> salida="Diez y seis";
            case 17-> salida="Diez y siete";
            case 18-> salida="Diez y ocho";
            case 19-> salida="Diez y nueve";
            case 21-> salida="Veinte y uno";
            case 22-> salida="Veinte y dos";
            case 23-> salida="Veinte y tres";
            case 24-> salida="Veinte y cuatro";
            case 25-> salida="Veinte y cinco";
            case 26-> salida="Veinte y seis";
            case 27-> salida="Veinte y siete";
            case 28-> salida="Veinte y ocho";
            case 29-> salida="Veinte y nueve";
            default-> {
                byte u = (byte) (num % 10);
                int d = num / 10;
                switch (d) {
                    case 1 -> salida = "Diez";
                    case 2 -> salida = "Veinte";
                    case 3 -> salida = "Treinta";
                    case 4 -> salida = "Cuarenta";
                    case 5 -> salida = "Cincuenta";
                    case 6 -> salida = "Sesenta";
                    case 7 -> salida = "Setenta";
                    case 8 -> salida = "Ochenta";
                    case 9 -> salida = "Noventa";
                }
                //Luego si la decena es mayor o igual a 3 y la unidad es distinta a 0
                if (d >= 3 && u != 0) {
                    salida += " y ";
                }
                switch (u) {
                    case 1-> salida += "uno";
                    case 2-> salida += "dos";
                    case 3-> salida += "tres";
                    case 4-> salida += "cuatro";
                    case 5-> salida += "cinco";
                    case 6-> salida += "seis";
                    case 7-> salida += "siete";
                    case 8-> salida += "ocho";
                    case 9-> salida += "nueve";
                }
            }
        }
        System.out.println("El numero se escribe-> " + salida);
    }
}
