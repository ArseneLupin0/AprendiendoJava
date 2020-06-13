package IntroduccionPRGPildorasInformaticas.ProgramacionMedia.Medio.III_IntroduccionSwing.VII_JSpinner_II;

import javax.swing.*;
import java.awt.*;

public class LaminaSpinner extends JPanel {

//#############################################################################
//# Introducción a JSpinner II - Píldoras Informáticas - Video 99             #
//#############################################################################

    public LaminaSpinner() {
//        String[] lista = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
//        JSpinner control = new JSpinner(new SpinnerListModel(lista));
        JSpinner control = new JSpinner(new SpinnerNumberModel(5, 0, 10, 1) {
            @Override
            public Object getNextValue() {
                return super.getPreviousValue();
            }

            @Override
            public Object getPreviousValue() {
                return super.getNextValue();
            }
        });

        control.addChangeListener(e -> {
            System.out.println("Has cambiado");
            System.out.println(control.getValue());
        });

        control.setPreferredSize(new Dimension(200, 20));
        add(control);
    }

    // Forma normal, con clases internas
//    private static class miModelosJSpinner extends SpinnerNumberModel {
//        public miModelosJSpinner() {
//            super(5, 0, 10, 1);
//        }
//
//        @Override
//        public Object getNextValue() {
//            return super.getPreviousValue();
//        }
//
//        @Override
//        public Object getPreviousValue() {
//            return super.getNextValue();
//        }
//    }
}