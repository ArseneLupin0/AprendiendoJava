package IntroduccionPRGPildorasInformaticas.ProgramacionMedia.Medio.III_IntroduccionSwing.VII_JSpinner_I;

import javax.swing.*;

public class MarcoSpinner extends JFrame {

//#############################################################################
//# Introducción a JSpinner I - Píldoras Informáticas - Video 98              #
//#############################################################################

    public MarcoSpinner() {
        setTitle("Probando JSlider");
        setBounds(550, 350, 550, 350);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        add(new LaminaSpinner());
    }
}