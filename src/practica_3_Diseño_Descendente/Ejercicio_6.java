package practica_3_Diseño_Descendente;

import utils.*;

/* 
 * Escribir un programa que mientras el usuario cargue desde
teclado un carácter letra minúscula, llame a un método que
imprime por pantalla la tabla de multiplicar del 9.
1. pedir al usuario que ingrese un caracter minuscula
2. si es minuscula, imprimir la tabla del 9; sino, segui de largo
 */

public class Ejercicio_6 {

    public static void main(String[] args) {
        System.out.println("Ingrese un letra minuscula cualquiera");
        char caracterUsuario = Utils.leerChar();

        procesarInformacion(caracterUsuario);
    }

    // CON DISEÑO DESCENDENTE

    public static void procesarInformacion(char valor) {
        if (valor >= 'a' && valor <= 'z') {
            tablaDel9();
        } else {
            System.out.println("Caracter ingresado no válido.-");
        }
    }

    public static void tablaDel9() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("9 x " + i + "= " + 9 * i);
        }
    }
}
