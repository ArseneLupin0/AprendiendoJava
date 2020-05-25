package IntroduccionPRGPildorasInformaticas.ProgramacionMedia.Medio.I_IntroduccionEventos.Eventos_IV;

import javax.swing.*;

public class MarcoVentana extends JFrame {

//#############################################################################
//# Introducción a los eventos IV - Píldoras Informáticas - Video 68          #
//#############################################################################

    public MarcoVentana() {
        setVisible(true);

        MVentana oyenteVentana = new MVentana();

        addWindowListener(oyenteVentana);
    }
}