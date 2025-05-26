package practica_3_Diseño_Descendente;

/* 
 * Hacer un método que dado un número entero con valor inicial 1,
haga una iteración incrementando el número de a uno hasta un
valor MAX = 4 (constante). Mientras itera deberá imprimir el
número. Luego invocarlo desde el programa principal y cuando
termina, imprimir por pantalla “terminó”.


 */

public class Ejercicio_5 {

    public static void main(String[] args) {
        imprimirNumeros();

        System.out.println("Terminó");
    }

    public static void imprimirNumeros() {
        final int valorMax = 4;

        for (int i = 1; i <= valorMax; i++) {
            System.out.println("Numero: " + i);
        }
    }
}
