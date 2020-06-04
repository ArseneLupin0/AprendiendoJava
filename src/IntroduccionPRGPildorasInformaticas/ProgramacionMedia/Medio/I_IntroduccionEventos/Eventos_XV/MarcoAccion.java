package IntroduccionPRGPildorasInformaticas.ProgramacionMedia.Medio.I_IntroduccionEventos.Eventos_XV;

import javax.swing.*;

public class MarcoAccion extends JFrame {

//#############################################################################
//# Introducción a los eventos XV - Píldoras Informáticas - Video 79          #
//#############################################################################

    public MarcoAccion() {
        setTitle("Prueba Acciones");
        setBounds(700, 300, 600, 450);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        add(new PanelAccion());
    }
}