package IntroduccionPRGPildorasInformaticas.ProgramacionMedia.Medio.II_Layouts_I;

import javax.swing.*;
import java.awt.*;

public class MarcoLayout extends JFrame {

//#############################################################################
//# Introducción a Layouts I - Píldoras Informáticas - Video 81               #
//#############################################################################

    public MarcoLayout() throws HeadlessException {
        setTitle("Prueba Layouts");
        setBounds(600, 300, 600, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        PanelLayout lamina = new PanelLayout();

//        FlowLayout disposicion = new FlowLayout(FlowLayout.RIGHT);
        lamina.setLayout(new FlowLayout(FlowLayout.RIGHT));

        add(lamina);
    }
}