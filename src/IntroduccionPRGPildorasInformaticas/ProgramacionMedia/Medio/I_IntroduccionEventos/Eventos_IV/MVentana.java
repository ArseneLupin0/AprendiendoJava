package IntroduccionPRGPildorasInformaticas.ProgramacionMedia.Medio.I_IntroduccionEventos.Eventos_IV;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MVentana implements WindowListener {

//#############################################################################
//# Introducción a los eventos IV - Píldoras Informáticas - Video 68          #
//#############################################################################

    @Override
    public void windowOpened(WindowEvent windowEvent) {
        System.out.println("Ventana abierta");
    }

    @Override
    public void windowClosing(WindowEvent windowEvent) {
        System.out.println("Cerrando ventana");
    }

    @Override
    public void windowClosed(WindowEvent windowEvent) {
        System.out.println("La ventana ha sido cerrada");
    }

    @Override
    public void windowIconified(WindowEvent windowEvent) {
        System.out.println("Ventana minimizada");
    }

    @Override
    public void windowDeiconified(WindowEvent windowEvent) {
        System.out.println("Ventana restaurada");
    }

    @Override
    public void windowActivated(WindowEvent windowEvent) {
        System.out.println("Ventana activada");
    }

    @Override
    public void windowDeactivated(WindowEvent windowEvent) {
        System.out.println("Ventana desactivada");
    }
}