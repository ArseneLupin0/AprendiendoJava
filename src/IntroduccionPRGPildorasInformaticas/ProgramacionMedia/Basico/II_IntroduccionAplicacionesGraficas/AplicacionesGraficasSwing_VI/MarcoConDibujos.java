package IntroduccionPRGPildorasInformaticas.ProgramacionMedia.Basico.II_IntroduccionAplicacionesGraficas.AplicacionesGraficasSwing_VI;

import javax.swing.*;

public class MarcoConDibujos extends JFrame {

//#############################################################################
//# APT Gráficas Swing VI - Píldoras Informáticas - Video 60                  #
//#############################################################################

    public MarcoConDibujos() {
        setVisible(true);
        setSize(600, 450);
        setBounds(0, 0, 450, 450);
        setTitle("Primer texto");
        LaminaConFiguras miLamina = new LaminaConFiguras();
        add(miLamina);
    }
}
