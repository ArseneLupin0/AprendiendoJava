package IntroduccionPRGPildorasInformaticas.ProgramacionMedia.Medio.I_IntroduccionEventos.Eventos_VIII;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class EventoDeRaton extends MouseAdapter {

//#############################################################################
//# Introducción a los eventos VIII - Píldoras Informáticas - Video 72        #
//#############################################################################

    //Es con implements MouseListener
//    @Override
//    public void mouseClicked(MouseEvent mouseEvent) {
//        System.out.println("Has hecho click");
//    }
//
//    @Override
//    public void mousePressed(MouseEvent mouseEvent) {
//        System.out.println("Acabas de presionar");
//    }
//
//    @Override
//    public void mouseReleased(MouseEvent mouseEvent) {
//        System.out.println("Acabas de levantar");
//    }
//
//    @Override
//    public void mouseEntered(MouseEvent mouseEvent) {
//        System.out.println("Acabas de entrar");
//    }
//
//    @Override
//    public void mouseExited(MouseEvent mouseEvent) {
//        System.out.println("Acabas de salir");
//    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        System.out.println("Has hecho click");
    }
}
