package practica_3_Diseño_Descendente;

import utils.*;

/*  
 * Cuando se pide un diseño es hacer el pseudocódigo. En
todos los casos resolver haciendo uso del diseño
descendente.
1. Escribir un diseño de programa que mientras que el usuario
ingrese un número distinto de 0, pida ingresar otro número y lo
imprima.

 * Tentativa de resolucion
 1- Pedir al usuario que ingrese un numero
 2- Mientras que el numero ingresado sea distinto de cero, repetir paso 1
 2-i- Imprimir por pantalla el numero que ingreso el usuario
 3- En caso de ser cero, terminar el programa
 */

// Tentativa sin Diseño Descendente
/* public class Ejercicio_1 {
    public static void main(String[] args) {
        int numero = 0;
        System.out.println("Ejercicio 1");
        System.out.println("Ingrese un numero natural: ");
        numero = Utils.leerInt();
        while (numero != 0) {
            System.out.println("El numero que ingresó es el " + numero);
            System.out.println("Ingrese otro numero natural: ");
            numero = Utils.leerInt();
        }
        System.out.println("Usted a ingresado el numero cero " + numero + " Gracias por usar nuestro programa");
    }
} */

// Tentativa con Diseño Descendente

public class Ejercicio_1 {
    public static int numero = 0;

    public static void main(String[] args) {
        System.out.println("Ejercicio 1");
        numero = numeroIngresado(numero);
        while (numero != 0) {
            System.out.println("El numero que ingresó es el " + numero);
            numero = numeroIngresado(numero);
        }
        System.out.println("Usted a ingresado el numero cero (" + numero + "), Gracias por usar nuestro programa");
    }

    public static int numeroIngresado(int numeroUsuario) {
        System.out.println("Ingrese un numero natural: ");
        numero = Utils.leerInt();
        return numero;
    }
}

// Por IA
/*
 * public class Ejercicio_1 {
 * public static void main(String[] args) {
 * iniciarPrograma();
 * }
 * 
 * public static void iniciarPrograma() {
 * System.out.println("Ejercicio 1");
 * procesarNumeros();
 * mostrarMensajeDespedida();
 * }
 * 
 * public static void procesarNumeros() {
 * int numero = solicitarNumero();
 * 
 * while (numero != 0) {
 * mostrarNumeroIngresado(numero);
 * numero = solicitarNumero();
 * }
 * }
 * 
 * public static int solicitarNumero() {
 * System.out.println("Ingrese un numero natural: ");
 * return Utils.leerInt();
 * }
 * 
 * public static void mostrarNumeroIngresado(int numero) {
 * System.out.println("El numero que ingresó es el " + numero);
 * }
 * 
 * public static void mostrarMensajeDespedida() {
 * System.out.
 * println("Usted ha ingresado el numero cero (0). Gracias por usar nuestro programa"
 * );
 * }
 * }
 */