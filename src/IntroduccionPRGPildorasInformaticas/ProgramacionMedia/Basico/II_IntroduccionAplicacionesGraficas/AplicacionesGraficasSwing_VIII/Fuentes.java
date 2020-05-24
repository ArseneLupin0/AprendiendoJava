package IntroduccionPRGPildorasInformaticas.ProgramacionMedia.Basico.II_IntroduccionAplicacionesGraficas.AplicacionesGraficasSwing_VIII;

import javax.swing.*;
import java.awt.*;

public class Fuentes {

//#############################################################################
//# APT Gráficas Swing VIII - Píldoras Informáticas - Video 62                #
//#############################################################################

    public static void main(String[] args) {
        String fuente = JOptionPane.showInputDialog("Introduce fuente");
        boolean estaFuente = false;
        String[] nombresDeFuentes = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();

        for (String nombreFuente :
                nombresDeFuentes) {
            if (nombreFuente.equals(fuente)) {
                estaFuente = true;
                break;
            }
//            System.out.println(nombreFuente);
        }

        if (estaFuente) {
            System.out.println("Fuente instalada");
        } else System.out.println("No está instalada la fuente");
    }
}
