package ejercicios.ejercicio3;

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

        System.out.println(Arrays.toString(Funciones.rellenarPares(longitud,fin)));

    }


}
