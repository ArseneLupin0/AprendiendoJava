package IntroduccionPRGPildorasInformaticas.ProgramacionMedia.Basico.II_IntroduccionAplicacionesGraficas.AplicacionesGraficasSwing_VIII;

import javax.swing.*;
import java.awt.*;

public class LaminaConFuentes extends JPanel {

//#############################################################################
//# APT Gráficas Swing VIII - Píldoras Informáticas - Video 62                #
//#############################################################################

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g; // Refundición

        Font miFuente = new Font("Courier", Font.BOLD, 26);

        g2.setFont(miFuente);
        g2.setColor(Color.BLUE);
        g2.drawString("Juan", 100, 100);

        g2.setFont(new Font("Arial", Font.ITALIC, 14));
        g2.setColor(new Color(128, 69, 6));
        g2.drawString("Curso de Java", 100, 200);

    }
}