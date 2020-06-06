package IntroduccionPRGPildorasInformaticas.ProgramacionMedia.Medio.II_Layouts_II;

import javax.swing.*;
import java.awt.*;

public class PanelLayoutII extends JPanel {

//#############################################################################
//# Introducción a Layouts II - Píldoras Informáticas - Video 82              #
//#############################################################################

    public PanelLayoutII() {
        setLayout(new BorderLayout());

        add(new JButton("Azul"), BorderLayout.WEST);
        add(new JButton("Verde"), BorderLayout.EAST);
        add(new JButton("Negro"), BorderLayout.CENTER);
    }
}
