package Unidad3.Explicaciones;

import java.util.Scanner;

public class Unidad3_Ejemplo_Decimal_a_Binario {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce el numero que quieres pasar a binario -> ");
        int decimalInicial=sc.nextInt();

        // de decimal a binario
        String binario = Integer.toBinaryString(decimalInicial);
        System.out.println(binario); // 1000

        // de binario a decimal
        int decimalConvertido = Integer.parseInt(binario, 2);
        System.out.println(decimalConvertido); // 8

    }
}
