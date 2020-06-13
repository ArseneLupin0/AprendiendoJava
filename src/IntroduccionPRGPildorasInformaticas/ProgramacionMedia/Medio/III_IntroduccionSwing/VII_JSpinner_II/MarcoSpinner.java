package IntroduccionPRGPildorasInformaticas.ProgramacionMedia.Medio.III_IntroduccionSwing.VII_JSpinner_II;

import javax.swing.*;

public class MarcoSpinner extends JFrame {

//#############################################################################
//# Introducción a JSpinner II - Píldoras Informáticas - Video 99             #
//#############################################################################

    public MarcoSpinner() {
        setTitle("Probando JSlider");
        setBounds(550, 350, 550, 350);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        add(new LaminaSpinner());
    }
}