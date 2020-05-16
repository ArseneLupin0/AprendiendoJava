package IntroduccionPRGATS.ProgramacionBasica.ZZMetodosUtiles;

import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * @author Oleg
 */
public class MetodosUtiles {

    public static void main(String[] args) {

//#############################################################################
//# Métodos de ordenamientos - Burbuja - Video 53                             #
//#############################################################################

    /* Método Burbuja - ¿Qué es el método "burbuja"?

        Es un sencillo algoritmo de ordenamiento. Funciona revisando cada
        elemento de la lista que va a ser ordenada con el siguiente,
        intercambiándolos de posición si están en el orden equivocado. Es
        necesario revisar varias veces toda la lista hasta que no se necesiten
        más intercambios, lo cual significa que la lista está ordenada.

       Ejemplo:
        [4, 5, 2, 1, 3]
         A  S
            A  S
               A  S
                  A  S
        Si (numeroActual(A) > numeroSiguiente(S)) --> CAMBIO
    */

        Scanner entrada = new Scanner(System.in);
        int[] arreglo;
        int nElementos;
        int aux;

        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de elementos del arreglo"));

        arreglo = new int [nElementos];

        for (int i = 0; i < nElementos; i++) {
            System.out.print((i+1)+". Digite un número: ");
            arreglo[i] = entrada.nextInt();
        }

        System.out.print("\nTu arreglo es: ");
        for (int i : arreglo) {
            System.out.print(i+", ");
        }
        System.out.println("\b\b");

        for (int i = 0; i < nElementos-1; i++) {
            for (int j = 0; j < nElementos-1; j++) {
                if (arreglo[j] > arreglo[j+1]) {
                    aux = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = aux;
                }
            }
        }

        System.out.print("Arreglo ordenado menor a mayor: ");
        for (int i : arreglo) {
            System.out.print(i+", ");
        }
        System.out.println("\b\b");

        System.out.print("Arreglo ordenado mayor a menor: ");
        for (int i = (nElementos-1); i >= 0; i--) {
            System.out.print(arreglo[i]+", ");
        }
        System.out.println("\b\b");

//#############################################################################
//# Métodos de ordenamientos - Inserción - Video 54                           #
//#############################################################################

    /* Método Burbuja - ¿Qué es el método "Inserción"?

        Es una manera muy natural de ordenar para un ser humano, y puede usarse
        fácilmente para ordenar un mazo de cartas numeradas en forma arbitraria.
        Requiere O(n2) operaciones para ordenar una lista de n elementos.

       Ejemplo:
        [5, 3, 4, 1, 2]
         |
         |  |
         |  |  |
         |  |  |  |
         |  |  |  |  |
        Comprobar (numeroIzquierda) < (numero)
        Si (numeroActual(A) > numeroSiguiente(S)) --> CAMBIO
    */

    int[] arreglo1;
        int nElementos2;
        int aux2;
        int pos;

        nElementos2 = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de elementos del arreglo"));
    arreglo1 = new int [nElementos2];

    for (int i = 0; i < nElementos2; i++) {
            System.out.print((i+1)+". Digite un número: ");
            arreglo1[i] = entrada.nextInt();
        }

        System.out.print("\nTu arreglo es: ");
        for (int i : arreglo1) {
            System.out.print(i+", ");
        }
        System.out.println("\b\b");

        for (int i = 0; i < nElementos2; i++) {
            pos = i;
            aux2 = arreglo1[i];

            while ((pos > 0) && (arreglo1[pos-1] > aux2)) {
                arreglo1[pos] = arreglo1[pos-1];
                pos--;
            }
            arreglo1[pos] = aux2;
        }

        System.out.print("Arreglo ordenado ascendentemente: ");
        for (int i : arreglo1) {
            System.out.print(i+", ");
        }
        System.out.println("\b\b");

        System.out.print("Arreglo ordenado descendentemente: ");
        for (int i = (nElementos2-1); i >= 0; i--) {
            System.out.print(arreglo1[i]+", ");
        }
        System.out.println("\b\b");

//#############################################################################
//# Métodos de Búsqueda Secuencial - Búsqueda - Video 55                      #
//#############################################################################

        /* Método por Inserción - ¿Qué es el método "Inserción"?

            Se utiliza cuando el vector no está ordenado o no puede ser ordenado
            previamente. Consiste en buscar el elemento comparándolo secuencialmente
            (de ahí su nombre) con cada elemento del vector hasta encontrarlo, o
            hasta que se llegue al final.

           Ejemplo:
            [3, 1, 2, 5]; dato = 2;
             |
             |  |
             |  |  |
             |  |  |  |
             |  |  |  |  |
            Comprobar (numeroIzquierda) < (numero)
            Si (numeroActual(A) > numeroSiguiente(S)) --> CAMBIO
        */

        int[] arreglo3 = {4,1,5,2,3};
        int dato;
        boolean band = false;
        dato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número a buscar"));

        int i = 0;
        while (i < 5 && !band) {
            if (arreglo3[i] == dato) {
                band = true;
            }
            i++;
        }

        if (!band) {
            System.out.println("Tu número "+dato+" no existe en el arreglo");
        }
        else {
            System.out.println("Tu número "+dato+" está en el arreglo y la posición es: "+(i-1));
        }

//#############################################################################
//# Métodos de Búsqueda Binaria - Binaria - Video EXTRA                       #
//#############################################################################

        /* Método por búsqueda Binaria - ¿Qué es la búsqueda "Binaria"?

            Se utiliza cuando el vector está ordenado (OBLIGATORIO). Es una
            manera más fácil de buscar y rápida.

           Ejemplo:
            [1, 3, 5, 7, 11, 13, 17, 19]; dato = 3;
             |           |           |
             |           |
             |     |
                |

            Se van eliminado los número dependiendo de dónde esté el número que
            vayamos a buscar, buscando en un nuevo arreglo más pequeño.
        */

        int[] arr = {2, 6, 7, 3, 5, 90, 23, 76, 105, 24, 19, 88};
        int pos1, elementoBuscar;

        System.out.print("Su array es: ");
        for (int j : arr) {
            System.out.print(j + ", ");
        }
        System.out.println("\b\b");

        Arrays.sort(arr);

        System.out.print("Su array ordenado es: ");
        for (int j : arr) {
            System.out.print(j + ", ");
        }
        System.out.println("\b\b");

        elementoBuscar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el elemento a buscar"));

        pos1 = Arrays.binarySearch(arr, elementoBuscar);

        System.out.println("Su elemento " + elementoBuscar + " se encuentra en la posición " + pos1);
    }
}