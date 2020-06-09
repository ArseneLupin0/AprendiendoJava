package IntroduccionPRGPildorasInformaticas.ProgramacionMedia.Medio.III_IntroduccionSwing.VI_ControlDeslizante_I;

import javax.swing.*;

public class MarcoSlider extends JFrame {

//#############################################################################
//# Introducción a JSlider I - Píldoras Informáticas - Video 96               #
//#############################################################################

    public MarcoSlider() {
        setTitle("Probando JSlider");
        setBounds(550, 400, 550, 350);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        add(new LaminaSlider());
    }
}