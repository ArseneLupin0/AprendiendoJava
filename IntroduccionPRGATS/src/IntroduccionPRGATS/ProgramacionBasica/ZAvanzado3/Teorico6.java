package IntroduccionPRGATS.ProgramacionBasica.ZAvanzado3;


import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Oleg
 */
public class Teorico6 {

    public static void main(String[] args) {

//#############################################################################
//# Introducción a las Matrices - Video 56                                    #
//#############################################################################

/* Definición de Matriz
    Una matriz es un arreglo bidimensional, necesita dos índices para acceder a sus elementos. Gráficamente
    podemos representar una matriz como una tabla de n filas y m columnas cuyos elementos tienen que ser
    todos del mismo tipo.

    Pero en realidad una matriz en Java es un Array de Arrays

    **Ejemplo de matriz, que contiene 3 filas y 5 columnas (3x5):

      | 0   1   2   3   4
   ---|---------------------
    0 | 1   2   3   4   5
    1 | 6   7   8   9   10
    2 | 11  12  13  14  15
*/

/* ¿Qué es una Matriz simétrica?

    · Es Cuando una matriz se le considera cuadrada, es decir nFilas == nCol
    · Es cuando se obtiene la misma matriz al cambiar sus filos por columnas.

    Ejemplo de cuando una matriz es simétrica:

          ___________              ___________
         |  0  1  2  |            |  0  1  2  |
    A =  |  1  3  0  |   ==  A =  |  1  3  0  |   {Esto es una matriz simétrica}
         | -2  0  5  |            | -2  0  5  |
          -----------              -----------

          ___________              ___________
         |  3  2  1  |            |  3  1  1  |
    B =  |  1  4  0  |   !=  B =  |  2  4  0  |   {Esto no es una matriz simétrica}
         |  1  0  5  |            |  1  0  5  |
          -----------              -----------
*/

// Sintaxis para declarar e inicializar una Matriz:

/* Inicialización
    Tipo_de_variable[] [] Nombre_de_matriz = new Tipo_de_variable[dimensión][dimension]; --> ([filas] y [columnas]);
    Algunos ejemplos:

    int[] [] edad = new int[4][3];                //4x3 datos de tipo Int
    double[] [] estatura = new double[3][3];      //3x3 datos de tipo Double
    boolean[] [] estado = new boolean[5][1];      //5x1 datos de tipo Boolean
    char[] [] sexo = new char[2][2];              //2x2 datos de tipo Char
    String[] [] nombre = new String[2][3];        //2x3 datos de tipo String
*/

// Ejemplo de declarar una Matriz y leer números.

/* Inicializar valores propios:
    int[] matriz = {{1,2},{3,4},{5,6}};

    numeros[0] [0] = 1;
    numeros[0] [1] = 2;
    numeros[0] [2] = 3;         // La matriz tomará los siguientes valores: 1,2,3,4,5,6
    numeros[1] [3] = 4;
    numeros[1] [4] = 5;
    numeros[1] [5] = 6;

   Otra manera de inicializar:

    int[] numeros = {5,7,9};
*/

        System.out.println("Primera forma de hacer una matriz:");
        int[][] matriz = {{1, 2}, {3, 4}, {5, 6}};

        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[1][0] = 3;         // La matriz tomará los siguientes valores: 1,2,3,4,5,6
        matriz[1][1] = 4;
        matriz[2][0] = 5;
        matriz[2][1] = 6;

        for (int[] x :
                matriz) {
            for (int elem :
                    x) {
                System.out.println(elem);
            }
        }

        System.out.println("\nSegunda forma de hacer una matriz:");
        int[][] matriz1 = new int[3][2];

        matriz1[0][0] = 1;
        matriz1[0][1] = 2;
        matriz1[1][0] = 3;         // La matriz tomará los siguientes valores: 1,2,3,4,5,6
        matriz1[1][1] = 4;
        matriz1[2][0] = 5;
        matriz1[2][1] = 6;

        for (int[] elem :
                matriz1) {
            System.out.println(Arrays.toString(elem));
        }

        System.out.println("\nTercera forma de hacer una matriz (irregular):");
        int[][] matriz2 = {{6, 7, 5, 0, 4}, {3, 8, 4}, {1, 0, 2, 7}, {9, 5}};

        for (int[] ints : matriz2) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }

        // Rellenando una matriz
        Scanner entrada = new Scanner(System.in);
        int[][] matriz3;
        int nFilas, nCol;

        System.out.println("\nRellenando una matriz");
        nFilas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de filas de la matriz: "));
        nCol = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de columnas de la matriz: "));

        matriz3 = new int[nFilas][nCol];

        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nCol; j++) {
                System.out.print("Valores Matriz: [" + i + "][" + j + "]: ");
                matriz3[i][j] = entrada.nextInt();
            }
        }

        System.out.println("\nLa matriz es: ");
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nCol; j++) {
                System.out.print(matriz3[i][j] + " ");
            }
            System.out.println();
        }

        // ---------------------------------------------------------------------------------------
        // - Otras maneras como las mencionadas anteriormente, pero estas también se pueden usar -
        // ---------------------------------------------------------------------------------------

        System.out.println("\nOtra manera más corta y fácil:");
        for (int[] ints : matriz3) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }

        System.out.println("\nAún más corto y fácil");
        for (int[] elem :
                matriz3) {
            System.out.println(Arrays.toString(elem));
        }
    }
}