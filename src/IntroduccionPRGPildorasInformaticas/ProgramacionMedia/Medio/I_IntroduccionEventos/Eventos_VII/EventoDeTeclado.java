package IntroduccionPRGPildorasInformaticas.ProgramacionMedia.Medio.I_IntroduccionEventos.Eventos_VII;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class EventoDeTeclado implements KeyListener {

//#############################################################################
//# Introducción a los eventos VII - Píldoras Informáticas - Video 71         #
//#############################################################################

    @Override
    public void keyTyped(KeyEvent keyEvent) {
        System.out.print(keyEvent.getKeyChar()); // Obtener la tecla pulsada
    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
//        System.out.println(keyEvent.getKeyCode());
//        int codigo = keyEvent.getKeyCode();
//        System.out.println(codigo);
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {

    }
}
