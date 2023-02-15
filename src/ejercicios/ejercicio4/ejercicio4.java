package ejercicios.ejercicio4;

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

        if (Funciones.buscar(tabla,clave)!=-1){
            System.out.println("El numero se encuentra en la posicion: " + Funciones.buscar(tabla,clave));
        }else {
            System.out.println("El numero introducido no se encuentra en la tabla");
        }
    }

}
