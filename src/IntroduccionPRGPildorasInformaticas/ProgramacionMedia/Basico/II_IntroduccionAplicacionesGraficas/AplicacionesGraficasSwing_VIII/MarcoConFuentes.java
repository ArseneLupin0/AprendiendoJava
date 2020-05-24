package IntroduccionPRGPildorasInformaticas.ProgramacionMedia.Basico.II_IntroduccionAplicacionesGraficas.AplicacionesGraficasSwing_VIII;

import javax.swing.*;

public class MarcoConFuentes extends JFrame {

//#############################################################################
//# APT Gráficas Swing VIII - Píldoras Informáticas - Video 62                #
//#############################################################################

    public MarcoConFuentes() {
        setVisible(true);
        setSize(600, 450);
        setBounds(0, 0, 450, 450);
        setTitle("Primer texto");
        LaminaConFuentes miLamina = new LaminaConFuentes();
        add(miLamina);
    }
}