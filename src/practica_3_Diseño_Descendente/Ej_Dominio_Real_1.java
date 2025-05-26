package practica_3_Diseño_Descendente;

import utils.*;

/*
 * 1. La cadena de supermercados Carrefive ha pedido la
 * refactorización del componente de software que usa para el
 * control de stock. El código original no estaba modularizado por lo
 * tanto no era legible y no se aprovechaba la reutilización. Dado un
 * artículo (id y nombre), fecha y hora y una cantidad, el componente
 * que maneja el stock genera los siguientes reportes:
 * a. Cuando la cantidad de unidades del artículo llega a un límite
 * de seguridad (valor constante) se debe reportar (por
 * consola) los siguientes datos que deben ser enviados al
 * proveedor de dicho artículo: ID_Producto, Nombre, Fecha y
 * Hora (ingresada por el usuario), Cantidad, Prioridad baja.
 */

/* 
 * tentativa
 *      ARTICULO
    -   articulo (id y nombre)
    -   fecha y hora
    -   cantidad

 */

public class Ej_Dominio_Real_1 {

    public static final int LIMITE_SEGURIDAD = 10; // Constante

    public static void main(String[] args) {
        generarReporteStock();
    }

    public static void generarReporteStock() {
        // Obtener datos
        int id = pedirId();
        String nombre = pedirNombre();
        String fechaHora = pedirFechaHora();
        int cantidad = pedirCantidad();

        // Verificar y reportar
        if (debeReportarse(cantidad)) {
            generarReporteProveedor(id, nombre, fechaHora, cantidad);
        }
    }

    public static int pedirId() {
        System.out.print("Ingrese ID del producto: ");
        return Utils.leerInt();
    }

    public static String pedirNombre() {
        System.out.print("Ingrese nombre del producto: ");
        return Utils.leerString();
    }

    public static String pedirFechaHora() {
        System.out.print("Ingrese fecha y hora (ej: 2024-05-20 14:30): ");
        return Utils.leerString();
    }

    public static int pedirCantidad() {
        System.out.print("Ingrese cantidad en stock: ");
        return Utils.leerInt();
    }

    public static boolean debeReportarse(int cantidad) {
        return cantidad <= LIMITE_SEGURIDAD;
    }

    public static void generarReporteProveedor(int id, String nombre, String fechaHora, int cantidad) {
        System.out.println("\n--- REPORTE PARA PROVEEDOR ---");
        System.out.println("ID_Producto: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Fecha y Hora: " + fechaHora);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Prioridad: Baja");
        System.out.println("-----------------------------");
    }
}
