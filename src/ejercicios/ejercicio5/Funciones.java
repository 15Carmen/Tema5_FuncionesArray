package ejercicios.ejercicio5;

import java.util.Arrays;

public class Funciones {

    public static int[] sinRepetidos(int[] tablaMain){

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
