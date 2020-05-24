package IntroduccionPRGPildorasInformaticas.ProgramacionMedia.Medio.I_IntroduccionEventos.Eventos_I;

import javax.swing.*;

public class MarcoBotones extends JFrame {

//#############################################################################
//# Introducción a los eventos I - Píldoras Informáticas - Video 65           #
//#############################################################################

    public MarcoBotones() {
        setTitle("Botones y eventos");
        setBounds(700, 300, 500, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        LaminaBotones miLamina = new LaminaBotones();
        add(miLamina);
    }
}
