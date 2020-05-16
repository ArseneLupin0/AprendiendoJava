package IntroduccionPRGPildorasInformaticas.ProgramacionBasica.Basico.VII_Arrays.Arrays_II;

import javax.swing.*;

public class UsoArrays {

//#############################################################################
//# Arrays II - Píldoras Informáticas - Video 24                              #
//#############################################################################

    public static void main(String[] args) {
//        String[] paises = new String[8];
//
//        paises[0] = "España";
//        paises[1] = "México";
//        paises[2] = "Colombia";
//        paises[3] = "Perú";
//        paises[4] = "Chile";
//        paises[5] = "Argentina";
//        paises[6] = "Ecuador";
//        paises[7] = "Venezuela";
//
//        for (int i = 0; i < paises.length; i++) {
//            System.out.println("Valor del índice " + i + " = " + paises[i]);
//        }
//
//        String[] paises2 = {"España", "México", "Colombia", "Perú", "chile", "Argentina", "Ecuador", "Venezuela"};
//
//        for (String miMatriz :
//                paises2) {
//            System.out.println("País: " + miMatriz);
//        }

        String[] paises3 = new String[8];

        for (int i = 0; i < paises3.length; i++) {
            paises3[i] = JOptionPane.showInputDialog("Introduce país " + (i + 1));
        }

        for (String miMatriz :
                paises3) {
            System.out.println("País: " + miMatriz);
        }
    }
}
