package IntroduccionPRGPildorasInformaticas.ProgramacionMedia.Medio.I_IntroduccionEventos.Eventos_III;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LaminaBotones extends JPanel {

//#############################################################################
//# Introducción a los eventos III - Píldoras Informáticas - Video 67         #
//#############################################################################

    JButton botoAzul = new JButton("Azul");
    JButton botoAmarillo = new JButton("Amarillo");
    JButton botoRojo = new JButton("Rojo");

    public LaminaBotones() {
        add(botoAzul);
        add(botoAmarillo);
        add(botoRojo);

        ColorFondo Amarillo = new ColorFondo(Color.YELLOW);
        ColorFondo Azul = new ColorFondo(Color.BLUE);
        ColorFondo Rojo = new ColorFondo(Color.RED);

        botoAzul.addActionListener(Azul); // Utilizamos nombre de las instancias
        botoAmarillo.addActionListener(Amarillo);
        botoRojo.addActionListener(Rojo);
    }

    private class ColorFondo implements ActionListener {

        private Color colorDeFondo;

        public ColorFondo(Color c) {
            colorDeFondo = c;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            setBackground(colorDeFondo);
        }
    }
}