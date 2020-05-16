package IntroduccionPRGPildorasInformaticas.ProgramacionBasica.Basico.VI_Bucles.Bucles_II;

import java.util.Scanner;

public class AdivinaNumero {

//#############################################################################
//# Bucles II - Píldoras Informáticas - Video 19                              #
//#############################################################################

    public static void main(String[] args) {

        int aleatorio = (int) (Math.random() * 100);
        System.out.println(aleatorio);

        Scanner entrada = new Scanner(System.in);

        int numero = 0, intentos = 0;

        while (numero != aleatorio) {
            intentos++;
            System.out.print("Introduce un número: ");
            numero = entrada.nextInt();

            if (aleatorio < numero) {
                System.out.println("El número aleatorio es más bajo");
            } else if (aleatorio > numero) {
                System.out.println("El número aleatorio es más alto");
            }
        }

        System.out.println("Numero hallado, es: " + aleatorio + ". Intentos: " + intentos);
    }
}