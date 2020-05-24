package IntroduccionPRGPildorasInformaticas.ProgramacionMedia.Medio.I_IntroduccionEventos.Eventos_II;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LaminaBotones extends JPanel implements ActionListener {

//#############################################################################
//# Introducción a los eventos II - Píldoras Informáticas - Video 66          #
//#############################################################################

    JButton botoAzul = new JButton("Azul");
    JButton botoAmarillo = new JButton("Amarillo");
    JButton botoRojo = new JButton("Rojo");

    public LaminaBotones() {
        add(botoAzul);
        add(botoAmarillo);
        add(botoRojo);

        botoAzul.addActionListener(this); // Necesitamos implementar la interfaz ActionListener
        botoAmarillo.addActionListener(this);
        botoRojo.addActionListener(this);

        // Tres fuentes y un único oyente, será de azul los 3 botones ahora
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object botonPulsado = e.getSource(); // Obtenemos el objeto evento de cada boton (quien es la fuente, el origen del evento)

        if (botonPulsado == botoAzul) {
            setBackground(Color.BLUE);
        } else if (botonPulsado == botoAmarillo) {
            setBackground(Color.YELLOW);
        } else setBackground(Color.RED);
    }
}