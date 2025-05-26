package practica_2_Selectivas_e_iteractivas;

import utils.*;

/* 
 * Escribir un programa que mientras el usuario ingrese un caracter
distinto del carácter ‘*’, muestre por pantalla si es carácter dígito, o
si es carácter vocal minúscula.
 */

//pasos
/* 
 * 1 pedir al usuario que ingrese un carcter
   2 mientras sea distinto de * 
   3 mostrar por pantalla si es digito, o caracter minuscual

 */

public class Ejercicio_7 {
    public static void main(String[] args) {
        System.out.println("Ingrese un caracter: ");
        char caracter = Utils.leerChar();

        while (caracter != '*') {
            if (caracter >= 'a' && caracter <= 'z') {
                System.out.println("El caracter " + caracter + " es una letra minuscula \n");
            } else if (caracter >= '0' && caracter <= '9') {
                System.out.println("El caracter " + caracter + " es un numero \n");
            } else {
                System.out.println("El caracter ingresado: " + caracter + " no es ni minuscula ni numero \n");
            }

            //break;
            System.out.println("Ingrese otro caracter: ");
            caracter = Utils.leerChar();
        }

        System.out.println("Gracias por usar nuestro programa.-");
    }
}
