package IntroduccionPRGPildorasInformaticas.ProgramacionBasica.Basico.V_Condicionales_I;

import java.util.Scanner;

public class EvaluaEdad {

//#############################################################################
//# Condicionales I - Píldoras Informáticas - Video 16                        #
//#############################################################################

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce tu edad, por favor");

        int edad = entrada.nextInt();

        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        } else System.out.println("Eres menor de edad"); // Al tener solo una línea no hace falta abrir llaves

        if (edad < 18) {
            System.out.println("Eres un adolescente");
        } else if (edad < 40) {
            System.out.println("Eres joven");
        } else if (edad < 65) {
            System.out.println("Eres maduro");
        } else System.out.println("Cuídate");
    }
}
