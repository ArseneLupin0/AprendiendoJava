package IntroduccionPRGPildorasInformaticas.ProgramacionMedia.Basico.II_IntroduccionAplicacionesGraficas.AplicacionesGraficasSwing_IV;

import javax.swing.*;

public class MarcoConTexto extends JFrame {

//#############################################################################
//# APT Gráficas Swing IV - Píldoras Informáticas - Video 58                  #
//#############################################################################

    public MarcoConTexto() {
        setVisible(true);
        setSize(600, 450);
        setBounds(400, 200, 600, 450);
        setTitle("Primer texto");
        Lamina miLamina = new Lamina();
        add(miLamina); // Añadimos objetos a nuestro frame
    }
}
