package Unidad4.Actividades_Resueltas;

import java.util.Scanner;

public class Unidad4_Actividad_8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        for (int operacion=1;operacion<=4;operacion++){
            double resultado=calculadorea (3.0, 4.0, operacion);
            System.out.println(resultado);
        }

    }

    static double calculadorea (double a, double b, int operacion){
        Scanner sc=new Scanner(System.in);
        double result;
        result = switch (operacion){
                    case 1->
                        a + b;

                    case 2->
                        a - b;

                    case 3->
                        a * b;

                    case 4->
                        (double) a / b;
                    default -> {
                        System.out.println("Operación no válida");
                        yield 0;
                    }
                };
        return result;
    }
}
