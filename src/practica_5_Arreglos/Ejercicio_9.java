package practica_5_Arreglos;

import java.util.Arrays;

import utils.Utils;

/* 
 * Hacer un programa que dado un arreglo de enteros de tamaño 10
que se encuentra cargado, solicite al usuario un número entero y
lo agregue al principio del arreglo (posición 0). Para ello tendrá
que realizar un corrimiento a derecha (se pierde el último valor del
arreglo) y colocar el número en el arreglo en la posición indicada.
 */
public class Ejercicio_9 {
    public static void main(String[] args) {
        info();
        corrimientoDerecha();
    }

    public static void info() {
        System.out.println("Hacer un programa que dado un arreglo de enteros de tamaño 10\r\n" + //
                "que se encuentra cargado, solicite al usuario un número entero y\r\n" + //
                "lo agregue al principio del arreglo (posición 0). Para ello tendrá\r\n" + //
                "que realizar un corrimiento a derecha (se pierde el último valor del\r\n" + //
                "arreglo) y colocar el número en el arreglo en la posición indicada.");
    }

    public static void corrimientoDerecha() {
        final int[] arrEnteros = { 2, 5, 3, 8, 4, 25, 10, 68, 85, 9 };
        int[] arrCorrimiento = new int[10];
        int numUser = numeroIngresado();
        arrCorrimiento[0] = numUser;
        for (int i = 1; i < arrEnteros.length; i++) {
            arrCorrimiento[i] = arrEnteros[i - 1];
        }

        // arreglo original
        System.out.println("Arreglo original:         " + Arrays.toString(arrEnteros));

        // Requerimiento del ejercicio
        System.out.println("Corrimiento a la derecha: " + Arrays.toString(arrCorrimiento));

    }

    public static int numeroIngresado() {
        System.out.println("Ingrese un numero natural: ");
        int numero = Utils.leerInt();
        return numero;
    }
}
