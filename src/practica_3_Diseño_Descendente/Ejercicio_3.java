package practica_3_Diseño_Descendente;

import utils.*;

/* 
 * 
 * 3. Escribir un diseño de programa que mientras que el usuario
ingrese un número natural, pida ingresar otro número cualquiera y
lo imprima.
 */

/* 
 * tentativa
 1- pedir al usuario que ingrese un numero natural
 2- mientras que el usuario siga ingresando un numero natural:
       2i- imprimir, e ir dejando impreso los anteriores
 3- si el usuario presiona una tecla, se termina el programa.
 */

public class Ejercicio_3 {
    public static void main(String[] args) {
        iniciarPrograma();
    }

    public static void iniciarPrograma() {
        System.out.println("\n Ejercicio 3 \n");
        System.out.println("Te vamos a mostrar todos los numeros que ingreses, hasta que quieras salir");
        procesarInformacion();
    }

    public static String numeroIngresado(String historial) {
        System.out.println("Ingrese un numero natural: ");
        int num = Utils.leerInt();
        historial += num + ", "; // Concatena el nuevo número
        return historial; // Retorna el historial actualizado
    }

    public static char seguirPrograma(){
        System.out.println("si queres seguir con el programa presiona cualquier tecla, para salir presiona 's'");
        return Utils.leerChar();
    }

    public static void procesarInformacion() {
        char opcion;
        String historial = ""; // Paso 1: String vacío
        
        opcion = seguirPrograma();        
        while (opcion != 's') {
            historial = numeroIngresado(historial); // Paso 2: Actualiza historial
            System.out.println("Números ingresados: " + historial); // Muestra todo
            opcion = seguirPrograma();
        }
    }
}