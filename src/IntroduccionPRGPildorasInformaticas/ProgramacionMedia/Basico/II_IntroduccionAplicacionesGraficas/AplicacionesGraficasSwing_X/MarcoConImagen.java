package IntroduccionPRGPildorasInformaticas.ProgramacionMedia.Basico.II_IntroduccionAplicacionesGraficas.AplicacionesGraficasSwing_X;

import javax.swing.*;

public class MarcoConImagen extends JFrame {

//#############################################################################
//# APT Gráficas Swing X - Píldoras Informáticas - Video 64                   #
//#############################################################################

    public MarcoConImagen() {
        setVisible(true);
        setBounds(750, 300, 350, 200);
        setTitle("Primer texto");
        LaminaConImagen miLamina = new LaminaConImagen();
        add(miLamina);
    }
}