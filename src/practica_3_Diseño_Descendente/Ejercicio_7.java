package practica_3_Diseño_Descendente;

import utils.*;

/* 
 * Escribir un programa que mientras el usuario cargue desde
teclado un número entero distinto de 0, imprima por pantalla la
suma que se obtiene de invocar un método que calcula la
sumatoria de los primeros 200 números naturales (son números
enteros entre 1 y 200).

1- pedir al usuario un numero distinto de cero

 */

public class Ejercicio_7 {
    public static void main(String[] args) {
        final int finalizarPrograma = 0;
        final int numero200 = 200;

        System.out.println("Bienvenidos al sistema.");
        System.out.println(
                "Para iniciar el programa, ingrese un numero distinto de cero. \n Para finalizar, ingrese cero (0)");

        int ingresoUsuario = Utils.leerInt();

        while (ingresoUsuario != finalizarPrograma) {
            int acum = 0;
            for (int i = 1; i <= numero200; i++) {
                acum = i + acum;
            }
            System.out.println("La sumatoria de los primeros 200 numeros naturales es de " + acum);

            System.out.println("Si desea continuar, marque cualquier numero, de lo contrario ingrese cero");
            ingresoUsuario = Utils.leerInt();
        }
    }
}
