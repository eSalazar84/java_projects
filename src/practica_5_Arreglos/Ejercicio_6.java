package practica_5_Arreglos;

/* 
 * Hacer un programa que dado un arreglo de enteros de tamaño 10
que se encuentra cargado, obtenga la cantidad de números pares
que tiene y la imprima.
 */
public class Ejercicio_6 {
    public static void main(String[] args) {
        info();
        contarPares();
    }

    public static void info() {
        System.out.println("Hacer un programa que dado un arreglo de enteros de tamaño 10\r\n" + //
                "que se encuentra cargado, obtenga la cantidad de números pares\r\n" + //
                "que tiene y la imprima.");
    }

    public static void contarPares() {
        final int[] arrEnteros = { 2, 5, 3, 8, 4, 25, 10, 68, 85, 9 };
        int acum = 0;
        for (int i = 0; i < arrEnteros.length; i++) {
            if (arrEnteros[i] % 2 == 0) {
                acum++;
                System.out.println("Numero par encontrado: " + arrEnteros[i]);
            }
        }
        System.out.println("Hay " + acum + " numeros pares en el arreglo");
    }

}
