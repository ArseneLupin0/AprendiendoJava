package IntroduccionPRGATS.ProgramacionBasica.Basico2;

import java.util.Scanner;

/**
 * @author Oleg
 */
public class Teorico2 {

    public static void main(String[] args) {

//#############################################################################
//# Tipos de operadores aritméticos - Video 11                                #
//#############################################################################

        /* Operadores aritméticos
           Nombre        Representación
           Suma          ++++++++++++++
           Resta         --------------
           Multiplicar   **************
           División      //////////////
           Resto         %%%%%%%%%%%%%%
        */

        Scanner entrada = new Scanner(System.in);
        double numero1, numero2, suma, resta, multi, div, resto;

        System.out.print("Digite el primer número: ");
        numero1 = entrada.nextDouble();
        System.out.print("Digite el segundo número: ");
        numero2 = entrada.nextDouble();
        System.out.println();

        suma = numero1 + numero2;
        resta = numero1 - numero2;
        multi = numero1 * numero2;
        div = numero1 / numero2;
        resto = numero1 % numero2;

        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicación es: " + multi);
        System.out.println("La resta es: " + div);
        System.out.println("El resto es: " + resto);

//#############################################################################
//# Operadores aritméticos combinados con asignación - Video 12               #
//#############################################################################

        /* Operadores combinados
           En este caso vamos a ahorrar código para no escribir y así ahorrar tiempo
        */

        int numero3 = 10;
        int numero4 = 2;

        numero3 *= 5;   // --> numero3 = numero3 * 5;
        numero4 += 50;  // --> numero4 = numero4 + 50;
        System.out.println("\nEl numero correspondiente es: " + numero3);
        System.out.println("El siguiente número es: " + numero4);

//#############################################################################
//# Operadores de incremento y decremento - Video 13                          #
//#############################################################################

        // VALORES DE INCREMENTO:

        int x = 5, y;
        System.out.println("\nPrimer valor de X es: " + x);

        x++; // Esto equivale a x += 1 // Equivale a x = x + 1
        System.out.println("Segundo valor de X es: " + x);

        y = ++x; // Importante, para sumarle el valor a Y, tiene que estar a la izquierda de la variable
        System.out.println("Valor de Y es: " + y);

        // VALORES DE DECREMENTO:

        int x2 = 5, y2;
        System.out.println("\nPrimer valor de X2: " + x2);

        x2--; // Esto equivale a x2 -= 1 // Equivale a x2 = x2 - 1
        System.out.println("Segundo valor de X2 es: " + x2);

        y2 = --x2;
        System.out.println("Valor de Y2 es: " + y2);

//#############################################################################
//# Operaciones con la clase Math - Video 14                                  #
//#############################################################################

        /* Operaciones básicas con la clase Math."clase"
           Clase                        Descripción
           Math.sqrt                    Sirve para calcular la raíz cuadrada de un número
           Math.pow(base, exponente)    Sirve para calcular la potencias
           Math.round                   Sirve para redondear un número
           Math.random                  Sirve para generar un número random
        */

        double numero5 = 9;
        double raiz = (int) Math.sqrt(numero1);
        System.out.println("\nLa raíz de " + numero5 + " es: " + raiz);

        double base = 2, exponente = 8;
        double potencia = Math.pow(base, exponente); // Primer es la base, el segundo el exponente (a lo que está elevado)
        System.out.println("El número " + base + " elevado " + exponente + " es: " + potencia);

        double numero6 = 4.56;
        long resultado = Math.round(numero6);
        System.out.println("El número " + numero6 + " redondeado es: " + resultado);

        int aleatorio = (int) (Math.random() * 100); // El rango generado será del 0-100
        System.out.println("El numero aleatorio generado es: " + aleatorio);

//#############################################################################
//# FINALIZACIÓN DE REPASO SEGUNDA PARTE - 11-14 <> CONTINUAR CON TESTING3    #
//#############################################################################
    }
}
