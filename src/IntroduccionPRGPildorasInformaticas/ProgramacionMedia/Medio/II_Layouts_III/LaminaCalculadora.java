package IntroduccionPRGPildorasInformaticas.ProgramacionMedia.Medio.II_Layouts_III;

import javax.swing.*;
import java.awt.*;

public class LaminaCalculadora extends JPanel {

//#############################################################################
//# Introducción a Layouts III - Píldoras Informáticas - Video 83             #
//#############################################################################

    //    HashMap<String, JButton> botones = new HashMap<>(); Testeando
    private JPanel miLamina2;

    public LaminaCalculadora() {
        setLayout(new BorderLayout());

        JButton pantalla = new JButton("0");
        pantalla.setEnabled(false);
        add(pantalla, BorderLayout.NORTH);

        miLamina2 = new JPanel();
        miLamina2.setLayout(new GridLayout(4, 4));

        ponerBton("7");
        ponerBton("8");
        ponerBton("9");
        ponerBton("/");
        ponerBton("4");
        ponerBton("5");
        ponerBton("6");
        ponerBton("*");
        ponerBton("1");
        ponerBton("2");
        ponerBton("3");
        ponerBton("-");
        ponerBton("0");
        ponerBton(",");
        ponerBton("=");
        ponerBton("+");

        add(miLamina2, BorderLayout.CENTER);

//        Testing
//        for (int i = 0; i < 9; i++) {
//            JButton boton = new JButton("" + i);
//            botones.put("boton" + i, boton);              // Testeando
//            miLamina2.add(boton);
//        }

//        Forma más normal
//        JButton boton1 = new JButton("1");
//        miLamina2.add(boton1);
//        JButton boton2 = new JButton("2");
//        miLamina2.add(boton2);
//        JButton boton3 = new JButton("3");
//        miLamina2.add(boton3);
//        JButton boton4 = new JButton("4");
//        miLamina2.add(boton4);
//        JButton boton5 = new JButton("5");
//        miLamina2.add(boton5);
//        JButton boton6 = new JButton("6");
//        miLamina2.add(boton6);
//        JButton boton7 = new JButton("7");
//        miLamina2.add(boton7);
//        JButton boton8 = new JButton("8");
//        miLamina2.add(boton8);
//        JButton boton9 = new JButton("9");
//        miLamina2.add(boton9);
//        JButton boton10 = new JButton("=");
//        miLamina2.add(boton10);
//        JButton boton11 = new JButton("*");
//        miLamina2.add(boton11);
//        JButton boton12 = new JButton("+");
//        miLamina2.add(boton12);
//        JButton boton13 = new JButton(".");
//        miLamina2.add(boton13);
//        JButton boton14 = new JButton("/");
//        miLamina2.add(boton14);
//        JButton boton15 = new JButton("-");
//        miLamina2.add(boton15);
//        JButton boton16 = new JButton("");
//        miLamina2.add(boton16);
//        add(miLamina2, BorderLayout.CENTER);
    }

    private void ponerBton(String rotulo) {
        JButton boton = new JButton(rotulo);
        miLamina2.add(boton);
    }
}