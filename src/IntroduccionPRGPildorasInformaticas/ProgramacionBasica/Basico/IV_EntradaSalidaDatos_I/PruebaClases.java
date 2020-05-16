package IntroduccionPRGPildorasInformaticas.ProgramacionBasica.Basico.IV_EntradaSalidaDatos_I;

import java.util.Scanner;

public class PruebaClases {

//#############################################################################
//# Entrada Salida de Datos I - Píldoras Informáticas - Video 14              #
//#############################################################################

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce tu nombre, por favor");

        String nombreUusario = entrada.nextLine();

        System.out.println("Introduce edad, por favor");

        int edadUsuario = entrada.nextInt();

        System.out.println("Hola, " + nombreUusario + ". El año que viene tendras " + (edadUsuario + 1) + " años");
    }
}