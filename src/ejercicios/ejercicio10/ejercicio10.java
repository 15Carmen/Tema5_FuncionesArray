package ejercicios.ejercicio10;

import java.util.Arrays;

public class ejercicio10 {
    /**
     * Realizar una función: int[][] gira90(int tablaInicio[][]), que dada una matriz de NxN (mismo número de filas
     * y columnas), devuelve la tablaInicio girada 90º:
     */

    public static void main(String[] args) {
        int [][] tablaInicio = new int[4][4];

        System.out.println("Tabla normal:");
        for (int i = 0; i < tablaInicio.length; i++) {
            for (int j = 0; j < tablaInicio[i].length; j++) {
                tablaInicio[i][j]=(int)(Math.random()*((10-1)+1));
            }
            System.out.println(Arrays.toString(tablaInicio[i]));
        }

        System.out.println("Tabla girada:");
        for (int i = 0; i < tablaInicio.length; i++) {
            System.out.println(Arrays.toString(gira90(tablaInicio)[i]));
        }
    }

    public static int[][] gira90(int[][] tablaInicio) {
        int n = tablaInicio.length;
        int[][] tablaGirada = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                tablaGirada[i][j] = tablaInicio[n-j-1][i];
            }
        }

        return tablaGirada;
    }

}
