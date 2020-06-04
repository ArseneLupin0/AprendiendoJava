package IntroduccionPRGPildorasInformaticas.ProgramacionMedia.Medio.I_IntroduccionEventos.Eventos_XII;

import javax.swing.*;

public class PanelAccion extends JPanel {

//#############################################################################
//# Introducción a los eventos XII - Píldoras Informáticas - Video 76         #
//#############################################################################


    public PanelAccion() {
        JButton botonAmarillo = new JButton("Amarillo");
        JButton botonAzul = new JButton("Azul");
        JButton botonRojo = new JButton("Rojo");

        add(botonAmarillo);
        add(botonAzul);
        add(botonRojo);
    }
}

