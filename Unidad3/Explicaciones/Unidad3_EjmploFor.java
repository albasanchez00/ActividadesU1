package Unidad3.Explicaciones;

public class Unidad3_EjmploFor {
    public static void main(String[] args) {
        for (int i=0; i<=10; i++){
            System.out.println("El valor de i es -> "+i);
        }
    }
}



/* Este ejemplo no seria posible:
public class Unidad3_EjmploFor {
    public static void main(String[] args) {
        int i;
        for (int i=0; i<=10; i++){
            System.out.println("El valor de i es -> "+i);
        }
        **Si la variable i está declarada de for, solo se puede obtener su valor dentro del
        *bloque for, por tener ambito local.
        System.out.println("El valor de i es -> "+i);
    }
}
 */