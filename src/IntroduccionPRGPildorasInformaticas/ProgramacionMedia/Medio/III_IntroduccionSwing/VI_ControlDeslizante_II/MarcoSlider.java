package IntroduccionPRGPildorasInformaticas.ProgramacionMedia.Medio.III_IntroduccionSwing.VI_ControlDeslizante_II;

import javax.swing.*;

public class MarcoSlider extends JFrame {

//#############################################################################
//# Introducción a JSlider II - Píldoras Informáticas - Video 97              #
//#############################################################################

    public MarcoSlider() {
        setTitle("Probando JSlider");
        setBounds(550, 400, 550, 350);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        add(new LaminaSlider());
    }
}