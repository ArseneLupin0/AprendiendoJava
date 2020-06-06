package IntroduccionPRGPildorasInformaticas.ProgramacionMedia.Medio.II_Layouts_III;

import javax.swing.*;
import java.awt.*;

public class MarcoCalculadora extends JFrame {

//#############################################################################
//# Introducción a Layouts III - Píldoras Informáticas - Video 83             #
//#############################################################################

    public MarcoCalculadora() throws HeadlessException {
        setTitle("Calculadora");
        setBounds(500, 300, 450, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        add(new LaminaCalculadora());
    }
}