package pactica1;

public class Ejercicio4 {

    static void mostrar(int a, int b) {
        int mayor, menor;
        // desconocemos el orden en el que vienen a y b. 
        // Lo que haremos es poner los valores correctos en mayor, menor. 

        if (a < b) { // a es el mayor. Se podría utilizar la función maximo() implementada anteriormente. 
            mayor = b;
            menor = a;
        } else { // en este caso b será el mayor mayor=b; 
            menor = b;
            mayor = a;
        }
        for (int i = menor + 1; i < mayor; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int a, b;
        System.out.print("Introduzca primer numero: ");
        a = Entrada.entero();
        System.out.print("Introduzca segundo numero: ");
        b = Entrada.entero();

        mostrar(a, b);

    }
}
