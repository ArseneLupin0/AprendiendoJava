package IntroduccionPRGPildorasInformaticas.ProgramacionBasica.Basico.VI_Bucles.Bucles_III;

import javax.swing.*;

public class PesoIdeal {

//#############################################################################
//# Bucles III - Píldoras Informáticas - Video 20                              #
//#############################################################################

    public static void main(String[] args) {

        /* Es redundante, por lo tanto no hace falta inicializar la variable, porque primero le
         vamos a dar un valor con JOptionPane y después hacemos la condición */
        String genero;

        do {
            genero = JOptionPane.showInputDialog("Introduce tu género (H/M)");
        } while (!genero.equalsIgnoreCase("H") && !genero.equalsIgnoreCase("M"));

        int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce altura en CM"));

        int pesoideal = 0;

        if (genero.equalsIgnoreCase("H")) {
            pesoideal = altura - 110;
        } else pesoideal = altura - 120;

        System.out.println("Tu peso ideal es: " + pesoideal);
    }
}