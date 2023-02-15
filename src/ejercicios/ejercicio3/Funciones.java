package ejercicios.ejercicio3;

public class Funciones {
    public static int[] rellenarPares(int longitud, int fin) {
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
