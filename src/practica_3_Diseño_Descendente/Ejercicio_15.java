package practica_3_Diseño_Descendente;

import utils.Utils;

/* 
 * Escribir un programa que mientras que el usuario ingrese un
    número entero natural, llame a un método que calcule la
    sumatoria desde 1 a dicho número (Ej: si n= 5 sumatoria =
    1+2+3+4+5=15) y retorne el resultado.
 */
// No modifica tu archivo, solo es un ejemplo aparte

public class Ejercicio_15 {
    public static void main(String[] args) {
        int numUsuario = numeroIngresado();
        procesarInformacion(numUsuario);
    }

    public static int numeroIngresado() {
        System.out.println("Por favor, ingrese un numero entero natural");
        int intUsuario = Utils.leerInt();
        return intUsuario;
    }

    public static void procesarInformacion(int numero) {
        int acum = 0;
        String cuenta = "";
        for (int i = 1; i <= numero; i++) {
            acum += i;
            cuenta += i;
            if (i < numero) {
                cuenta += "+";
            }
        }
        System.out.println("La sumatoria desde 1 a " + numero + " es " + cuenta + "= " + acum);
    }
}