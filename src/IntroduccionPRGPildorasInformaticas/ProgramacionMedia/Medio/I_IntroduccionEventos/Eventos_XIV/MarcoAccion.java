package IntroduccionPRGPildorasInformaticas.ProgramacionMedia.Medio.I_IntroduccionEventos.Eventos_XIV;

import javax.swing.*;

public class MarcoAccion extends JFrame {

//#############################################################################
//# Introducción a los eventos XIV - Píldoras Informáticas - Video 78         #
//#############################################################################

    public MarcoAccion() {
        setTitle("Prueba Acciones");
        setBounds(700, 300, 600, 450);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        add(new PanelAccion());
    }
}