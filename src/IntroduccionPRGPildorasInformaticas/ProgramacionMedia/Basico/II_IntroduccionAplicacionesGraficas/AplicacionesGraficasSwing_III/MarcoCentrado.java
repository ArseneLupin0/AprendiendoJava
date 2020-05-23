package IntroduccionPRGPildorasInformaticas.ProgramacionMedia.Basico.II_IntroduccionAplicacionesGraficas.AplicacionesGraficasSwing_III;

import javax.swing.*;
import java.awt.*;

public class MarcoCentrado extends JFrame {

//#############################################################################
//# APT Gráficas Swing III, Frame II - Píldoras Informáticas - Video 57       #
//#############################################################################

    public MarcoCentrado() {
        Toolkit miPantalla = Toolkit.getDefaultToolkit(); // Obtener nuestro sistema nativo de ventanas
        Dimension tamanoPantalla = miPantalla.getScreenSize(); // Objeto Dimension porque es lo que devuelve el método (Width, Height)

        int alturaPantalla = tamanoPantalla.height;
        int anchoPantalla = tamanoPantalla.width;

        setSize(anchoPantalla / 2, alturaPantalla / 2); // La mitad de nuestra resolución de nuestra pantalla
        setLocation(anchoPantalla / 4, alturaPantalla / 4); // Centrar inicio de nuestra ventana en el centro de cualquier pantalla

//        setLocationRelativeTo(null); // Nueva manera para centrar la ventana, más corta que la anterior

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Marco centrado");

        Image icono = miPantalla.getImage("src/IntroduccionPRGPildorasInformaticas/ProgramacionMedia/Basico/II_IntroduccionAplicacionesGraficas/AplicacionesGraficasSwing_III/pikachu.png");
        setIconImage(icono);
    }
}
