package practica_5_Arreglos;

import utils.Utils;

/* 
 * Buscar un elemento en un arreglo de caracteres ya cargado de
    tamaño 10 y mostrar la/s posición/es del elemento, en caso de no
    estar indicarlo también.
 */

public class Ejercicio_4 {
    public static void main(String[] args) {
        info();
        findChar();
    }

    public static void info() {
        System.out.println("Buscar un elemento en un arreglo de caracteres ya cargado de\r\n" + //
                "    tamaño 10 y mostrar la/s posición/es del elemento, en caso de no\r\n" + //
                "    estar indicarlo también");
    }

    public static void findChar() {
        final char[] arrChar = { 'a', 'm', 'k', 'l', 'p', 'u', 'b', 'r', 't', 'c' };
        char charUsuario = charIngresado();
        int posicion = 0;
        for (int i = 0; i < arrChar.length; i++) {
            if (arrChar[i] == charUsuario) {
                posicion = i;
            }
        }
        
        System.out.println("El caracter que buscas, " + charUsuario + " esta en la posicion " + posicion);
        
    }

    public static char charIngresado() {
        System.out
                .println("Ingrese un caracter y le diremos si existe en el listado, ademas de la posicion donde está");
        char charUsusario = Utils.leerChar();
        return charUsusario;

    }
}
