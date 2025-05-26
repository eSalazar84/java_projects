package practica_2_Selectivas_e_iteractivas;

import utils.*;

/* 
 * Escribir un programa que mientras el usuario ingrese un
caracter letra minúscula, acumule la cantidad de vocales que
ingresó. Finalmente muestre por pantalla dicha cantidad.
 */

/* 
 * 1- mientras el usuario ingrese un caracter minuscula
   2- acumular la cantidad de vocales que ingreso.
   3- mostrar por pantallaa dicha cantidad
 */

public class Ejercicio_11 {

    public static void main(String[] args) {
        // mientras el usuario ingrese un caracter minuscula
        System.out.println("Ingrese un caracter: ");
        char caracter = Utils.leerChar();
        int vocalesAcumuladas = 0;

        while (caracter >= 'a' && caracter <= 'z') {
            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                vocalesAcumuladas++;
                System.out.println("Cantidad de vocales que ingresó: " + vocalesAcumuladas + "\n");
            } 

            System.out.println("Ingrese otro caracter: ");
            caracter = Utils.leerChar();
        }

        System.out.println("Ingreso en total " + vocalesAcumuladas + " vocales.-");

    }
}