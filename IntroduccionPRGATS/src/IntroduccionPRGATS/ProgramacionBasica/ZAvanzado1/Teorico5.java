package IntroduccionPRGATS.ProgramacionBasica.ZAvanzado1;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * @author Oleg
 */
public class Teorico5 {

    public static void main(String[] args) {

//#############################################################################
//# Introducción a los ARREGLOS / ARRAYS / VECTORES - Video 42                #
//#############################################################################

/* Definición de Arreglo / Arrays / Vectores
    Un Array (arreglo) en Java es una estructura de datos que nos permite almacenar
    un conjunto de datos de un mismo tipo. El tamaño de los Arrays se declara en un
    primer momento y no puede cambiar luego durante la ejecución del programa.
*/

//Sintaxis para declarar e inicializar un Array:

/* Inicialización
    Tipo_de_variable[] Nombre_del_array = new Tipo_de_variable[dimensión]; --> (cuantos valores puedes almacenar);
    Algunos ejemplos:

    int[] edad = new int[4];                //Cuatros datos de tipo Int
    double[] estatura = new double[3];      //Tres datos de tipo Double
    boolean[] estado = new boolean[5];      //Cinco datos de tipo Boolean
    char[] sexo = new char[2];              //Dos datos de tipo Char
    String[] nombre = new String[2];        //Dos datos de tipo String
*/

// Ejemplo de declarar Array y leer números

/* Inicializar valores propios:
    int[] numeros = new int[3];

    numeros[0] = 5;
    numeros[1] = 7;     //El Array tomará valores 5,7 y 9
    numeros[2] = 9;

   Otra manera de inicializar:

    int[] numeros = {5,7,9};
*/

        int[] numeros = new int[3];

        numeros[0] = 7;
        numeros[1] = 10;
        numeros[2] = 13;
        System.out.println("Número en la posición 0: " + numeros[0] + "\n");

        for (int i = 0; i < 3; i++) {
            System.out.println("Array en posición Nº" + i + " equivale a: " + numeros[i]);
        }

        int[] numeros2 = {5, 7, 9, 10, 15};
        System.out.println();
        for (int i = 0; i < 5; i++) {
            System.out.println("Array en posición Nº" + i + " equivale a: " + numeros2[i]);
        }

//#############################################################################
//# Introducción a los ARREGLOS / ARRAYS / VECTORES - Video 43                #
//#############################################################################

        // Como llenar un arreglo - Con tus propios elementos - Y con tus entradas

        int nElementos;
        Scanner entrada = new Scanner(System.in);

        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de elementos del arreglo"));

        char[] letra = new char[nElementos];

        System.out.println("Digite los elementos del arreglo: ");

        for (int i = 0; i < nElementos; i++) {
            System.out.print((i + 1) + ". Digite un caracter: ");
            letra[i] = entrada.next().charAt(0);
        }

        System.out.println("\nLos caracteres del arreglo son: ");
        for (int i = 0; i < nElementos; i++) {
            System.out.print(letra[i] + " ");
        }
        System.out.println();

//#############################################################################
//# Introducción a los ARREGLOS / ARRAYS / VECTORES - Video 44                #
//#############################################################################

        /* Bucle for each / bucle for mejorado / bucle por cada
            Más rapidez que un bucle for y mas sencillo de utilizar
        */

        String[] nombres = {"Alejandro", "María", "Luisa", "Mark", "Paco", "Samuel", "Sara", "Luisa", "Matías"};

//        for (int i = 0; i < nombres.length; i++) { //versión típica / normal
//            System.out.println(nombres[i]);
//        }

        for (String i : nombres) { //Bucle for each
            System.out.println("Nombre: " + i);
        }
    }
}