package ejercicios.ejercicio2;

public class Funciones {

    static int maximo(int[] tablaMain){
        int max = 0;
        for (int valor:tablaMain) {
            if (valor > max){
                max=valor;
            }
        }
        return max;
    }
}
