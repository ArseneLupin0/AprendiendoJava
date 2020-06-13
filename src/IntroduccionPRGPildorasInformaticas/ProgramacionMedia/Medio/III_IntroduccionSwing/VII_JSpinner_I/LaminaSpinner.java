package IntroduccionPRGPildorasInformaticas.ProgramacionMedia.Medio.III_IntroduccionSwing.VII_JSpinner_I;

import javax.swing.*;
import java.awt.*;

public class LaminaSpinner extends JPanel {

//#############################################################################
//# Introducción a JSpinner I - Píldoras Informáticas - Video 98              #
//#############################################################################

    public LaminaSpinner() {
//        String[] lista = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
//        JSpinner control = new JSpinner(new SpinnerListModel(lista));
        JSpinner control = new JSpinner(new SpinnerNumberModel(5, 0, 10, 2));
        control.setPreferredSize(new Dimension(200, 20));
        add(control);
    }
}