package practica_2_Selectivas_e_iteractivas;

import utils.Utils;

/* 
 * 3. Escribir un programa que solicite el ingreso de un numero mayor a
    50, y lo muestre por pantalla en caso de ser multiplo de 2 o 3.
 */

/* 
 * paso a paso
 1- solicitar al usuario que ingrese un caracter tipo int mayor a 50
 2- si es menor a 50, -repetir- paso 1
 3- en caso de ser multiplo de 2 o 3, mostrar el numero ingresado por pantalla
 */

// vamos a resolver todo en main (sin diseño descendente)
public class Ejercicio_3 {
    public static void main(String[] args) {
        System.out.println("Ingrese un numero mayor a 50: ");
        int numeroUsuario = Utils.leerInt();
        if (numeroUsuario >= 50) {
            if (numeroUsuario % 2 == 0 || numeroUsuario % 3 == 0) {
                System.out.println("El numero que ingresaste es el " + numeroUsuario);
            } else {
                System.out.println("El numero ingresado es mayor a 50 pero no es multiplo ni de 2 ni de 3");
            }
        } else {
            System.out.println("Ingreso un numero menor a 50, te equivocaste papu");
        }

    }
}
