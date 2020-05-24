package IntroduccionPRGPildorasInformaticas.ProgramacionMedia.Basico.II_IntroduccionAplicacionesGraficas.AplicacionesGraficasSwing_VII;

import javax.swing.*;
import java.awt.*;

public class MarcoConColor extends JFrame {

//#############################################################################
//# APT Gráficas Swing VII - Píldoras Informáticas - Video 61                 #
//#############################################################################

    public MarcoConColor() {
        setVisible(true);
        setSize(600, 450);
        setBounds(0, 0, 450, 450);
        setTitle("Primer texto");
        LaminaConColor miLamina = new LaminaConColor();
        add(miLamina);
        miLamina.setBackground(Color.PINK);
        miLamina.setBackground(SystemColor.window);
    }
}
