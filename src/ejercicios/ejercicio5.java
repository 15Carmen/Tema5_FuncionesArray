package ejercicios;

import java.util.Arrays;

public class ejercicio5 {
    /*
     * Implementar la función: int[] sinRepetidos(int t[]), que construye y devuelve una tabla de la longitud apropiada,
     * con los elementos de t, donde se han eliminado los datos repetidos.
     */

    public static void main(String[] args) {

        int[] tabla = {2, 3, 4, 5, 6, 2, 3, 4, 5};

        System.out.println(Arrays.toString(sinRepetidos(tabla)));
    }
    
    static int[] sinRepetidos(int[] tablaMain){

        //Declaramos varaibles
        int[] tablaSinRepes = new int[0];
        int numeroDeElementosSinRepetir = 0;

        // Construir una tabla sin elementos repetidos
        for (int i = 0; i < tablaMain.length; i++) {
            int elementoActual = tablaMain[i];
            int index = Arrays.binarySearch(tablaSinRepes, elementoActual);

            if (index < 0) {
                // El elemento no se encuentra en la tabla sin repetir
                tablaSinRepes = Arrays.copyOf(tablaSinRepes, tablaSinRepes.length+1);
                tablaSinRepes[numeroDeElementosSinRepetir] = elementoActual;
                numeroDeElementosSinRepetir++;
            }
        }

        return tablaSinRepes;
    }
}
