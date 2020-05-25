package IntroduccionPRGPildorasInformaticas.ProgramacionMedia.Medio.I_IntroduccionEventos.Eventos_VI;

import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;

public class CambiaEstado implements WindowStateListener {

//#############################################################################
//# Introducción a los eventos VI - Píldoras Informáticas - Video 70          #
//#############################################################################

    @Override
    public void windowStateChanged(WindowEvent windowEvent) {
//        System.out.println("La ventana ha cambiado de estado");

//        System.out.println(windowEvent.getNewState());

        // Con las constantes de variables de clases (números)
//        if (windowEvent.getNewState() == 0) {
//            System.out.println("La ventana ha vuelto a la normalidad");
//        } else if (windowEvent.getNewState() == 6) {
//            System.out.println("La ventana esta a pantalla completa");
//        } else if (windowEvent.getNewState() == 1) {
//            System.out.println("La ventana ha sido minimizada");
//        }

        // Con variables estáticas de la clase Frame
        if (windowEvent.getNewState() == Frame.NORMAL) {
            System.out.println("La ventana ha vuelto a la normalidad");
        } else if (windowEvent.getNewState() == Frame.MAXIMIZED_BOTH) {
            System.out.println("La ventana esta a pantalla completa");
        } else if (windowEvent.getNewState() == Frame.ICONIFIED) {
            System.out.println("La ventana ha sido minimizada");
        }
    }
}
