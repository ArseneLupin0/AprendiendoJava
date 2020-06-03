package IntroduccionPRGPildorasInformaticas.ProgramacionMedia.Medio.I_IntroduccionEventos.Eventos_VII;

import javax.swing.*;

public class MarcoConTeclas extends JFrame {

//#############################################################################
//# Introducción a los eventos VII - Píldoras Informáticas - Video 71         #
//#############################################################################

    public MarcoConTeclas() {
        setVisible(true);
        setTitle("Teclas");
        setBounds(700, 300, 600, 450);

//        addKeyListener(new EventoDeRaton()); // Manera corta

        EventoDeTeclado teclado = new EventoDeTeclado(); // Instanciamos
        addKeyListener(teclado); // Añadimos el evento a la escucha
    }
}