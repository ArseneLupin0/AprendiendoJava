package IntroduccionPRGPildorasInformaticas.ProgramacionMedia.Medio.III_IntroduccionSwing.IV_BotonesDeRadio_II;

import javax.swing.*;
import java.awt.*;

public class LaminaRadio extends JPanel {

//#############################################################################
//# Introducción a JRadioButton II - Píldoras Informáticas - Video 94         #
//#############################################################################

    private JLabel texto;
    private JRadioButton boton1, boton2, boton3, boton4;
    private ButtonGroup grupo;
    private JPanel laminaBotones;

    public LaminaRadio() {
        setLayout(new BorderLayout());
        texto = new JLabel("En un lugar de la Mancha cuyo nombre...");
        texto.setFont(new Font("Serif", Font.PLAIN, 12));
        add(texto, BorderLayout.CENTER);

        laminaBotones = new JPanel();
        grupo = new ButtonGroup();

        colorcarBotones("Pequeño", false, 10);
        colorcarBotones("Mediano", true, 12);
        colorcarBotones("Grande", false, 18);
        colorcarBotones("Muy grande", false, 26);

        add(laminaBotones, BorderLayout.SOUTH);

//        ButtonGroup grupo = new ButtonGroup();
//
//        boton1 = new JRadioButton("Pequeño", false);
//        boton2 = new JRadioButton("Mediano", true);
//        boton3 = new JRadioButton("Grande", false);
//        boton4 = new JRadioButton("Muy grande", false);
//
//        boton1.addActionListener(e -> {
//            texto.setFont(new Font("Serif", Font.PLAIN, 10));
//        });
//        boton2.addActionListener(e -> {
//            texto.setFont(new Font("Serif", Font.PLAIN, 12));
//        });
//        boton3.addActionListener(e -> {
//            texto.setFont(new Font("Serif", Font.PLAIN, 18));
//        });
//        boton4.addActionListener(e -> {
//            texto.setFont(new Font("Serif", Font.PLAIN, 24));
//        });
//
//        JPanel laminaRadio = new JPanel();
//
//        grupo.add(boton1);
//        grupo.add(boton2);
//        grupo.add(boton3);
//        grupo.add(boton4);
//
//        laminaRadio.add(boton1);
//        laminaRadio.add(boton2);
//        laminaRadio.add(boton3);
//        laminaRadio.add(boton4);
//
//        add(laminaRadio, BorderLayout.SOUTH);
    }

    // Forma corta
    private void colorcarBotones(String nombre, boolean seleccionado, int tamagno) {
        JRadioButton boton = new JRadioButton(nombre, seleccionado);
        grupo.add(boton);
        laminaBotones.add(boton);
        boton.addActionListener(e -> texto.setFont(new Font("Serif", Font.PLAIN, tamagno)));
    }
}