package IntroduccionPRGPildorasInformaticas.ProgramacionMedia.Medio.III_IntroduccionSwing.II_AreasDeTexto_II;

import javax.swing.*;
import java.awt.*;

public class MarcoArea extends JFrame {

//#############################################################################
//# Introducción a Areas de Texto II - Píldoras Informáticas - Video 91       #
//#############################################################################

    private JButton botonSaltoLinea;
    private JTextArea areaTexto;

    public MarcoArea() {
        setTitle("Probando Área de Texto");
        setBounds(500, 300, 500, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        JPanel laminaBoton = new JPanel();
        JButton botonInsertar = new JButton("Insertar");
        botonInsertar.addActionListener(e -> areaTexto.append("En un lugar de la mancha de cuyo nombre no quiero acordarme. "));
        laminaBoton.add(botonInsertar);

        botonSaltoLinea = new JButton("Salto Línea");

        botonSaltoLinea.addActionListener(e -> {
            boolean saltar = !areaTexto.getLineWrap();
            areaTexto.setLineWrap(saltar);
            botonSaltoLinea.setText(saltar ? "Quitar Salto" : "Salto Línea"); // Con operadores ternarios
        });

        laminaBoton.add(botonSaltoLinea);
        add(laminaBoton, BorderLayout.SOUTH);

        areaTexto = new JTextArea(8, 20);
        JScrollPane scroll = new JScrollPane(areaTexto);
        add(scroll, BorderLayout.CENTER);
    }
}