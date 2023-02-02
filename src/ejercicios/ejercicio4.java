package ejercicios;

import java.util.Scanner;

public class ejercicio4 {
    /*
     * Escribe la función: int buscar(int t[], int clave), que busca de forma secuencial en la tabla t el valor clave.
     * En caso de encontrarlo, devuelve en qué posición lo encuentra; y en caso contrario, devolverá -1.
     */

    public static void main(String[] args) {
        //Declaramos las variables
        int[] tabla = {14, 10, 5, 30, 25};  // Tabla en la que realizaremos la búsqueda
        int clave;                          // Valor a buscar

        //Declaramos el scanner par apoder leer por consola
        Scanner sc = new Scanner(System.in);

        //Le pedimos al usuario un numero a buscar
        System.out.println("Introduzca el numero que quiere buscar en el array");
        clave = sc.nextInt();

        if (buscar(tabla,clave)!=-1){
            System.out.println("El numero se encuentra en la posicion: " + buscar(tabla,clave));
        }else {
            System.out.println("El numero introducido no se encuentra en la tabla");
        }
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
