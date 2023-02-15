package ejercicios.ejercicio1;

public class Funciones {

    /**
     * Metodo qeu va a sumar los valores de
     * @param tablaMain que es pasado por parámetro y
     * @return el resultado de la suma
     */
    static int sumaArray(int[] tablaMain){
        //Declaramos las variables
        int resultado=0;    //Variable donde vamos a guardar la suma de los valores del array

        //Recorremos el array y le vamos sumando los valores a la variable resultado
        for (int fila = 0; fila < tablaMain.length; fila++) {
            resultado+=tablaMain[fila];
        }
        //Devolvemos resultado
        return resultado;
    }
}
