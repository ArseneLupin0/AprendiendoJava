package IntroduccionPRGPildorasInformaticas.ProgramacionMedia.Medio.I_IntroduccionEventos.Eventos_VIIII;

import java.awt.event.InputEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class EventoDeRaton extends MouseAdapter {

//#############################################################################
//# Introducción a los eventos IX - Píldoras Informáticas - Video 73          #
//#############################################################################

    @Override
    public void mouseClicked(MouseEvent e) {
//        System.out.println("Coordenada X: " + e.getX() + "\nCoordenada Y: " + e.getY());
        System.out.println(e.getClickCount());
        System.out.println(e.getModifiersEx());
    }

    @Override
    public void mousePressed(MouseEvent e) {

//        System.out.println(e.getModifiersEx()); // Da valor de la constante

        if (e.getModifiersEx() == InputEvent.BUTTON1_DOWN_MASK /*1024 también vale*/) {
            System.out.println("Has pulsado el botón izquierdo");
        } else if (e.getModifiersEx() == InputEvent.BUTTON2_DOWN_MASK /*2048 también vale*/) {
            System.out.println("Has pulsado la rueda del ratón");
        } else {
            System.out.println("Has pulsado el botón derecho");
        }
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        System.out.println("Estás arrastrando");
    }

    @Override
    public void mouseMoved(MouseEvent mouseEvent) {
        System.out.println("Estás moviendo el ratón");
    }

    // La clase MouseAdaptar trae estos métodos por lo tanto no hace falta implementar la interfaz, con
    // poner a escucha el marco debería de ser suficiente.
}