package IntroduccionPRGPildorasInformaticas.ProgramacionMedia.Basico.II_IntroduccionAplicacionesGraficas.AplicacionesGraficasSwing_V;

import javax.swing.*;

public class MarcoConDibujos extends JFrame {

//#############################################################################
//# APT Gráficas Swing V - Píldoras Informáticas - Video 59                   #
//#############################################################################

    public MarcoConDibujos() {
        setVisible(true);
        setSize(600, 450);
        setBounds(0, 0, 600, 450);
        setTitle("Primer texto");
        LaminaConFiguras miLamina = new LaminaConFiguras();
        add(miLamina);
    }
}
