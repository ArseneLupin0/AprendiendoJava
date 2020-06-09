package IntroduccionPRGPildorasInformaticas.ProgramacionMedia.Medio.III_IntroduccionSwing.VI_ControlDeslizante_I;

import javax.swing.*;
import java.awt.*;

public class LaminaSlider extends JPanel {

//#############################################################################
//# Introducción a JSlider I - Píldoras Informáticas - Video 96               #
//#############################################################################

    public LaminaSlider() {
        JSlider control = new JSlider(0, 100, 50);
//        control.setOrientation(SwingConstants.VERTICAL);

        // Marcas
        control.setMajorTickSpacing(25);
        control.setMinorTickSpacing(5);
        control.setPaintTicks(true);

        // Rotulos
        control.setPaintLabels(true);
        control.setFont(new Font("Serif", Font.ITALIC, 12));

        // Imán
        control.setSnapToTicks(true);

        add(control);
    }
}