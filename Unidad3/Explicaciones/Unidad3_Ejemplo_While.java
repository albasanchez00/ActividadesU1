package Unidad3.Explicaciones;
//1º Ejemplo
public class Unidad3_Ejemplo_While {
    public static void main(String[] args) {
        int i = 1;//valor inicial
        boolean t=true;
        while (t){ //El bucle iterará mientras i sea menor o igual que 3
        System.out.println(i); //Mostramos i
        i++; //Incrementamos
            if (i>=3){
                t=false;
            }
        }
    }
}


//2º Ejemplo
//public class Unidad3_EjemploWhile {
//    public static void main(String[] args) {
//        int i = 1;//valor inicial
//        while (t){ //El bucle iterará mientras i sea menor o igual que 3
//            System.out.println(i); //Mostramos i
//            i++; //Incrementamos
//            }
//        }
//    }
//}