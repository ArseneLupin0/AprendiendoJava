package IntroduccionPRGPildorasInformaticas.ProgramacionMedia.Medio.I_IntroduccionEventos.Eventos_V;

import javax.swing.*;

public class MarcoVentana extends JFrame {

//#############################################################################
//# Introducción a los eventos V - Píldoras Informáticas - Video 69           #
//#############################################################################

    public MarcoVentana() {
        setVisible(true);

//        MVentana oyenteVentana = new MVentana();
//        addWindowListener(oyenteVentana);

        addWindowListener(new MVentana()); // Otra manera para simplificar el código (la instanciamos dentro)
    }
}