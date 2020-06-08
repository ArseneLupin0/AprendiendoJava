package IntroduccionPRGPildorasInformaticas.ProgramacionMedia.Medio.III_IntroduccionSwing.II_AreasDeTexto_I;

import javax.swing.*;
import java.awt.*;

public class MarcoArea extends JFrame {

//#############################################################################
//# Introducción a Areas de Texto I - Píldoras Informáticas - Video 90        #
//#############################################################################

    public MarcoArea() throws HeadlessException {
        setTitle("Area de Texto");
        setBounds(500, 300, 500, 350);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        add(new LaminaArea());
    }
}