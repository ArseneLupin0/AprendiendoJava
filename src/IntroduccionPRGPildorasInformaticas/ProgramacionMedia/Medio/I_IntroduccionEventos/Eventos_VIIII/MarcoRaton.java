package IntroduccionPRGPildorasInformaticas.ProgramacionMedia.Medio.I_IntroduccionEventos.Eventos_VIIII;

import javax.swing.*;

public class MarcoRaton extends JFrame {

//#############################################################################
//# Introducción a los eventos IX - Píldoras Informáticas - Video 73          #
//#############################################################################

    public MarcoRaton() {
        setVisible(true);
        setTitle("Ratón");
        setBounds(700, 300, 600, 450);

//        addMouseListener(new EventoDeRaton()); // Manera corta

        EventoDeRaton teclado = new EventoDeRaton(); // Instanciamos
        addMouseListener(teclado); // Añadimos el evento a la escucha
        addMouseMotionListener(new EventoDeRaton());
    }
}