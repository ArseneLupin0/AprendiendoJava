package IntroduccionPRGPildorasInformaticas.ProgramacionMedia.Medio.I_IntroduccionEventos.Eventos_XIII;

import javax.swing.*;

public class MarcoAccion extends JFrame {

//#############################################################################
//# Introducción a los eventos XIII - Píldoras Informáticas - Video 77        #
//#############################################################################

    public MarcoAccion() {
        setVisible(true);
        setTitle("Prueba Acciones");
        setBounds(700, 300, 600, 450);

        add(new PanelAccion());
    }
}