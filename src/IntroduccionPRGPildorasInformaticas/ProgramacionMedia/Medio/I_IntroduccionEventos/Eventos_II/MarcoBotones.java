package IntroduccionPRGPildorasInformaticas.ProgramacionMedia.Medio.I_IntroduccionEventos.Eventos_II;

import javax.swing.*;

public class MarcoBotones extends JFrame {

//#############################################################################
//# Introducción a los eventos II - Píldoras Informáticas - Video 66          #
//#############################################################################

    public MarcoBotones() {
        setTitle("Botones y eventos");
        setBounds(700, 300, 500, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        LaminaBotones miLamina = new LaminaBotones();
        add(miLamina);
    }
}