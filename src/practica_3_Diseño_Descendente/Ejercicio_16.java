package practica_3_Diseño_Descendente;

import utils.*;

/* 
 * Escribir un programa que mientras el usuario ingresa un
número de mes (entero) entre 1 y 12 inclusive, muestre por
pantalla la cantidad de días del mes ingresado (suponer febrero
de 28 días) (Mostrar por pantalla la cantidad de días del mes
debería realizarse con un método).
 */

public class Ejercicio_16 {
    public static void main(String[] args) {

        System.out.print("Ingrese el número del mes (1 a 12): ");
        int mes = Utils.leerInt();

        if (mes < 1 || mes > 12) {
            System.out.println("Mes inválido. Debe estar entre 1 y 12.");
            return;
        }

        int dias = 0;

        switch (mes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                dias = 31;
                break;

            case 4: case 6: case 9: case 11:
                dias = 30;
                break;

            case 2: {
                int año;
                while (true) {
                    System.out.print("Ingrese un año entre 2000 y 2024: ");
                    año = Utils.leerInt();
                    if (año >= 2000 && año <= 2024) {
                        break;
                    } else {
                        System.out.println("Año inválido. Intente de nuevo.");
                    }
                }

                dias = esBisiesto(año) ? 29 : 28;
                break;
            }

            default:
                // No se necesita nada porque el "if" inicial ya valida el mes
        }

        System.out.println("El mes tiene " + dias + " días.");
    }

    public static boolean esBisiesto(int año) {
        return (año % 4 == 0 && año % 100 != 0) || (año % 400 == 0);
    }
}
