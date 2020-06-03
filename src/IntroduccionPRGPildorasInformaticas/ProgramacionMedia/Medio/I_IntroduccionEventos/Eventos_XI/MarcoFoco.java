package IntroduccionPRGPildorasInformaticas.ProgramacionMedia.Medio.I_IntroduccionEventos.Eventos_XI;

import javax.swing.*;

public class MarcoFoco extends JFrame {

//#############################################################################
//# Introducción a los eventos XI - Píldoras Informáticas - Video 75          #
//#############################################################################

    public MarcoFoco() {
        setVisible(true);
        setTitle("Focos");
        setBounds(700, 300, 600, 450);

        add(new LaminaFoco());
    }
}