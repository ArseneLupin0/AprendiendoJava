package IntroduccionPRGPildorasInformaticas.ProgramacionMedia.Medio.I_IntroduccionEventos.Eventos_X;

import javax.swing.*;

public class MarcoFoco extends JFrame {

//#############################################################################
//# Introducción a los eventos X - Píldoras Informáticas - Video 74           #
//#############################################################################

    public MarcoFoco() {
        setVisible(true);
        setTitle("Focos");
        setBounds(700, 300, 600, 450);

        add(new LaminaFoco());
    }
}