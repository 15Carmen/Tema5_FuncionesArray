package ejercicios;

import java.util.Arrays;

public class ejercicio6 {
    /*
     * Escribir la función: int[] eliminarMayores(int t[], int valor), que crea y devuelve una copia de la tabla t
     * donde se han eliminado todos los elementos que son mayores que valor.
     */

    public static void main(String[] args) {

    }

    static int[] eliminarMayores(int[] tablaMain, int valor){

        //Declaramos varaibles
        int[] tablaSinMayores = new int[0];



        return tablaSinMayores;
    }

    static int buscar(int[] tablaMain, int clave) {

        //Declaramos las varaibles
        int indiceBusqueda = 0; // En este índice almacenaremos el índice en el que se encuentre el elemento buscado
        int resultado;          //Variable donde vamos a guardar el resultado del metodo

        while (indiceBusqueda < tablaMain.length && clave != tablaMain[indiceBusqueda]) { // Mientras no encontremos el valor y no hayamos llegado al final de la tabla
            indiceBusqueda++;   // incrementamos en 1 el índice de búsqueda
        }

        if (indiceBusqueda < tablaMain.length) {        // Si el índice sea menor que la longitud de la tabla
            resultado = indiceBusqueda;                 // significa que hemos encontrado el elemento
        } else {                                        // En caso contrario
            resultado = -1;                             //Devolvemos -1
        }

        return resultado;
    }
}
