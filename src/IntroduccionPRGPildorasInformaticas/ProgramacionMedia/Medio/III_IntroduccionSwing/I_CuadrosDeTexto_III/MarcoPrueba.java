package IntroduccionPRGPildorasInformaticas.ProgramacionMedia.Medio.III_IntroduccionSwing.I_CuadrosDeTexto_III;

import javax.swing.*;
import java.awt.*;

public class MarcoPrueba extends JFrame {

//#############################################################################
//# Introducción a Cuadros de Texto III - Píldoras Informáticas - Video 88    #
//#############################################################################

    public MarcoPrueba() throws HeadlessException {
        setTitle("Cuadros de Texto");
        setBounds(600, 300, 600, 350);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        add(new LaminaPrueba());
    }
}