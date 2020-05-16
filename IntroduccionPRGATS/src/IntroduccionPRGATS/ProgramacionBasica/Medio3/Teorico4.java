package IntroduccionPRGATS.ProgramacionBasica.Medio3;

import java.util.Scanner;

/**
 * @author Oleg
 */
public class Teorico4 {

    public static void main(String[] args) {

//#############################################################################
//# Introducción a los Ciclos While - Video 28                                #
//#############################################################################

        /* Funcionamiento del ciclo while
            Descripción: en el while, primero se ve si la condición es cierta,
            si no sale del bucle y no hace nada.
            while (condición){
                Instrucciones;
            }
        */

        Scanner entrada = new Scanner(System.in);
        int i = 1, contador;

        System.out.print("Digite cuantos números quiere en pantalla: ");
        contador = entrada.nextInt();

        while (i <= contador) {
            System.out.println("El número es: " + i);
            i += 2;
        }
//#############################################################################
//# Introducción a los Ciclos While - Video 29                                #
//#############################################################################

        /* Funcionamiento del do while
           Descripción: el do while, siempre se va a ejecutar una vez ya que
           primero va a ejecutar el programa y luego mira si la condición que
           hay se cumple o no.

           do {
                Instrucciones
           }
           while(condición);
        */
        Scanner entrada2 = new Scanner(System.in);
        int i2 = 1, contador2;

        System.out.print("\nDigite cuantos números quiere en pantalla: ");
        contador2 = entrada2.nextInt();

        do {
            System.out.println("El número es: " + i2);
            i2 += 3;
        }
        while (i2 <= contador2);

//#############################################################################
//# Introducción a los Ciclos While - Video 30                                #
//#############################################################################

        /* Funcionamiento del for
           Descripción: el for.

           for (inicialización; condición; aumento o decremento;) {
                Instrucciones
           }
        */

        Scanner entrada3 = new Scanner(System.in);
        int contador3;

        System.out.print("Digite un número: ");
        contador3 = entrada3.nextInt();

        for (int i3 = 2; i3 <= contador3; i3 += 2) {
            System.out.println("El número es: " + i3);
        }
    }
}
