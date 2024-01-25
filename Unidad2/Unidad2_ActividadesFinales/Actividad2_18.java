package Unidad2.Unidad2_ActividadesFinales;

import java.util.Scanner;

public class Actividad2_18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1,num2;
        int operador=(int) (Math.random()*3+1);;
        num1=(int)Math.floor(Math.random()*100+1);
        num2=(int)Math.floor(Math.random()*100+1);
        System.out.println(num1 + operador + num2 + " = ");
        int resultado=0;
        char simbolo=' ';
        switch (operador){
            case 1-> {
                simbolo='+';
                resultado=num1+num2;
            }
            case 2-> {
                simbolo='-';
                resultado=num1-num2;
            }
            case 3->{
                simbolo='x';
                resultado=num1*num2;
            }
        }
        System.out.println("¿Cuanto es " + num1 +" " +simbolo+" "+num2+" ?");
        int resultUser= sc.nextInt();
        if (resultado==resultUser){
            System.out.println("Operacioón correcta");
        } else {
            System.out.println("Operacion incorrecta");
        }

    }
}
