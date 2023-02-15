package ejercicios.ejercicio8;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio8 {
    /**
     * Implementa la función: int[] suma(int t[], int numElementos), que crea y devuelve una tabla con las sumas de
     * los numElementos elementos consecutivos de t. Veamos un ejemplo, sea t=[10, 1, 5, 8, 9, 2]. Si los elementos de
     * t se agrupan de 3 en 3, se harán las sumas:
     *
     * 10+1+5=16
     * 1+5+8=14
     * 5+8+9=22
     * 8+9+2=19
     */

    public static void main(String[] args) {
        int longitud;
        int numElementos;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca un tamaño para el array: ");
        longitud = sc.nextInt();

        int tabla[] = new int[longitud];

        for (int i = 0; i < tabla.length; i++) {
            tabla[i] = (int) (Math.random() * 10);
        }
        System.out.println(Arrays.toString(tabla));

        System.out.println("Introduzca el número de elementos en el que agrupar el array: ");
        numElementos = sc.nextInt();

        System.out.println(Arrays.toString(suma(tabla, numElementos)));

        sc.close();
    }

    public static int[] suma(int[] t, int numElementos) {
        int[] resultado = new int[t.length - numElementos + 1];
        for (int i = 0; i < resultado.length; i++) {
            int suma = 0;
            for (int j = i; j < i + numElementos; j++) {
                suma += t[j];
            }
            resultado[i] = suma;
        }
        return resultado;
    }

}
