package IntroduccionPRGPildorasInformaticas.ProgramacionMedia.Medio.III_IntroduccionSwing.I_CuadrosDeTexto_II;

import javax.swing.*;
import java.awt.*;

public class MarcoTexto extends JFrame {

//#############################################################################
//# Introducción a Cuadros de Texto II - Píldoras Informáticas - Video 87     #
//#############################################################################

    public MarcoTexto() throws HeadlessException {
        setTitle("Cuadros de Texto");
        setBounds(600, 300, 600, 350);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        add(new LaminaTexto());
    }
}