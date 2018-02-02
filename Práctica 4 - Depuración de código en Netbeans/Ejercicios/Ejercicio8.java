package pactica1;

public class Ejercicio8 {
    // la función es_primo indica si el número pasado es o no primo 
    // recordamos que un número primo es solo divisible por el mismo y 1 

    static boolean es_primo(int num) {
        boolean primo;
        int i;
        primo = true; // suponemos que el número es primo 
        // este algoritmo se puede mejorar sabiendo que si un número no es 
        // divisible entre 2 y su raíz cuadrada, entonces ya no será divisible 
        // por ningún otro números -> será primo 
        // 
        // con esta mejora podemos ahorrar muchas vueltas del while para 
        // números grandes 
        i = 2;
        while (i <= num || primo == true) {
            if (num % i == 0) // si es divisible 
            {
                primo = true; // si hemos entrado aquí significa que el número no es primo 
            }
            i++;
        }
        return (primo);
    }
    // esta función me devuelve la suma de los divisores propios. 
    // Es decir cualquier número que divida a num en el rango 1..num-1 
    // 
    // un ejemplo: 
    // los divisores propios de 24 son: 1, 2, 3, 4, 6, 8, 12 

    static int suma_divisores_propios(int num) {
        int suma;
        suma = 0;
        for (int i = 3; i < num; i++) // al ser hasta i<num no tenemos en cuenta el propio num 
        {
            if (num % i != 0) // si i divide a num 
            {
                suma += i; // acumulamos i 
            }
        }
        return (suma);
    }

    public static void main(String[] args) {
        int a, b;

        System.out.print("Introduce a: ");
        a = Entrada.entero();
        System.out.print("Introduce b: ");
        b = Entrada.entero();
        if (a == suma_divisores_propios(b) && b == suma_divisores_propios(a)) {
            System.out.println(a + " y " + b + " son amigos.");
        } else {
            System.out.println(a + " y " + b + " no son amigos...\nLa siguiente vez prueba con 220, 284.");
        }

    }
}
