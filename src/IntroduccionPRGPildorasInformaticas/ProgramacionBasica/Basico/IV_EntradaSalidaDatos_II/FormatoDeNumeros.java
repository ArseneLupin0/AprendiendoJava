package IntroduccionPRGPildorasInformaticas.ProgramacionBasica.Basico.IV_EntradaSalidaDatos_II;

import javax.swing.*;

public class FormatoDeNumeros {

//#############################################################################
//# Entrada Salida de Datos II - Píldoras Informáticas - Video 15             #
//#############################################################################

    public static void main(String[] args) {
        double x = 10000.0;

        System.out.printf("%1.2f", x / 3); // Con printf

        double num1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce un número"));

        System.out.print("\nLa raíz de " + num1 + " es ");

        System.out.printf("%1.2f", Math.sqrt(num1));
    }
}
