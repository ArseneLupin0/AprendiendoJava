package IntroduccionPRGPildorasInformaticas.ProgramacionMedia.Medio.I_IntroduccionEventos.Eventos_V;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MVentana extends WindowAdapter {

//#############################################################################
//# Introducción a los eventos V - Píldoras Informáticas - Video 69           #
//#############################################################################

    @Override
    public void windowIconified(WindowEvent windowEvent) {
        System.out.println("Ventana minimizada");
    }
}