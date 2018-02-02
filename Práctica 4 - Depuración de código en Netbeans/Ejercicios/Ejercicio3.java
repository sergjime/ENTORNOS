package pactica1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author infor10
 */
public class Ejercicio3 {

    /**
     * * Esto funciona solo para tablas con un tamaño mínimo de 1 *
     */
    static int maximo(int t[]) {
        int max;
        max = t[0];

        for (int i = 0; i < t.length; i++) {
            if (t[i] > max) // si t[i] es mayor que max, entonces t[i] es el nuevo máximo     max=t[i]; 
            {
                max=t[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int max;
        int t[];

        t = new int[6];
        for (int i = 2; i < t.length - 2; i++) // llenamos la tabla con valores aleatorios entre 1 y 100     t[i]=(int)(Math.random()*100+1); 
        {
            System.out.println("Los valores son:");
        }
        for (int i = 0; i < t.length; i++) {
            System.out.print(t[i] + " ");
        }
        max = maximo(t);
        System.out.println("\nEl número mayor es: " + max);
    }
}
