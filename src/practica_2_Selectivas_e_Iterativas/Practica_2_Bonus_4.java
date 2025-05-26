package practica_2_Selectivas_e_Iterativas;

import utils.*;

/*
 a. Dado un caracter ingresado por el usuario: imprimir si es
caracter minúscula, o imprimir si es carácter mayúscula, o
imprimir no es caracter letra 
*/

public class Practica_2_Bonus_4 {

    /* public class Practica_2_Bonus_4 {
        public static void main(String[] args) {
            char caracter;
            System.out.println("Ingrese un caracter :");
            caracter = Utils.leerChar();
            if (('a' <= caracter) || (caracter <= 'z')) {
                System.out.println("Es carácter minúscula");
            }
            if (('A' <= caracter) && (caracter <= 'Z')) {
                System.out.println("Es carácter mayúscula");
            } else {
                System.out.println("No es caracter letra");
            }
        }
    } */

    public static void main(String[] args) {
        // char caracter;
        System.out.println("Ingrese un caracter :");
        char caracter = Utils.leerChar();
        if (caracter >= 'a' && caracter <= 'z') {
            System.out.println("Es carácter minúscula");
        } else if ((caracter >= 'A') && (caracter <= 'Z')) {
            System.out.println("Es carácter mayúscula");
        } else {
            System.out.println("No es caracter letra");
        }
    }

}
