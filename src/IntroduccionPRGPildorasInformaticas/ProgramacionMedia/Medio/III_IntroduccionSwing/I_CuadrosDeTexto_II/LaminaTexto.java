package IntroduccionPRGPildorasInformaticas.ProgramacionMedia.Medio.III_IntroduccionSwing.I_CuadrosDeTexto_II;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LaminaTexto extends JPanel {

//#############################################################################
//# Introducción a Cuadros de Texto II - Píldoras Informáticas - Video 87     #
//#############################################################################

    private JTextField campo1;
    private JLabel resultado;

    public LaminaTexto() {
        setLayout(new BorderLayout());
        JPanel lamina2 = new JPanel();
        lamina2.setLayout(new FlowLayout());

        JLabel texto1 = new JLabel("Email: ");
        lamina2.add(texto1);
        campo1 = new JTextField(20);
        lamina2.add(campo1);
        add(resultado = new JLabel("", SwingConstants.CENTER), BorderLayout.CENTER);
//        System.out.println(campo1.getText().trim());
        JButton miBoton = new JButton("Comprobar");
        DameTexto miEvento = new DameTexto();
        miBoton.addActionListener(miEvento);
        lamina2.add(miBoton);

        add(lamina2, BorderLayout.NORTH);
    }

    private class DameTexto implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            System.out.println(campo1.getText().trim());
            String email = campo1.getText();
            int correcto = 0;
            for (int i = 0; i < email.length(); i++) {
                if (email.charAt(i) == '@') {
                    correcto++;
                }
            }

            if (correcto == 1) {
                System.out.println("Correcto");
                resultado.setText("Correcto");
            } else {
                System.out.println("Incorrecto");
                resultado.setText("Incorrecto");
            }
        }
    }
}