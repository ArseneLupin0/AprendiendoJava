package IntroduccionPRGPildorasInformaticas.ProgramacionMedia.Medio.I_IntroduccionEventos.Eventos_XII;

import javax.swing.*;

public class MarcoAccion extends JFrame {

//#############################################################################
//# Introducción a los eventos XII - Píldoras Informáticas - Video 76         #
//#############################################################################

    public MarcoAccion() {
        setVisible(true);
        setTitle("Prueba Acciones");
        setBounds(700, 300, 600, 450);

        add(new PanelAccion());
    }
}