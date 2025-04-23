package practica_3_Diseño_Descendente;

import utils.*;

/* 
 * 2. Escribir un diseño de programa que mientras que el usuario
ingrese un carácter dígito o carácter letra minúscula, imprima
dicho carácter, y si es carácter letra minúscula, imprima si es vocal
o consonante.
 */

/* 
 * 
 1- Pedir al usuario que ingrese un valor por teclado
 2- Puede pasar dos cosas:
        i-  ingrese un valor digito
        ii- ingrese un caracter letra minuscula 
     En caso de ser ii, imprimir dicho caracter y ademas, detectar si es vocal o consonante
 */

public class Ejercicio_2 {
   public static void main(String[] args) {
      iniciarPrograma();
   }

   public static void iniciarPrograma() {
      System.out.println("\n Ejercicio 2 \n");
      procesarInformacion();
      preguntarAlUsuario();
      mostrarMensajeDespedida();
   }

   public static char datoIngresado() {
      System.out.println("Ingrese un valor de teclado cualquiera: ");
      return Utils.leerChar();
   }

   public static boolean isVocal(char userInput) {
      if (userInput == 'a' || userInput == 'e' || userInput == 'i' || userInput == 'o' || userInput == 'u') {
         return true;
      }
      return false;
   }

   public static boolean isInt(char userInput) {
      if (userInput >= '0' && userInput <= '9') {
         return true;
      }
      return false;
   }

   public static void preguntarAlUsuario(){
      int opcion;
      System.out.println("Presione cualquier boton para continuar con el programa.\n En caso de querer finalizar, presione el numero cero ('0')");
      opcion = Utils.leerInt();
      while (opcion !=0) {
         procesarInformacion();
      }      
   }

   public static void procesarInformacion() {
      char dato = datoIngresado();
      if (isInt(dato))
         System.out.println("Ingreso un numero. Intente nuevamente");
      if (isVocal(dato) == true) {
         System.out.println("El caracter que ingresaste es la '" + dato + "' y es una vocal");
      } else if (isVocal(dato) == false && isInt(dato) == false) {
         System.out.println("El caracter que ingresaste es la '" + dato + "' y es una consonante");
      }
   }

   public static void mostrarMensajeDespedida() {
      System.out.println("\n Gracias por usar nuestro programa");
   }
}
