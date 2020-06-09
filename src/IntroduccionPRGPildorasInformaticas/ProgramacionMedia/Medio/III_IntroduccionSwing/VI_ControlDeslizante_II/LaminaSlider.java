package IntroduccionPRGPildorasInformaticas.ProgramacionMedia.Medio.III_IntroduccionSwing.VI_ControlDeslizante_II;

import javax.swing.*;
import java.awt.*;

public class LaminaSlider extends JPanel {

//#############################################################################
//# Introducción a JSlider II - Píldoras Informáticas - Video 97              #
//#############################################################################

    private JLabel rotulo;
    private JSlider control;
//    private int contador;

    public LaminaSlider() {
        setLayout(new BorderLayout());
        rotulo = new JLabel("En un lugar de la Mancha de cuyo nombre...");
        add(rotulo, BorderLayout.CENTER);

        control = new JSlider(8, 50, 12);

        control.setMajorTickSpacing(10);
        control.setMinorTickSpacing(5);
        control.setPaintTicks(true);
        control.setPaintLabels(true);
        control.setFont(new Font("Serif", Font.ITALIC, 10));

        control.addChangeListener(e -> {
//            contador++;
//            System.out.println("Estas manipulando el deslizante " + control.getValue());
            rotulo.setFont(new Font("Serif", Font.PLAIN, control.getValue()));
        });

        JPanel laminaSlider = new JPanel();
        laminaSlider.add(control);

        add(laminaSlider, BorderLayout.NORTH);
    }
}