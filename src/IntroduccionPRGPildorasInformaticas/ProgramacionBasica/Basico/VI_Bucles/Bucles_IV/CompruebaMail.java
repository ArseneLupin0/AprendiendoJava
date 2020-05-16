package IntroduccionPRGPildorasInformaticas.ProgramacionBasica.Basico.VI_Bucles.Bucles_IV;

import javax.swing.*;

public class CompruebaMail {

//#############################################################################
//# Bucles IV - Píldoras Informáticas - Video 21                              #
//#############################################################################

    public static void main(String[] args) {
        boolean arroba = false;

        String mail = JOptionPane.showInputDialog("Introduce tu email");

        for (int i = 0; i < mail.length(); i++) {
            if (mail.charAt(i) == '@') {
                arroba = true;
                break;
            }
        }

        if (arroba) {
            System.out.println("Tu correo contiene @, está bien formado");
        } else System.out.println("El correo está mal formado, no contiene ningún @");
    }
}