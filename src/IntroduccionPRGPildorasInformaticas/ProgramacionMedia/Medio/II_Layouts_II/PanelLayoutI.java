package IntroduccionPRGPildorasInformaticas.ProgramacionMedia.Medio.II_Layouts_II;

import javax.swing.*;
import java.awt.*;

public class PanelLayoutI extends JPanel {

//#############################################################################
//# Introducción a Layouts II - Píldoras Informáticas - Video 82              #
//#############################################################################

    public PanelLayoutI() {
        setLayout(new FlowLayout(FlowLayout.LEFT));

        add(new JButton("Amarillo"));
        add(new JButton("Rojo"));
//        add(new JButton("Azul"), BorderLayout.WEST);
//        add(new JButton("Verde"), BorderLayout.EAST);
//        add(new JButton("Negro"), BorderLayout.CENTER);
    }
}