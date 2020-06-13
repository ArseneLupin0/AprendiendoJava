package IntroduccionPRGPildorasInformaticas.ProgramacionMedia.Medio.III_IntroduccionSwing.VIIII_PracticaMenu_III;

import javax.swing.*;

public class MarcoProcesador extends JFrame {

//#############################################################################
//# Introducción a Procesador Textos - Píldoras Informáticas - Video 106      #
//#############################################################################

    public MarcoProcesador() {
        setTitle("Procesador de texto");
        setBounds(500, 350, 550, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        add(new LaminaProcesador());
    }
}