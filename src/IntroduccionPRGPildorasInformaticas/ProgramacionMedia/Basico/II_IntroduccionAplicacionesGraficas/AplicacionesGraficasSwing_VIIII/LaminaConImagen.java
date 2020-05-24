package IntroduccionPRGPildorasInformaticas.ProgramacionMedia.Basico.II_IntroduccionAplicacionesGraficas.AplicacionesGraficasSwing_VIIII;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class LaminaConImagen extends JPanel {

    //#############################################################################
//# APT Gráficas Swing IX - Píldoras Informáticas - Video 63                  #
//#############################################################################
    private Image imagen;

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
//        File miImagen = new File("src/IntroduccionPRGPildorasInformaticas/ProgramacionMedia/Basico/II_IntroduccionAplicacionesGraficas/AplicacionesGraficasSwing_VIIII/Arsene.png");
        try {
            imagen = ImageIO.read(new File("src/IntroduccionPRGPildorasInformaticas/ProgramacionMedia/Basico/II_IntroduccionAplicacionesGraficas/AplicacionesGraficasSwing_VIIII/Arsene.png"));
        } catch (IOException e) {
//            e.printStackTrace();
            System.out.println("La imagen no se ha podido encontrar");
        }

        g.drawImage(imagen, 5, 5, null);
    }
}