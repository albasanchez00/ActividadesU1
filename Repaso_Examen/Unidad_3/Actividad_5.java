package Repaso_Examen.Unidad_3;

import java.util.Scanner;

public class Actividad_5 {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int resultado, operando1, operando2;
            int numOp=0;
            do {
                operando1=(int) (Math.random()*100+1);
                operando2=(int) (Math.random()*100+1);
                System.out.println(operando1 + " + " + operando2 + " =");
                resultado= sc.nextInt();
                numOp++;
            } while (resultado==operando1+operando2);
            System.out.println("A conseguido realizar " + (numOp -1) + " sumas consecutivas.");

        }
}
