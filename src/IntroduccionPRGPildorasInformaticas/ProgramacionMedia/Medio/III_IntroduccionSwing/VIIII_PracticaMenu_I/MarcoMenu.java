package IntroduccionPRGPildorasInformaticas.ProgramacionMedia.Medio.III_IntroduccionSwing.VIIII_PracticaMenu_I;

import javax.swing.*;

public class MarcoMenu extends JFrame {

//#############################################################################
//# Introducción a Procesador Textos - Píldoras Informáticas - Video 101      #
//#############################################################################

    public MarcoMenu() {
        setTitle("Probando los menús");
        setBounds(500, 350, 550, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        add(new LaminaMenu());
    }
}