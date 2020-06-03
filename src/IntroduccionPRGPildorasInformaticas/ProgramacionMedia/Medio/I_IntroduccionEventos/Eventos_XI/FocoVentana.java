package IntroduccionPRGPildorasInformaticas.ProgramacionMedia.Medio.I_IntroduccionEventos.Eventos_XI;

import javax.swing.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;

public class FocoVentana extends JFrame implements WindowFocusListener {

//#############################################################################
//# Introducción a los eventos XI - Píldoras Informáticas - Video 75          #
//#############################################################################

    FocoVentana marco1, marco2;

    public static void main(String[] args) {
        new FocoVentana().iniciar();
    }

    public void iniciar() {
        marco1 = new FocoVentana();
        marco2 = new FocoVentana();

        marco1.setVisible(true);
        marco2.setVisible(true);

        marco1.setBounds(300, 100, 600, 350);
        marco2.setBounds(1200, 100, 600, 350);

        marco1.setDefaultCloseOperation(EXIT_ON_CLOSE);
        marco2.setDefaultCloseOperation(EXIT_ON_CLOSE);

        marco1.addWindowFocusListener(this);
        marco2.addWindowFocusListener(this);
    }

    @Override
    public void windowGainedFocus(WindowEvent e) {
        if (e.getSource() == marco1)
            marco1.setTitle("Tiene el foco");
        else marco2.setTitle("Tiene el foco");
    }

    @Override
    public void windowLostFocus(WindowEvent e) {
        if (e.getSource() == marco1)
            marco1.setTitle("No tiene el foco");
        else marco2.setTitle("No tiene el foco");
    }
}