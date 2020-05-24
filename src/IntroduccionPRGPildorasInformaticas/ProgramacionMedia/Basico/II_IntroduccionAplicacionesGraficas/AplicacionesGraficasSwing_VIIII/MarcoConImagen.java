package IntroduccionPRGPildorasInformaticas.ProgramacionMedia.Basico.II_IntroduccionAplicacionesGraficas.AplicacionesGraficasSwing_VIIII;

import javax.swing.*;

public class MarcoConImagen extends JFrame {

//#############################################################################
//# APT Gráficas Swing IX - Píldoras Informáticas - Video 63                  #
//#############################################################################

    public MarcoConImagen() {
        setVisible(true);
        setBounds(750, 300, 350, 200);
        setTitle("Primer texto");
        LaminaConImagen miLamina = new LaminaConImagen();
        add(miLamina);
    }
}