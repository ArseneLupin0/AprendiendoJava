package IntroduccionPRGPildorasInformaticas.ProgramacionMedia.Medio.III_IntroduccionSwing.IV_BotonesDeRadio_I;

import javax.swing.*;

public class LaminaRadio extends JPanel {

//#############################################################################
//# Introducción a JRadioButton I - Píldoras Informáticas - Video 93          #
//#############################################################################

    public LaminaRadio() {
        ButtonGroup grupo1 = new ButtonGroup();
        ButtonGroup grupo2 = new ButtonGroup();

        JRadioButton boton1 = new JRadioButton("Azul", false);
        grupo1.add(boton1);
        JRadioButton boton2 = new JRadioButton("Rojo", true);
        grupo1.add(boton2);
        JRadioButton boton3 = new JRadioButton("Verde", false);
        grupo1.add(boton3);

        JRadioButton boton4 = new JRadioButton("Masculino", false);
        grupo2.add(boton4);
        JRadioButton boton5 = new JRadioButton("Femenino", false);
        grupo2.add(boton5);

        add(boton1);
        add(boton2);
        add(boton3);
        add(boton4);
        add(boton5);
    }
}