package practica_5_Arreglos;

/* 
 * 2. Hacer un programa que dado un arreglo ya cargado con 10
    enteros, calcule el promedio y lo muestre por la consola.
 */

public class Ejercicio_2 {
    public static void main(String[] args) {
        arrPromedio();
    }

    public static void arrPromedio() {
        final int[] arrEnteros = { 2, 5, 3, 8, 4, 25, 10, 69, 85, 9 };
        int acum = 0;
        for (int i = 0; i < arrEnteros.length; i++) {
            acum = acum + arrEnteros[i];
        }
        int promedioArray = acum / arrEnteros.length;

        System.out
                .println("El promedio entre los " + arrEnteros.length + " elementos del array es de " + promedioArray);
    }

}
