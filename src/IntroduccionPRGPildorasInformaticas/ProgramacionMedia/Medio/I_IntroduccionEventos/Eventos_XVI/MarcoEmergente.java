package IntroduccionPRGPildorasInformaticas.ProgramacionMedia.Medio.I_IntroduccionEventos.Eventos_XVI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MarcoEmergente extends JFrame {

//#############################################################################
//# Introducción a los eventos XVI - Píldoras Informáticas - Video 80         #
//#############################################################################

    private static int contador = 0;

    public MarcoEmergente(JButton botonDePrincipal) throws HeadlessException {
        setTitle("Ventana " + contador++);

        setBounds(40 * contador, 40 * contador, 300, 150);

//        CierraTodos oyenteCerrar = new CierraTodos();
        botonDePrincipal.addActionListener(new CierraTodos());
    }

    private class CierraTodos implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            dispose();
            contador = 0; // Resetear contador para que empiece de nuevo
        }
    }
}
