package IntroduccionPRGPildorasInformaticas.ProgramacionMedia.Basico.II_IntroduccionAplicacionesGraficas.AplicacionesGraficasSwing_VII;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

public class LaminaConColor extends JPanel {

//#############################################################################
//# APT Gráficas Swing VII - Píldoras Informáticas - Video 61                 #
//#############################################################################

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g; // Refundición

        Rectangle2D rectangulo = new Rectangle2D.Double(100, 100, 200, 150);
        g2.setPaint(Color.BLUE);
        g2.fill(rectangulo); // Creación de figuras con libreria 2D

        Ellipse2D elipse = new Ellipse2D.Double(); // Creación de una elipse
        elipse.setFrame(rectangulo); // Cogemos los parámetros que hicimos con el rectángulo
        g2.setPaint(Color.RED);
        g2.fill(elipse);

        double centroEnX = rectangulo.getCenterX();
        double centroEnY = rectangulo.getCenterY();
        double radio = 125; // Ancho / radio de nuestro círculo

        Ellipse2D circulo = new Ellipse2D.Double(); // Creación de un círculo
        circulo.setFrameFromCenter(centroEnX, centroEnY, centroEnX + radio, centroEnY + radio);
        g2.setPaint(new Color(40, 255, 6).darker());
        g2.draw(circulo);
    }
}
