package practica_5_Arreglos;

import java.util.Arrays;

import utils.Utils;

/* 
 * Hacer un programa que dado un arreglo de enteros de tamaño
10 que se encuentra precargado, solicite al usuario un número
entero y elimine la primera ocurrencia del número (un número
igual) en el arreglo (si existe). Para ello tendrá que buscar la
posición y si está, realizar un corrimiento a izquierda (queda una
copia de la última posición del arreglo en la anteúltima posición).
 */
public class Ejercicio_10 {
    public static void main(String[] args) {
        info();
        isOcurrencia();
    }

    public static void info() {
        System.out.println("Hacer un programa que dado un arreglo de enteros de tamaño\r\n" + //
                "10 que se encuentra precargado, solicite al usuario un número\r\n" + //
                "entero y elimine la primera ocurrencia del número (un número\r\n" + //
                "igual) en el arreglo (si existe). Para ello tendrá que buscar la\r\n" + //
                "posición y si está, realizar un corrimiento a izquierda (queda una\r\n" + //
                "copia de la última posición del arreglo en la anteúltima posición).");
    }

    public static void isOcurrencia() {
        final int[] arrEnteros = { 2, 5, 3, 8, 4, 25, 10, 68, 85, 9 };
        int[] arrCorrimiento = new int[10];
        boolean ocurrencia = false;

        int numUser = numeroIngresado();

        for (int i = 0; i < arrEnteros.length; i++) {
            if (arrEnteros[i] == numUser) {
                ocurrencia = true;
                for (int j = arrEnteros[i]; j < arrEnteros.length; j++) {
                    arrCorrimiento[i] = arrEnteros[i - 1];
                };
            } else {
                arrCorrimiento[i] = arrEnteros[i];
            }
        }

        // arreglo original
        System.out.println("Arreglo original:           " + Arrays.toString(arrEnteros));

        // Requerimiento del ejercicio
        System.out.println("Corrimiento a la izquierda: " + Arrays.toString(arrCorrimiento));

    }

    public static int numeroIngresado() {
        System.out.println("Ingrese un numero natural: ");
        int numero = Utils.leerInt();
        return numero;
    }
}
