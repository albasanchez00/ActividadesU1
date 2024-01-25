package Unidad2.Unidad2_ActividadesFinales;

import java.util.Scanner;

public class Activadad2_13 {
    public static void main(String[] args) {
        //Granja y calculo de raciones.
        Scanner sc=new Scanner(System.in);

        //Variables:
        int numAnimales;
        double comidaDiaria,kgAnimal, racion;

        //Pedimos los datos al usuario:
        System.out.print("Introduce el número de animales: ");
        numAnimales=sc.nextInt();
        System.out.print("Introduce la cantidad de comida disponible: ");
        comidaDiaria=sc.nextDouble();
        System.out.print("Introduce cuanta comida come cada animal: ");
        kgAnimal=sc.nextDouble();

        //Analizamos los datos, si la cantidad de comida > numAnimales * kgAnima,
        //entonces tendria suficiente comida.

        if (comidaDiaria>=numAnimales){
            System.out.println("Hay suficiente comida.");
        } else {
            System.out.println("No hay suficiente comida, hay que ajustar la ración.");
            //si esta condicion se cumple, solicitan que calcule la racion necesaria.
            // y evitemos la division entre 0
        }
        if (numAnimales!=0){
            racion=comidaDiaria/numAnimales;
            System.out.println("Ajustando a lo que hay, los animales comeran " + racion + "kg" +
                    " y no tendran los kilos iniciales ("+ kgAnimal+"kg)");
        }
    }
}
