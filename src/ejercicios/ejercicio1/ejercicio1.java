package ejercicios.ejercicio1;

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
        System.out.println(Funciones.sumaArray(tabla));
    }
}
