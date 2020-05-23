package IntroduccionPRGPildorasInformaticas.ProgramacionMedia.Basico.II_IntroduccionAplicacionesGraficas.AplicacionesGraficasSwing_IV;

import javax.swing.*;
import java.awt.*;

public class Lamina extends JPanel {

    @Override
    public void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        graphics.drawString("Estamos aprendiendo Swing", 100, 100);
    }
}
