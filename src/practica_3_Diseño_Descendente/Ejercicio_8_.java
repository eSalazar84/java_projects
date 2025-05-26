package practica_3_Diseño_Descendente;

import utils.*;

/* Realizar un programa que dado dos números enteros y un
carácter (todos ingresados por el usuario) muestre por pantalla el
resultado de una operación matemática básica según el valor del
carácter ingresado. Si se ingresó el carácter ‘a’ debe realizar la
suma, para ‘b’ la resta, para ‘c’ la multiplicación y para ‘d’ la
división entre ambos números. */

public class Ejercicio_8_ {

    public static void main(String[] args) {
        welcome();
        char op = charUser();
        calculadora(op);
    }

    public static void welcome() {
        System.out.println("Calculadora de numeros básicos");
        System.out.println("Para sumar, ingresa 'a'");
        System.out.println("Para restar, ingresa 'b'");
        System.out.println("Para multiplicar, ingresa 'c'");
        System.out.println("Para dividir, ingresa 'd'");
    }

    public static char charUser() {
        System.out.println("Que operacion vas a realizar?");
        char res = Utils.leerChar();
        return res;
    }

    public static double numberOneUser() {
        System.out.println("Ingresa el primer numero");
        double res = Utils.leerDouble();
        return res;
    }

    public static double numberTwoUser() {
        System.out.println("Ingresa el segundo numero");
        double res = Utils.leerDouble();
        return res;
    }

    public static void sumarNumeros(double num1, double num2) {
        double result = num1 + num2;
        System.out.println("La suma de " + num1 + " + " + num2 + " = " + result);
    }

    public static void restarNumeros(double num1, double num2) {
        double result = num1 - num2;
        System.out.println("La resta de " + num1 + " - " + num2 + " = " + result);
    }

    public static void multiplicarNumeros(double num1, double num2) {
        double result = num1 * num2;
        System.out.println("La multiplicacion de " + num1 + " * " + num2 + " = " + result);
    }

    public static void divisionNumeros(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("No se puede hacer divisiones por cero.-");
        } else {
            double result = num1 / num2;
            System.out.println("La division de " + num1 + " / " + num2 + " = " + result);
        }
    }

    public static void calculadora(char op) {
        while (op == 'a' || op == 'b' || op == 'c' || op == 'd') {
            switch (op) {
                case 'a':
                    double num1 = numberOneUser();
                    double num2 = numberTwoUser();
                    sumarNumeros(num1, num2);
                    op = charUser();
                    break;
                case 'b':
                    num1 = numberOneUser();
                    num2 = numberTwoUser();
                    restarNumeros(num1, num2);
                    op = charUser();
                    break;
                case 'c':
                    num1 = numberOneUser();
                    num2 = numberTwoUser();
                    multiplicarNumeros(num1, num2);
                    op = charUser();
                    break;
                case 'd':
                    num1 = numberOneUser();
                    num2 = numberTwoUser();
                    divisionNumeros(num1, num2);
                    op = charUser();
                    break;

                default:
                    break;
            }
            System.out.println("Ingreso un caracter invalido.-");
        }
    }

}