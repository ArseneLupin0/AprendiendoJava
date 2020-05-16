package IntroduccionPRGATS.ProgramacionMedia.EjerciciosPOOInternos.Ejercicio6;

import java.util.Scanner;

public class MainComplejos {

//#############################################################################
//# Ejercicio 4 - POO - Vídeo 74                                              #
//#############################################################################

    /* Ejercicio 6
        Construir un programa para trabajar con 2 números complejos, implemente
        el siguiente menú:

         1.- Sumar 2 números complejos.
         2.- Multiplicar 2 números complejos.
         3.- Comparar 2 números complejos (iguales o no).
         4.- Multiplicar 1 número complejo por uno entero.
         5.- Salir del programa
     */

    public static void main(String[] args) {

        Scanner lectura = new Scanner(System.in);

        // Variables
        int opcion;

        do {

            System.out.print("Seleccione una opción del menú: ");
            System.out.println("\n1.- Sumar dos numero complejos.");
            System.out.println("2.- Multiplicar 2 números complejos.");
            System.out.println("3.- Comparar 2 números complejos (iguales o no).");
            System.out.println("4.- Multiplicar un número complejo por un entero.");
            System.out.println("5.- Salir del programa.");
            System.out.print("\nOpción: ");
            opcion = lectura.nextInt();
            System.out.println();

            // Se crea el objeto
            Complejos sumaComplejos = new Complejos(0, 0, 0, 0);
            sumaComplejos.menu(opcion);
        } while (opcion != 5);
    }
}
