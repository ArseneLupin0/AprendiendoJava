package IntroduccionPRGPildorasInformaticas.ProgramacionMedia.Medio.I_IntroduccionEventos.Eventos_XI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class LaminaFoco extends JPanel {

//#############################################################################
//# Introducción a los eventos XI - Píldoras Informáticas - Video 75          #
//#############################################################################

    JTextField cuadro1, cuadro2;

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        setLayout(null);

        cuadro1 = new JTextField();
        cuadro2 = new JTextField();

        cuadro1.setBounds(120, 10, 150, 25);
        cuadro2.setBounds(120, 50, 150, 25);

        add(cuadro1);
        add(cuadro2);

        cuadro1.addFocusListener(new LanzaFocos());
//        cuadro2.addFocusListener(new LanzaFocos());
    }

    private class LanzaFocos extends FocusAdapter {

        @Override
        public void focusLost(FocusEvent e) {
            System.out.println("He perdido el foco");
            if (e.getSource() == cuadro1) {
//                if (cuadro1.getText().isEmpty())
//                    System.out.println("El texto está vacio");
//                else if (!cuadro1.getText().contains("@"))
//                    System.out.println("Falta el @ a la dirección de mail");
//                else
//                    System.out.println("Dirección implementada correctamente");
                String email = cuadro1.getText();
                boolean comprobacion = false;

                for (int i = 0; i < email.length(); i++) {
                    if (email.charAt(i) == '@') {
                        comprobacion = true;
                        break;
                    }
                }

                if (comprobacion)
                    System.out.println("Correcto");
                else System.out.println("Incorrecto");
            }
        }
    }
}

