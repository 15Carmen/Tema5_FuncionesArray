package ejercicios.ejercicio5;

import java.util.Arrays;

public class ejercicio5 {
    /*
     * Implementar la función: int[] sinRepetidos(int t[]), que construye y devuelve una tabla de la longitud apropiada,
     * con los elementos de t, donde se han eliminado los datos repetidos.
     */

    public static void main(String[] args) {

        int[] tabla = {2, 3, 4, 5, 6, 2, 3, 4, 5};

        System.out.println(Arrays.toString(Funciones.sinRepetidos(tabla)));
    }

}
