package IntroduccionPRGATS.ProgramacionMedia.EjerciciosPOOInternos.Ejercicio5;

import java.util.Scanner;

public class mainTrianguloIsosceles {

//#############################################################################
//# Ejercicio 4 - POO - Vídeo 74                                              #
//#############################################################################

    /* Ejercicio 5
        Diseñar un programa para trabajar con triángulos isósceles. Para ello defina los
        atributos necesarios que se requieran, proporciona métodos de consulta, un método
        constructor e implementa métodos para calcular el perímetro y el área de un
        triángulo, además implementar un método que a partir de un arreglo de triángulos
        devuelva el área del triángulo de mayor superficie.
     */

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double ladoIgual, ladoBase;
        int nTriangulos;

        System.out.print("Ingrese el número de triángulos que quiera calcular: ");
        nTriangulos = entrada.nextInt();

        TriangulosIsosceles[] triaIsosceles = new TriangulosIsosceles[nTriangulos];

        for (int i = 0; i < triaIsosceles.length; i++) {
            System.out.println("\nIngrese los valores para el triángulo Nº "+(i+1)+":");

            System.out.print("Ingrese el lado igual: ");
            ladoIgual = entrada.nextDouble();

            System.out.print("Ingrese la base: ");
            ladoBase = entrada.nextDouble();

            triaIsosceles[i] = new TriangulosIsosceles(ladoIgual, ladoBase);

            System.out.println("\nDatos del triángulo "+(i+1));
            System.out.println("Perímetro: " + triaIsosceles[i].calcPerimetro());
            System.out.println("Area: "+String.format("%.2f", triaIsosceles[i].calcArea()));
        }

        System.out.println("\nEl triángulo con el mayor área es: "+String.format("%.2f",mayorArea(triaIsosceles)));
    }

    public static double mayorArea(TriangulosIsosceles[] triaIsosceles) {
        double area;

        area = triaIsosceles[0].calcArea();

        for (int i = 1; i < triaIsosceles.length; i++) {
            if (triaIsosceles[i].calcArea() >= area) {
                area = triaIsosceles[i].calcArea();
            }
        }
        return area;
    }
}