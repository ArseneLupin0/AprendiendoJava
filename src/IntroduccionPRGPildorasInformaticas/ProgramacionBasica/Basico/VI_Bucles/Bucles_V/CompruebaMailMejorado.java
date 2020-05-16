package IntroduccionPRGPildorasInformaticas.ProgramacionBasica.Basico.VI_Bucles.Bucles_V;

import javax.swing.*;

public class CompruebaMailMejorado {

//#############################################################################
//# Bucles V - Píldoras Informáticas - Video 22                               #
//#############################################################################

    public static void main(String[] args) {
        int arroba = 0;

        boolean punto = false;

        String mail = JOptionPane.showInputDialog("Introduce tu email");

        for (int i = 0; i < mail.length(); i++) {
            if (mail.charAt(i) == '@') {
                arroba++;
            }
            if (mail.charAt(i) == '.') {
                punto = true;
            }
        }

        if (arroba == 1 && punto) {
            System.out.println("Tu correo contiene un @, está bien formado");
        } else System.out.println("El correo está mal formado, no contiene ningún @");
    }
}