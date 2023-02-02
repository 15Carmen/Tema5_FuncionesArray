package ejercicios;

import java.util.Arrays;

public class ejercicio2 {
    /*
     * Diseñar la función: int maximo(int t[]), que devuelva el máximo valor contenido en la tabla t.
     */

    public static void main(String[] args) {
        int tabla[] = {10, 15, 23, 51, 0, 7, 59, 4, 13, 43};

        System.out.println("El array es: " + Arrays.toString(tabla));
        System.out.println("El numero maximo del array es: " + maximo(tabla));
    }

    static int maximo(int[] tablaMain){
        int max = 0;
        for (int valor:tablaMain) {
            if (valor > max){
                max=valor;
            }
        }
        return max;
    }
}
