package practica_5_Arreglos;

import java.util.Arrays;

import utils.*;

/* 
 * Cargar un arreglo de tamaño 15, pidiendo el ingreso por teclado
de valores entre 1 y 12. Luego mostrar cómo quedó cargado.
 */

public class Ejercicio_1 {
    public static void main(String[] args) {
        completarArreglo();
    }

    public static void completarArreglo() {
        final int limiteArreglo = 15;
        int[] arregloEnteros = new int[limiteArreglo];
        for (int i = 0; i < limiteArreglo; i++) {
            System.out.println("Ingrese el numero que desea en la posicion " + i);
            int numeroIngresado = Utils.leerInt();
            arregloEnteros[i] = numeroIngresado;
        }

        System.out.println("El arreglo quedo conformado con los siguientes datos:");
        System.out.println(Arrays.toString(arregloEnteros));
    }
}
