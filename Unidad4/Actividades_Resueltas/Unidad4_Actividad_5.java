package Unidad4.Actividades_Resueltas;

public class Unidad4_Actividad_5 {
    //programa pincipal para probar la funcion
    public static void main(String[] args) {
        System.out.println("La i es una vocal -> " + comprobar('i'));
        System.out.println("La E es una vocal -> " + comprobar('E'));
        System.out.println("La f es una vocal -> " + comprobar('f'));
    }

    public static boolean comprobar(char c) {
        boolean resultado;
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
            resultado = true;
        } else {
            resultado = false;
        }
        return resultado;
    }
}
