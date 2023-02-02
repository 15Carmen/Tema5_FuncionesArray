package ejercicios;

public class ejercicio1 {
    /*
     * Realiza una función que reciba como parámetro una tabla de enteros y devuelva la suma de todos los valores
     * almacenados en la tabla. Prueba el comportamiento de la función en un método main.
     */

    public static void main(String[] args) {
        //Declaramos el array
        int tabla[] = {2, 3, 4, 5, 6, 7};

        //Imprimimos el resultado de la función
        System.out.print("El resultado de la suma de los numeros del array es: ");
        System.out.println(sumaArray(tabla));
    }


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
