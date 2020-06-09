package IntroduccionPRGPildorasInformaticas.ProgramacionMedia.Medio.III_IntroduccionSwing.V_Desplegables_I;

import javax.swing.*;

public class MarcoCombo extends JFrame {

//#############################################################################
//# Introducción a JComboBox I - Píldoras Informáticas - Video 95             #
//#############################################################################

    public MarcoCombo() {
        setTitle("Probando ComboBox");
        setBounds(550, 300, 550, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        add(new LaminaCombo());
    }
}