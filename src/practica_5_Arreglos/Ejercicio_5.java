package practica_5_Arreglos;

/* Hacer un programa que dado un arreglo de caracteres de tamaño
10 que se encuentra cargado, invierta el orden del contenido. Este
intercambio no se debe realizar de manera explícita, hay que
hacer un método que incluya una iteración de intercambio. */

public class Ejercicio_5 {
    public static void main(String[] args) {
        info();
        reverseArr();
    }

    public static void info() {
        System.out.println("Hacer un programa que dado un arreglo de caracteres de tamaño\r\n" + //
                "10 que se encuentra cargado, invierta el orden del contenido. Este\r\n" + //
                "intercambio no se debe realizar de manera explícita, hay que\r\n" + //
                "hacer un método que incluya una iteración de intercambio.");
    }

    public static void reverseArr() {
        final char[] arrChar = { 'a', 'm', 'k', 'l', 'p', 'u', 'b', 'r', 't', 'c' };
        final char[] inverterArr = new char[10];
        for (int i = (arrChar.length - 1), j = 0; i >= 0; i--, j++) {
            inverterArr[j] = arrChar[i];
        }
        System.out.println(inverterArr);
    }

}
