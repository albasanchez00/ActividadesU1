package Unidad4.Actividades_Resueltas;

public class Unidad4_Actividad_6 {
    static boolean esPrimo(int num) {
        boolean primo=true;
        int i=2;
        if (num<2){
            primo=false;
        }
        while (i<num && primo == true){
            if (num % i ==0){
                primo=false;
            }
            i++;
        }
        return (primo);
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 15; i++) {
            if (esPrimo(i)) {
                System.out.println(i + " es primo.");
            } else {
                System.out.println(i + " es compuesto");
            }
        }
    }
}
