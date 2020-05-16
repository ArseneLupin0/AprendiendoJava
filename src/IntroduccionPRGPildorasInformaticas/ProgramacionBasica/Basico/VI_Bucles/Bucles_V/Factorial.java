package IntroduccionPRGPildorasInformaticas.ProgramacionBasica.Basico.VI_Bucles.Bucles_V;

import javax.swing.*;

public class Factorial {

//#############################################################################
//# Bucles V - Píldoras Informáticas - Video 22                               #
//#############################################################################

    public static void main(String[] args) {
        long resultado = 1L;

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));

        for (int i = numero; i > 0; i--) {
            resultado *= i;
        }

        System.out.println("El factorial de " + numero + ", es: " + resultado);
    }
}