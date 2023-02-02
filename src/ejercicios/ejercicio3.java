package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio3 {
    /*
     * Escribir la función int[] rellenaPares(int longitud, int fin), que crea y devuelve una tabla ordenada de
     * la longitud especificada, que se encuentra rellena con números pares aleatorios comprendidos entre 2 hasta
     * fin inclusive.
     */

    public static void main(String[] args) {

        int longitud;
        int fin;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca la longitud del array: ");
        longitud = sc.nextInt();
        System.out.println("Introduzca hasta que numero quiere que sean los valores del array: ");
        fin = sc.nextInt();

        System.out.println(Arrays.toString(rellenarPares(longitud, fin)));

    }

    static int[] rellenarPares(int longitud, int fin) {
        int[] tabla = new int[longitud];
        int numAleatorio = 0;


        for (int fila = 0; fila < tabla.length; fila++) {
            do {
                numAleatorio = (int) (Math.random() * (fin - 2 + 1) + 2);
            } while (numAleatorio % 2 != 0);

            tabla[fila] = numAleatorio;
        }


        return tabla;
    }
}
