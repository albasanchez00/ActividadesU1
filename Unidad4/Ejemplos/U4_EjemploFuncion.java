package Unidad4.Ejemplos;

public class U4_EjemploFuncion {
    public static void tresSaludos() {
        System.out.println("Te vamos a saludar 3 veces");
        for (int i=0;i<3;i++){
            System.out.println("Hola");
        }
    }


    public static void main(String[] args) { //Funcion o metodo
        //Se llana las funciones o metodos que s evan a ejecutar
        tresSaludos(); //Se llama la funcion para que se ejecute
        tresSaludos(); //Se llama la funcion para que se ejecute
        tresSaludos(); //Se llama la funcion para que se ejecute
    }
}
