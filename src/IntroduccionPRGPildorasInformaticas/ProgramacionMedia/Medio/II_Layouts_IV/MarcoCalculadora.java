package IntroduccionPRGPildorasInformaticas.ProgramacionMedia.Medio.II_Layouts_IV;

import javax.swing.*;
import java.awt.*;

public class MarcoCalculadora extends JFrame {

//#############################################################################
//# Introducción a Layouts IV - Píldoras Informáticas - Video 84              #
//#############################################################################

    public MarcoCalculadora() throws HeadlessException {
        setTitle("Calculadora");
        setBounds(500, 300, 450, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
//        pack(); // Ponerlo con tamaños por defecto

        add(new LaminaCalculadora());
    }
}