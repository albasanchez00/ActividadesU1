package Unidad2_ActividadesAplicacion;

import java.util.Scanner;

public class actividad2_11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean capicua=false;
        int u,d,c,um,num;
        /**********************/
        System.out.println("----CAPICUA----");
        System.out.println("Indica un número entero entre 0 y 9999: ");
        num= sc.nextInt();

        //Evaluamos Matematica:
        u=num%10; //obtengo las unidades
        num/=10; //elimino la unidad de num
        d=num%10; //obtengo las decenas
        num/=10; //elimino las decenas de num
        c=num%10; //obtengo las centenas
        num/=10; //elimino las centenas de num
        um=num%10; //obtengo las unidades de millar

        //Evaluacion logica:
        if (um==0 && d==c){
            capicua=true;
        } else if (um==0&&c==u) {
            capicua=true;
        } else if (um==0 && c==0 && d==u) {
            capicua=true;
        } else if (um==0 && c==0 && d==0) {
            capicua=true;
        }

        if (capicua){ //if (capicua == true)
            System.out.println("El número introducido es capicua.");
        } else {
            System.out.println("El número no es capicua.");
        }

    }
}
