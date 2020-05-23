package IntroduccionPRGPildorasInformaticas.ProgramacionMedia.Basico.II_IntroduccionAplicacionesGraficas.AplicacionesGraficasSwing_II;

import javax.swing.*;

public class MiMarco extends JFrame {

//#############################################################################
//# APT Gráficas Swing II, Frame II - Píldoras Informáticas - Video 56        #
//#############################################################################

    public MiMarco() {
        setVisible(true); // Visible el marco
        setDefaultCloseOperation(EXIT_ON_CLOSE); // Operaciones al cerrar la ventana
        setSize(500, 300); // Dar tamaño a la ventana
        setLocation(500, 300); // Posicionar la ventana
        setBounds(500, 300, 550, 250); // Incluye "setSize" y "setLocation". 1º Location, 2º Size
        setResizable(false); // Permitir maximizar o redimensionar la ventana
        setExtendedState(MAXIMIZED_BOTH /*6*/); // Maximiza la ventana al inicio de la aplicación, valen las dos constante o valor
        setTitle("Mi ventana"); // Dar un título a nuestra ventana
    }
}
