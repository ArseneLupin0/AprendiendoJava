package IntroduccionPRGATS.ProgramacionMedia.ZAvanzadoPOO.ZEjercicioFinal1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

//#############################################################################
//# Introducción a POO (Avanzado) - Video 79-82 - Ejercicio Final 1           #
//#############################################################################

    /* Ejercicio Final
        Hacer un programa para calcular el área de Polígonos (Triángulos y rectángulos) el programa debe ser capaz de
        almacenar en un arreglo N triángulos y Rectángulos, al final mostrar el área de los datos de cada uno.
        Para ello se tendrá en cuenta lo siguiente:

         - Una super clase llamada Polígono.
         - Una sub clase llamada Rectángulo.
         - Una sub clase llamada Triángulo.
     */

    public static void main(String[] args) {
        // Llenar un polígono
        llenarPoligono();

        // Mostrar los datos y el área de cada polígono
        mostrarResultados();
    }

    // Array de tipo dinámico
    static ArrayList<Poligonos> poligonos = new ArrayList<>();
    static Scanner entrada = new Scanner(System.in);

    public static void llenarPoligono() {
        int opcion;
        char respuesta;

        do {
            do {
                System.out.println("Digite que polígono desea rellenar: " +
                        "\n1.- Triángulo" +
                        "\n2.- Rectángulo");
                System.out.print("\nOpción: ");

                opcion = entrada.nextInt();

                switch (opcion) {
                    case 1: llenarTriangulo(); // Llenar Triángulo
                        break;
                    case 2: llenarRectangulo(); // Lenar Rectángulo
                        break;
                    default:
                        System.out.println("\nError al escoger la opción\n");
                }
            } while (opcion < 1 || opcion > 2);

            System.out.print("\nDesea introducir otro polígono (S/N): ");
            respuesta = entrada.next().charAt(0);
            System.out.println();
        } while (respuesta == 's' || respuesta=='S');
    }

    public static void llenarTriangulo() {
        double lado1, lado2, lado3;

        System.out.print("\nDigite el lado 1 del triángulo: ");
        lado1 = entrada.nextDouble();
        System.out.print("Digite el lado 2 del triángulo: ");
        lado2 = entrada.nextDouble();
        System.out.print("Digite el lado 3 del triángulo: ");
        lado3 = entrada.nextDouble();

        Triangulo triangulo = new Triangulo(lado1, lado2, lado3);

        // Guardamos un triángulo dentro del ArrayList
        poligonos.add(triangulo);
    }

    public static void llenarRectangulo() {
        double lado1, lado2;

        System.out.print("\nDigite el lado 1 del rectángulo: ");
        lado1 = entrada.nextDouble();
        System.out.print("Digite el lado 2 del rectángulo: ");
        lado2 = entrada.nextDouble();

        Rectangulo rectangulo = new Rectangulo(lado1, lado2);

        // Guardamos un triángulo dentro del ArrayList
        poligonos.add(rectangulo);
    }

    public static void mostrarResultados() {
        // Recorremos el arreglos de polígonos
        for (Poligonos resultado :
                poligonos) {
            System.out.println(resultado.toString());
            System.out.printf("Área: %.2f",resultado.area());
            System.out.println("\n");
        }
    }
}