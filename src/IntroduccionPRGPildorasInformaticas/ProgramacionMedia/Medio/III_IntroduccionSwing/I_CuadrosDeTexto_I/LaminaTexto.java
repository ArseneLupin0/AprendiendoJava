package IntroduccionPRGPildorasInformaticas.ProgramacionMedia.Medio.III_IntroduccionSwing.I_CuadrosDeTexto_I;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LaminaTexto extends JPanel {

//#############################################################################
//# Introducción a Cuadros de Texto I - Píldoras Informáticas - Video 86      #
//#############################################################################

    private JTextField campo1;

    public LaminaTexto() {
        JLabel texto1 = new JLabel("Email: ");
        add(texto1);
        campo1 = new JTextField(20);
        add(campo1);
//        System.out.println(campo1.getText().trim());
        JButton miBoton = new JButton("Comprobar");
        DameTexto miEvento = new DameTexto();
        miBoton.addActionListener(miEvento);
        add(miBoton);
    }

    private class DameTexto implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            System.out.println(campo1.getText().trim());
        }
    }
}