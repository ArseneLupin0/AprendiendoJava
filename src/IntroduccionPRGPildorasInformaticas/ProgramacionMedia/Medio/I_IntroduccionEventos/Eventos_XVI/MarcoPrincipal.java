package IntroduccionPRGPildorasInformaticas.ProgramacionMedia.Medio.I_IntroduccionEventos.Eventos_XVI;

import javax.swing.*;

public class MarcoPrincipal extends JFrame {

//#############################################################################
//# Introducción a los eventos XVI - Píldoras Informáticas - Video 80         #
//#############################################################################

    public MarcoPrincipal() {
        setTitle("Prueba Varios");
        setBounds(1300, 100, 300, 200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        add(new LaminaPrincipal());
    }
}