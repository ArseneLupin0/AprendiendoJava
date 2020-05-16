package IntroduccionPRGATS.ProgramacionMedia.ZAvanzadoPOO.MainClases5;

import java.util.Scanner;

public class Main {

//#############################################################################
//# Introducción a POO (Avanzado) - Video 83 (MainClases5)                    #
//#############################################################################

    public static void main(String[] args) {
        int num1 = 5, num2 = 0;
        int resultado = num1 / num2;

        System.out.println("El resultado es: "+resultado);

        System.out.println("Hola mundo"); // java.lang.ArithmeticException

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite un número: ");
        int numero;
        numero = entrada.nextInt();
        System.out.println("El número es: " + numero); // java.util.InputMismatchException
    }
}
