package Unidad4.Explicaciones;

import java.util.Scanner;

public class Ejemplo_Calculadora_IMC2 {
        public static void main(String args[]){

            double peso, altura, IMC;

            Scanner in = new Scanner (System.in);

            System.out.println("Este programa puede calcular su IMC");
            System.out.println("");

            System.out.println("Introduzca su peso (kg) -> ");
            peso = in.nextDouble();
            System.out.println("");

            System.out.println("Introduzca su altura (cm) -> )");
            altura = in.nextDouble()/100;
            System.out.println("");

            IMC = peso / (Math.pow(altura, 2));

            System.out.println("Para un peso de " + peso + " kilogramos y");
            System.out.println("Para una altura de " + altura + " metros");
            System.out.println("El indice de masa corporal es " + (int)IMC);
            System.out.println("");

            if(IMC < 16){
                System.out.println("Su diagnóstico es");
                System.out.println("");
                System.out.println("Necesita ingresar en un hospital");
                System.out.println("");
            } else if(IMC < 17){
                System.out.println("Su diagnóstico es");
                System.out.println("");
                System.out.println("Usted tiene infrapeso");
                System.out.println("");
            } else if (IMC < 18){
                System.out.println("Su diagnóstico es -> ");
                System.out.println("");
                System.out.println("Usted tiene bajo peso");
                System.out.println("");
            } else if (IMC < 25){
                System.out.println("Su diagnóstico es -> ");
                System.out.println("");
                System.out.println("Usted tiene un peso normal (saludable)");
                System.out.println("");
            } else if (IMC < 30){
                System.out.println("Su diagnóstico es -> ");
                System.out.println("");
                System.out.println("Usted tiene sobre peso (obesidad grado I)");
                System.out.println("");
            } else if (IMC < 35){
                System.out.println("Su diagnóstico es -> ");
                System.out.println("");
                System.out.println("Usted tiene sobrepeso crónico (obesidad grado II)");
                System.out.println("");
            } else if (IMC < 40){
                System.out.println("Su diagnóstico es -> ");
                System.out.println("");
                System.out.println("Usted tiene obesidad premórbida (obesidad grado III)");
                System.out.println("");
            } else {
                System.out.println("Su diagnóstico es ->");
                System.out.println("");
                System.out.println("Usted tiene obesidad mórbida (obesidad grado IV)");
                System.out.println("");
            }
        }
    }