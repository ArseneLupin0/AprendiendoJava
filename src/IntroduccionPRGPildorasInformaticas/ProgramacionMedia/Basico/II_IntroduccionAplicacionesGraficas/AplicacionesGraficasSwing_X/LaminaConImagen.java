package IntroduccionPRGPildorasInformaticas.ProgramacionMedia.Basico.II_IntroduccionAplicacionesGraficas.AplicacionesGraficasSwing_X;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class LaminaConImagen extends JPanel {

//#############################################################################
//# APT Gráficas Swing X - Píldoras Informáticas - Video 64                   #
//#############################################################################

    private Image imagen;
    private Image imagen2;

    public LaminaConImagen() {
        //        File miImagen = new File("src/IntroduccionPRGPildorasInformaticas/ProgramacionMedia/Basico/II_IntroduccionAplicacionesGraficas/AplicacionesGraficasSwing_X/Cyberpunk.png");
        try {
            imagen = ImageIO.read(new File("src/IntroduccionPRGPildorasInformaticas/ProgramacionMedia/Basico/II_IntroduccionAplicacionesGraficas/AplicacionesGraficasSwing_X/Cyberpunk.png"));
            imagen2 = ImageIO.read(new File("src/IntroduccionPRGPildorasInformaticas/ProgramacionMedia/Basico/II_IntroduccionAplicacionesGraficas/AplicacionesGraficasSwing_X/Arsene.png"));
        } catch (IOException e) {
//            e.printStackTrace();
            System.out.println("La imagen no se ha podido encontrar");
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawImage(imagen, 0, 0, null);

        int alturaImagen = imagen2.getWidth(this);
        int anchuraImagen = imagen2.getHeight(this);

        g.drawImage(imagen2, 0, 0, null);

        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 200; j++) {
                g.copyArea(0, 0, 100, 100, anchuraImagen * i, alturaImagen * j);
            }
        }
//        g.copyArea(0, 0, 300, 200, 300, 200);
    }
}