package IntroduccionPRGPildorasInformaticas.ProgramacionMedia.Medio.III_IntroduccionSwing.II_AreasDeTexto_I;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LaminaArea extends JPanel {

//#############################################################################
//# Introducción a Areas de Texto I - Píldoras Informáticas - Video 90        #
//#############################################################################

    private JTextArea miArea;

    public LaminaArea() {
        miArea = new JTextArea(8, 20);

        JScrollPane scroll = new JScrollPane(miArea);

//        miArea.setLineWrap(true);
        add(scroll);

        JButton boton = new JButton("Dale");

        // Con lambda
//        boton.addActionListener(e -> System.out.println(miArea.getText()));

        // Con clase anonima
//        boton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent actionEvent) {
//                System.out.println(miArea.getText());
//            }
//        });

        // Con ActionListener normal

        boton.addActionListener(new GestionArea());

        add(boton);
    }

    private class GestionArea implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            System.out.println(miArea.getText());
        }
    }
}