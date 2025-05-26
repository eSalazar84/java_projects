package practica_2_Selectivas_e_Iterativas;

public class Practica_2_Bonus_1 {
    public static void main(String[] args) {
        char opcion = 'a';
        int valor = 5;
        switch (opcion) {
            case 'a':
                opcion = 'b';
            case 'b':
                valor = 4;
                break;
            case 'c':
            case 'd':
            case 'e': {
                opcion = 'z';
                valor = 99;
            }
            default:
                opcion = 'a';
        }
    }
}
