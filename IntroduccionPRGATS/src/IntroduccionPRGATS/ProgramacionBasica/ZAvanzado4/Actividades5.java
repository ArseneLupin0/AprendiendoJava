package IntroduccionPRGATS.ProgramacionBasica.ZAvanzado4;


import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Oleg
 */

public class Actividades5 {
    public static void main(String[] args) {

//#############################################################################
//# Ejercicios de matrices - Video 57                                         #
//#############################################################################

        /* Ejercicio 1
            Crear y cargar una matriz de tamaño n x m y decir si es simétrica o no
        */

        JOptionPane.showMessageDialog(null, "Empieza el ejercicio 1");
        Scanner entrada = new Scanner(System.in);
        int[][] matriz;
        int nFilas, nColum;
        boolean simetrica = true;

        do {
            nFilas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de filas de la matriz:"));
            nColum = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de columnas de la matriz"));

            matriz = new int[nFilas][nColum];

            if (nFilas == nColum) {
                for (int i = 0; i < nFilas; i++) {
                    for (int j = 0; j < nColum; j++) {
                        System.out.print("Valores Matriz: [" + i + "][" + j + "]: ");
                        matriz[i][j] = entrada.nextInt();
                    }
                }

                int i = 0, j = 0;

                while (i < nFilas && simetrica) {
                    while (j < i && simetrica) {
                        if (matriz[i][j] != matriz[j][i]) {
                            simetrica = false;
                        }
                        j++;
                    }
                    i++;
                }

                if (simetrica) {
                    JOptionPane.showMessageDialog(null, "La matriz es completamente simétrica");
                } else JOptionPane.showMessageDialog(null, "La matriz no es simétrica");

                for (int[] resultado :
                        matriz) {
                    System.out.println(Arrays.toString(resultado));
                }

            } else {
                System.out.println("El número de filas y columnas son diferentes por lo que no puede ser una matriz simétrica.");
            }
        } while (nFilas != nColum);

//#############################################################################
//# Ejercicios de matrices - Video 57                                         #
//#############################################################################

        /* Ejercicio 2
            Crear yc argar dos matrices de tamaño 3x3, sumarlas y mostrar su suma
        */

        JOptionPane.showMessageDialog(null, "Empieza el ejercicio 2");

        int nFilas1, nColum1;

        nFilas1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de filas para la 1 matriz"));
        nColum1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de columnas para la 1 matriz"));

        int[][] matriz1 = new int[nFilas1][nColum1];
        int[][] matriz2 = new int[nFilas1][nColum1];
        int[][] matriz3 = new int[nFilas1][nColum1];


        JOptionPane.showMessageDialog(null, "Da valores a tu primera matriz");

        for (int i = 0; i < nFilas1; i++) {
            for (int j = 0; j < nColum1; j++) {
                System.out.print("Valores de Primera Matriz: [" + i + "][" + j + "]: ");
                matriz1[i][j] = entrada.nextInt();
            }
        }

        JOptionPane.showMessageDialog(null, "Da valores a tu segunda matriz");
        System.out.println();

        for (int i = 0; i < nFilas1; i++) {
            for (int j = 0; j < nColum1; j++) {
                System.out.print("Valores de Segunda Matriz: [" + i + "][" + j + "]: ");
                matriz2[i][j] = entrada.nextInt();
            }
        }

        for (int i = 0; i < nFilas1; i++) {
            for (int j = 0; j < nColum1; j++) {
                matriz3[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        for (int[] resultado :
                matriz3) {
            System.out.println(Arrays.toString(resultado));
        }

//#############################################################################
//# Ejercicios de matrices - Video 58                                         #
//#############################################################################

        /* Ejercicio 3
            Crear y cargar una matriz de tamaño 3x3, transponerla y mostrarla
        */

        JOptionPane.showMessageDialog(null, "Empieza el ejercicio 3");

        int nFilas2, nColum2;

        nFilas2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de filas la matriz"));
        nColum2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de columnas la matriz"));

        int[][] matriz4 = new int[nFilas2][nFilas2];

        JOptionPane.showMessageDialog(null, "Da valores a tu matriz");

        for (int i = 0; i < nFilas2; i++) {
            for (int j = 0; j < nColum2; j++) {
                System.out.print("Valores de Matriz: [" + i + "][" + j + "]: ");
                matriz4[i][j] = entrada.nextInt();
            }
        }

        System.out.println("\nMatriz original");

        for (int[] resultado :
                matriz4) {
            System.out.println(Arrays.toString(resultado));
        }

        for (int i = 0; i < nFilas2; i++) {
            for (int j = 0; j < i; j++) {
                int aux = matriz4[i][j];
                matriz4[i][j] = matriz4[j][i];
                matriz4[j][i] = aux;
            }
        }

        System.out.println("\nMatriz transpuesta");

        for (int[] resultado :
                matriz4) {
            System.out.println(Arrays.toString(resultado));
        }

//#############################################################################
//# Ejercicios de matrices - Video 58                                         #
//#############################################################################

        /* Ejercicio 4
            Crear una matriz de tamaño 7x7 y rellenarla de forma que los elementos de la diagonal principal
            sean 1 y el resto 0.
        */

        int[][] matriz5 = new int[7][7];

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                matriz5[i][j] = 0;
            }
        }

        System.out.println("\nMatriz original 7x7");

        for (int[] resultado :
                matriz5) {
            System.out.println(Arrays.toString(resultado));
        }

        int pos = 0;
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                matriz5[pos][pos] = 1;
            }
            pos++;
        }

