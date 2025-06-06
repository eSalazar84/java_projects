package examen;

/*
 * En una plataforma educativa en línea, los estudiantes leen el material de estudio que está dividido en secciones.
El sistema registra, en un arreglo T de tamaño MAXT, la cantidad de minutos que cada estudiante tarda en leer cada sección.
Cada tiempo de lectura se representa mediante un número entero positivo.

El sistema de monitoreo agrupa los tiempos por estudiante: para separar las lecturas de un estudiante de las de otro,
se insertan uno o más valores negativos entre las secuencias de tiempos. Estos valores negativos no representan tiempos reales,
sino que funcionan únicamente como delimitadores de sesión. También se insertan uno o más valores negativos al inicio y al final del
arreglo T.

En el siguiente ejemplo, se muestra un arreglo T que contiene los tiempos de lectura de 4 estudiantes.
El estudiante 1 leyó 5 secciones: para la primera tardó 23 minutos, para la segunda, 21, y así sucesivamente.

T = { -6, -8, 23, 21, 20, 19, 15, -1, 15, 14, 13, 16, -8, -10, 30, 28, 22, 16, 12, -3, 56, 52, 54, 60, -5 }

Cada sección de lectura está pensada para que insuma tiempos similares al estudiante, por consiguiente, si el tiempo de lectura que
el estudiante dedica a cada sección disminuye gradualmente, se considera una posible falta de concentracion o interes en el tema.
Por esta razon, "se pide" implementar un programa en JAVA para determinar e informar que estudiantes prresentan ese comportamiento 
(el tiempo de lectura de cada seccion disminuye gradualmente). "Ademas", se debe transformar el tiempo total invertido por el estudiante,
en aquellos casos que no evidencien falta de concentracion o interes en el tema, al formato de horas y minutos, 
reemplazando en el mismo arreglo los tiempos parciales de lectura de cada seccion.

Nota: para convertir la suma total de minutos al formato horas y minutos, se debe dividir el total por 60 para obtener
las horas y usar el resto de esa división para los minutos. Por ejemplo, 75 minutos se convierten en 1 hora y 15 minutos.
Para el ejemplo anterior, los alumnos que muestran una posible falta de concentración o interés son el alumno 1 y el 3,
y el arreglo resultante luego de pasar los tiempos totales al formato horas y minutos sería:

T = { -6, -8, 23, 21, 20, 19, 15, -1, 0, 58, -8, -10, 30, 28, 22, 16, 12, -3, 3, 42, -5, -5, -5, -5, -5}

IMPORTANTE: asumir que el número mínimo de secciones que un alumno es 3. El ejemplo es meramente ilustrativo,
la solución planteada debe ser válida para cualquier arreglo T. Aplicar TODAS las buenas prácticas vistas en la materia.
No usar estructuras auxiliares.

2. Dado el siguiente código, determinar cómo quedará conformado el arreglo texto luego de la ejecución:
final int MAX = 5;
char[] texto = { 'C', 'h', 'a', 'u', '!' };
int[] numeros = { 1, 4, 2, 0, 3 };
int i = 0;
while (i < MAX) {
    if (i % 2 == 0)
        texto[i] = texto[numeros[i]];
    else
        texto[numeros[i]] = texto[i];
    i++;
}
 */

public class examen {
    // tiempo total de lectura alumno 1: 98 = 23, 21, 20, 19, 15 baja en todos las
    // secciones
    // tiempo total de lectura alumno 2: 58 = 15, 14, 13, 16 sube al final
    // tiempo total de lectura alumno 3: 108 = 30, 28, 22, 16, 12 baja en todos las
    // secciones
    // tiempo total de lectura alumno 4: 222 = 56, 52, 54, 60
    public static void main(String[] args) {
        determinarConcentracion();
    }

    final static int MAXT = 25;
    final static int[] T = { -6, -8, 23, 21, 20, 19, 15, -1, 15, 14, 13, 16, -8, -10, 30, 28, 22, 16, 12, -3, 56, 52,
            54, 60, -5 };
    public static int aux = T[0];
    public static int minSecciones = 3;
    public static int contador = 0;
    public static int alumno = 0;
    public static int acum = 0;

    // Determinar e informar que estudiantes presentan un tiempo de lectura que
    // dismunuya gradualmente
    final static void determinarConcentracion() {
        for (int i = 0; i < T.length; i++) {
            if (T[i] > 0) {
                aux = T[i];

                if (T[i + 1] < 0) {
                    alumno++;
                }

                if (aux > T[i + 1] && T[i + 1] > 0) {
                    contador++;
                }

                if (T[i + 1] < 0 && contador > 3) {
                    System.out.println("El alumno " + alumno + " decayó en interes");
                }
                // se debe transformar el tiempo total invertido por el estudiante,
                // en aquellos casos que no evidencien falta de concentracion o interes en el
                // tema, al formato de horas y minutos,
                // reemplazando en el mismo arreglo los tiempos parciales de lectura de cada
                // seccion.
                else if (T[i + 1] < 0) {
                    acum += aux;
                    System.out.println(acum);
                }

            } else {
                contador = 0;
                acum = 0;
            }

        }
    }
}