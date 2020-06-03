package IntroduccionPRGPildorasInformaticas.ProgramacionMedia.Medio.I_IntroduccionEventos.Eventos_X;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class LaminaFoco extends JPanel {

//#############################################################################
//# Introducción a los eventos X - Píldoras Informáticas - Video 74           #
//#############################################################################

    JTextField cuadro1, cuadro2;

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        setLayout(null);

        cuadro1 = new JTextField();
        cuadro2 = new JTextField();

        cuadro1.setBounds(120, 10, 150, 25);
        cuadro2.setBounds(120, 50, 150, 25);

        add(cuadro1);
        add(cuadro2);

        cuadro1.addFocusListener(new LanzaFocos());
//        cuadro2.addFocusListener(new LanzaFocos());
    }

    private static class LanzaFocos implements FocusListener { // Hacemos static al no llamar ningún objeto

        @Override
        public void focusGained(FocusEvent e) {

        }

        @Override
        public void focusLost(FocusEvent e) {
            System.out.println("He perdido el foco");
        }
    }
}