        System.out.println("\nMatriz con 1 en la diagonal");

        for (int[] resultado :
                matriz5) {
            System.out.println(Arrays.toString(resultado));
        }

//#############################################################################
//# Ejercicios de matrices - Video 59                                         #
//#############################################################################

        /* Ejercicio 5
            Crear y cargar una matriz de tamaño n x m, mostrar la suma de cada fila y de cada columna.
        */
        JOptionPane.showMessageDialog(null, "Empieza el ejercicio 5");

        int nFilas3, nColum3, sumaFilas, sumaColum;

        nFilas3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de filas la matriz"));
        nColum3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de columnas la matriz"));

        int[][] matriz6 = new int[nFilas3][nColum3];

        System.out.println("Ingrese los números de la matriz");
        for (int i = 0; i < nFilas3; i++) {
            for (int j = 0; j < nColum3; j++) {
                System.out.print("Valores de Matriz: [" + i + "][" + j + "]: ");
                matriz6[i][j] = entrada.nextInt();
            }
        }

        for (int[] resultado :
                matriz6) {
            System.out.println(Arrays.toString(resultado));
        }

        for (int i = 0; i < nFilas3; i++) {
            sumaFilas = 0;
            for (int j = 0; j < nColum3; j++) {
                sumaFilas += matriz6[i][j];
            }
            System.out.print("\nLa suma de la fila [" + i + "] es: " + sumaFilas);
        }

        System.out.println();

        for (int i = 0; i < nColum3; i++) {
            sumaColum = 0;
            for (int j = 0; j < nFilas3; j++) {
                sumaColum += matriz6[j][i];
            }
            System.out.print("\nLa suma de la columna [" + i + "] es: " + sumaColum);
        }

//#############################################################################
//# Ejercicios de matrices - Video 59                                         #
//#############################################################################

        /* Ejercicio 6
            Utilizando dos matrices de tamaño 5x9 y 9x5, cargar la primera y transponerla en la segunda
        */

        JOptionPane.showMessageDialog(null, "Empieza el ejercicio 6");

        int[][] matriz7 = new int[5][9];
        int[][] matriz8 = new int[9][5];

        System.out.println("Introduzca los datos de la matriz:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print("Valores de Matriz: [" + i + "][" + j + "]: ");
                matriz7[i][j] = entrada.nextInt();
            }
        }

        // Matriz original
        System.out.println("\nMatriz original:");
        for (int[] resultado :
                matriz7) {
            System.out.println(Arrays.toString(resultado));
        }

        // Cambio de matriz
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 5; j++) {
                matriz8[i][j] = matriz7[j][i];
            }
        }

        // Matriz transportada
        System.out.println("\nMatriz transportada:");
        for (int[] resultado :
                matriz8) {
            System.out.println(Arrays.toString(resultado));
        }

//#############################################################################
//# Ejercicios de matrices - Video 60                                         #
//#############################################################################

        /* Ejercicio 7
            Crear una matriz "marco" de tamaño 5x5: todos sus elementos deben ser 0 salvo los de
            de los bordes que deben ser 1, y después mostrar la matriz.

            1 1 1 1 1
            1 0 0 0 1
            1 0 0 0 1
            1 0 0 0 1
            1 1 1 1 1
        */

        JOptionPane.showMessageDialog(null, "Empieza el ejercicio 7");

        int[][] matriz9 = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 0 || i == 4) {
                    matriz9[i][j] = 1;
                } else if (j == 0 || j == 4) {
                    matriz9[i][j] = 1;
                }
                else matriz9[i][j] = 0;
            }
        }

        for (int [] resultado:
             matriz9) {
            System.out.println(Arrays.toString(resultado));
        }
    }
}