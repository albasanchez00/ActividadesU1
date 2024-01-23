package Unidad1.ActividadesU1;
import java.util.Scanner;

public class Actividad1_7 {
    public static void main(String[] args) {
        double area, longitud;
        double radio;
        Scanner sc=new Scanner(System.in);

        //Pedimos los datos
        System.out.println("Escriba el radio: ");
        radio = sc.nextDouble();

        //Java.lang, que se importa por defecto
        longitud = (2 * Math.PI) * radio;
        System.out.println("Lalongitud es: " + longitud);

        //al exponente utilizado. Math.pow (base, exponente).
        area = Math.PI * Math.pow (radio,2);
        System.out.println("El área es: " + area);
    }
}
