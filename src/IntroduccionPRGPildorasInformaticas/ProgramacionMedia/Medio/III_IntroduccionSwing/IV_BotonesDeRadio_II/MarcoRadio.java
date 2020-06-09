package IntroduccionPRGPildorasInformaticas.ProgramacionMedia.Medio.III_IntroduccionSwing.IV_BotonesDeRadio_II;

import javax.swing.*;

public class MarcoRadio extends JFrame {

//#############################################################################
//# Introducción a JRadioButton II - Píldoras Informáticas - Video 94         #
//#############################################################################

    public MarcoRadio() {
        setTitle("Probando Casillas de verificación");
        setBounds(550, 300, 550, 350);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        add(new LaminaRadio());
    }
}