package IntroduccionPRGPildorasInformaticas.ProgramacionMedia.Medio.III_IntroduccionSwing.III_CasillasDeVeirifacion_I;

import javax.swing.*;

public class MarcoCheck extends JFrame {

//#############################################################################
//# Introducción a CheckBox I - Píldoras Informáticas - Video 92              #
//#############################################################################

    public MarcoCheck() {
        setTitle("Probando Casillas de verificación");
        setBounds(550, 300, 550, 350);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        add(new LaminaCheck());
    }
}