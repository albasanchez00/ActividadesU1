package Unidad3.Explicaciones;

public class Unidad3_Ejemplo_For_Decremento {
    public static void main(String[] args) {
        //Indica el año de nacimiento.
        for (int i=2024;i>=1930; i--){
            System.out.println("Año -> " + i);
        }

        //Indica el mes.
        for (int i=1; i<=12; i++){
            switch (i){
                case 1-> System.out.println("Enero");
                case 2-> System.out.println("Febrero");
                case 3-> System.out.println("Marzo");
                case 4-> System.out.println("Abril");
                case 5-> System.out.println("Mayo");
                case 6-> System.out.println("Junio");
                case 7-> System.out.println("Julio");
                case 8-> System.out.println("Agosto");
                case 9-> System.out.println("Septiembre");
                case 10-> System.out.println("Octubre");
                case 11-> System.out.println("Noviembre");
                case 12-> System.out.println("Diciembre");
            }
        }
    }
}
