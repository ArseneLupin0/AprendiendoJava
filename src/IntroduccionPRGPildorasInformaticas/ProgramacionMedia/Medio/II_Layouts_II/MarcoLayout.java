package IntroduccionPRGPildorasInformaticas.ProgramacionMedia.Medio.II_Layouts_II;

import javax.swing.*;
import java.awt.*;

public class MarcoLayout extends JFrame {

//#############################################################################
//# Introducción a Layouts II - Píldoras Informáticas - Video 82              #
//#############################################################################

    public MarcoLayout() throws HeadlessException {
        setTitle("Prueba Layouts");
        setBounds(600, 300, 600, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        add(new PanelLayoutI(), BorderLayout.NORTH);
        add(new PanelLayoutII(), BorderLayout.SOUTH);
    }
}