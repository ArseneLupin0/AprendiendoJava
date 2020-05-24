package IntroduccionPRGPildorasInformaticas.ProgramacionMedia.Basico.II_IntroduccionAplicacionesGraficas.AplicacionesGraficasSwing_V;

import javax.swing.*;
import java.awt.*;

public class LaminaConFiguras extends JPanel {

//#############################################################################
//# APT Gráficas Swing V - Píldoras Informáticas - Video 59                   #
//#############################################################################

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawRect(50, 50, 200, 200); // Dibujamos un cuadrado
        g.drawLine(50, 250, 400, 300); // Dibujar una línea
        g.drawArc(300, 50, 200, 200, 300, 220); // Dibujamos un arco
    }
}
