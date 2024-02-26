package Unidad4.Actividades_Resueltas;

public class Unidad4_Actividad_7 {
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

    static int numDivision(int num) {
        int cont=0; //contador de divisores
        for (int i=2; i<=num; i++){
            if (esPrimo(i) && num % i == 0){ //si i es primo y divide a num
                cont++; //incrementamos el numero de divisores
            }
        }
        return (cont);
    }

    public static void main(String[] args) {
        System.out.println("Divisores de 24: " + numDivision(24));
    }
}
