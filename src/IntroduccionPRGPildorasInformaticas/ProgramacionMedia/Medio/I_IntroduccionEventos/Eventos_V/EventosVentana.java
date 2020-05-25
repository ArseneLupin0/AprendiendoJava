package IntroduccionPRGPildorasInformaticas.ProgramacionMedia.Medio.I_IntroduccionEventos.Eventos_V;

import javax.swing.*;

public class EventosVentana {

//#############################################################################
//# Introducción a los eventos V - Píldoras Informáticas - Video 69           #
//#############################################################################

    public static void main(String[] args) {
        MarcoVentana marco1 = new MarcoVentana();
        marco1.setTitle("Ventana 1");
        marco1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        marco1.setBounds(300, 300, 500, 350);

        MarcoVentana marco2 = new MarcoVentana();
        marco2.setTitle("Ventana 2");
        marco2.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        marco2.setBounds(900, 300, 500, 350);
    }
}