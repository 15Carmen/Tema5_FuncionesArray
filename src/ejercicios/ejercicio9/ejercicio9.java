package ejercicios.ejercicio9;

import java.util.Arrays;

public class ejercicio9 {
    /**
     * Implementa la siguiente función: boolean esMagica(int tabla[][]), que recibe una tabla bidimensional.
     * La función devolverá true si la matriz introducida corresponde a una matriz mágica, que es aquella donde la
     * suma de los elementos de cualquier fila o de cualquier columna valen lo mismo. En caso contrario devolverá false.
     */

    public static void main(String[] args) {


        int[][] tabla = {{2,1}, {1,2}};
        /*
         int[][] tabla = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                tabla[i][j] = (int)((Math.random()*(10-1)+1));
            }
        }
*/
        if (!esMagica(tabla)){
            System.out.println("\nLa matriz no es magica");
        }else {
            System.out.println("\nLa matriz es mágica");
        }

    }

    public static boolean esMagica(int[][] tabla){
        boolean esMagica = false;
        int sumaFilas = 0;
        int sumaColumnas = 0;
        int auxiliarSuma = 0;

        for (int i = 0; i < 2; i++) {
            auxiliarSuma=0;
            for (int j = 0; j < 2; j++) {
                auxiliarSuma+=tabla[i][j];
            }
            sumaFilas+=auxiliarSuma;

            //Imprimimos la fila del array
            System.out.print(Arrays.toString(tabla[i]));
            //Y seguidamente imprimimos el total de la suma de los elementos de la fila
            System.out.println(auxiliarSuma);
        }

        //Con un bucle for hacemos la suma de las columnas
        for (int i = 0; i < 2; i++) {
            auxiliarSuma=0;                         //Reiniciamos la variable auxiliarSuma a 0
            for (int j = 0; j < 2; j++) {
                auxiliarSuma += tabla[j][i];        //Le vamos sumando los numeros que vamos leyendo a la variable auxiliar
            }
            sumaColumnas += auxiliarSuma;           //Le sumamos a la variable sumaColumnas el total de la suma auxiliar
            System.out.print(auxiliarSuma + " ");   //La imprimimos por pantalla y separamos los numeros con un espacio
        }

        if (sumaFilas == sumaColumnas){
            esMagica = true;
        }

        return esMagica;
    }
}
