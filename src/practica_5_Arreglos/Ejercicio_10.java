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
        // copiarArreglo();
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

    final static int MAX = 10;
    final static int[] arrEnteros = { 2, 5, 3, 8, 4, 25, 10, 68, 85, 9 };

    public static int[] copiarArreglo() {
        int[] arrCorrimiento = new int[MAX];

        for (int i = 0; i < arrEnteros.length; i++) {
            arrCorrimiento[i] = arrEnteros[i];
        }

        return arrCorrimiento;
    }

    public static int numeroIngresado() {
        System.out.println("Ingrese un numero natural: ");
        int numero = Utils.leerInt();
        return numero;
    }

    public static void isOcurrencia() {

        int[] arreglo = copiarArreglo();

        int numUser = numeroIngresado();
        int pos = -1;

        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == numUser) {
                pos = i;
            }
        }

        if (pos != -1) {
            for (int i = pos; i < arreglo.length - 1; i++) {
                arreglo[i] = arreglo[i + 1];
            } 
            arreglo[arreglo.length - 1] = 0;
        }

        // arreglo original
        System.out.println("Arreglo original:           " + Arrays.toString(arrEnteros));

        // Requerimiento del ejercicio
        System.out.println("Corrimiento a la izquierda: " + Arrays.toString(arreglo));
    }
}
