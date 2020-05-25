package IntroduccionPRGPildorasInformaticas.ProgramacionMedia.Medio.I_IntroduccionEventos.Eventos_VI;

import javax.swing.*;

public class MarcoEstado extends JFrame {

//#############################################################################
//# Introducción a los eventos VI - Píldoras Informáticas - Video 70          #
//#############################################################################

    public MarcoEstado() {
        setVisible(true);
        setTitle("Ventana 1");
        setBounds(300, 300, 500, 350);

        CambiaEstado nuevoEstado = new CambiaEstado();
        addWindowStateListener(nuevoEstado);
    }
}