package Unidad2_ActividadesAplicacion;

import java.util.Scanner;

public class Actividad1_12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numDni,calculo;
        char letra=' ';
        System.out.println("Introduce el número del DNI (sin letra): ");
        numDni=sc.nextInt();
        calculo=numDni%23; //0 al 22
        switch (calculo){
            case 1->letra='T';
            case 2->letra='R';
            case 3->letra='W';
            case 4->letra='A';
            case 5->letra='G';
            case 6->letra='M';
            case 7->letra='Y';
            case 8->letra='F';
            case 9->letra='P';
            case 10->letra='D';
            case 11->letra='X';
            case 12->letra='B';
            case 13->letra='J';
            case 14->letra='Z';
            case 15->letra='S';
            case 16->letra='Q';
            case 17->letra='V';
            case 18->letra='H';
            case 19->letra='L';
            case 20->letra='C';
            case 21->letra='K';
            case 22->letra='E';
        }
        System.out.println("La letra del DNI " + numDni + " es " + letra);
    }
}
