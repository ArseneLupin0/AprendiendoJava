package IntroduccionPRGPildorasInformaticas.ProgramacionMedia.Medio.III_IntroduccionSwing.IV_BotonesDeRadio_I;

import javax.swing.*;

public class MarcoRadio extends JFrame {

//#############################################################################
//# Introducción a JRadioButton I - Píldoras Informáticas - Video 93          #
//#############################################################################

    public MarcoRadio() {
        setTitle("Probando Casillas de verificación");
        setBounds(550, 300, 550, 350);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        add(new LaminaRadio());
    }
}