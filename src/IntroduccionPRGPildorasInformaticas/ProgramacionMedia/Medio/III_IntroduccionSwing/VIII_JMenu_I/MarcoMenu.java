package IntroduccionPRGPildorasInformaticas.ProgramacionMedia.Medio.III_IntroduccionSwing.VIII_JMenu_I;

import javax.swing.*;

public class MarcoMenu extends JFrame {

//#############################################################################
//# Introducción a JMenu I - Píldoras Informáticas - Video 100                #
//#############################################################################

    public MarcoMenu() {
        setTitle("Probando los menús");
        setBounds(500, 350, 550, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        add(new LaminaMenu());
    }
}