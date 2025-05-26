package practica_3_Diseño_Descendente;

import utils.*;

/* public class Practica_3_Bonus_2 {
    public static void main(String[] args) {
        char letra = 'a';
        letra = Utils.leerChar();
        if (letra >= 'a' && letra <= 'z') {
            System.out.println("Es una letra minuscula");
        }
    }
} */

public class Practica_3_Bonus_2 {

    public static void main(String[] args) {
        System.out.println("Bienvenido");
        char charIngresado = solicitarLetra();
        procesarInformacion(charIngresado);
        
    }

    protected static char solicitarLetra(){
        System.out.println("Ingrese una letra minuscula");
        char letraIngresada = Utils.leerChar();
        return letraIngresada;
    }

    public static void procesarInformacion(char letra){
        if (letra >= 'a' && letra <= 'z') {
            System.out.println("Es una letra minuscula");
        } else if (letra >= 'A' && letra <= 'Z'){
            System.out.println("Es una letra mayuscula");        
        } else {
            System.out.println("Ingresaste un numero.");
        }
    }
}
