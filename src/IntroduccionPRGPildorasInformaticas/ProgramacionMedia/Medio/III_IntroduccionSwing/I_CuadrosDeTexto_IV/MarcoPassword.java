package IntroduccionPRGPildorasInformaticas.ProgramacionMedia.Medio.III_IntroduccionSwing.I_CuadrosDeTexto_IV;

import javax.swing.*;
import java.awt.*;

public class MarcoPassword extends JFrame {

//#############################################################################
//# Introducción a Cuadros de Texto IV - Píldoras Informáticas - Video 89     #
//#############################################################################

    public MarcoPassword() throws HeadlessException {
        setTitle("Cuadros de Texto");
        setBounds(600, 300, 600, 350);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        add(new LaminaPassword());
    }
}