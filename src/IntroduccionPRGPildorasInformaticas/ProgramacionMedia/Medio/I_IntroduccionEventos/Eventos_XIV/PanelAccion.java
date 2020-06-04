package IntroduccionPRGPildorasInformaticas.ProgramacionMedia.Medio.I_IntroduccionEventos.Eventos_XIV;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class PanelAccion extends JPanel {

//#############################################################################
//# Introducción a los eventos XIV - Píldoras Informáticas - Video 78         #
//#############################################################################


    public PanelAccion() {
        AccionColor accionAmarillo = new AccionColor("Amarillo", new ImageIcon("src/IntroduccionPRGPildorasInformaticas/ProgramacionMedia/Medio/I_IntroduccionEventos/Eventos_XIV/bolaAmarilla.jpg"), Color.YELLOW);
        AccionColor accionAzul = new AccionColor("Azul", new ImageIcon("src/IntroduccionPRGPildorasInformaticas/ProgramacionMedia/Medio/I_IntroduccionEventos/Eventos_XIV/bolaAzul.png"), Color.BLUE);
        AccionColor accionRojo = new AccionColor("Rojo", new ImageIcon("src/IntroduccionPRGPildorasInformaticas/ProgramacionMedia/Medio/I_IntroduccionEventos/Eventos_XIV/bolaRoja.png"), Color.RED);

//        JButton botonAmarillo = new JButton(accionAmarillo);
//        add(botonAmarillo);

        add(new JButton(accionAmarillo));
        add(new JButton(accionAzul));
        add(new JButton(accionRojo));

//        JButton botonAmarillo = new JButton("Amarillo");
//        JButton botonAzul = new JButton("Azul");
//        JButton botonRojo = new JButton("Rojo");
//
//        add(botonAmarillo);
//        add(botonAzul);
//        add(botonRojo);
    }

    private class AccionColor extends AbstractAction {

        public AccionColor(String nombre, Icon icono, Color colorBoton) {
            putValue(Action.NAME, nombre);
            putValue(Action.SMALL_ICON, icono);
            putValue(Action.SHORT_DESCRIPTION, "Poner la lámina de color " + nombre);
            putValue("ColorDeFondo", colorBoton);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            Color c = (Color) getValue("ColorDeFondo");
            setBackground(c);
            System.out.println("Nombre: " + getValue(Action.NAME) + "Descripción: " + getValue(Action.SHORT_DESCRIPTION));

        }
    }
}