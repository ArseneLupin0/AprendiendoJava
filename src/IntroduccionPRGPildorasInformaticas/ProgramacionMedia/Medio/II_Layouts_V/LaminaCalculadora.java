package IntroduccionPRGPildorasInformaticas.ProgramacionMedia.Medio.II_Layouts_V;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LaminaCalculadora extends JPanel {

//#############################################################################
//# Introducción a Layouts V - Píldoras Informáticas - Video 85               #
//#############################################################################

    private JPanel miLamina2;
    private JButton pantalla;
    private boolean principio = true;
    private double resultado;
    private String ultimaOperacion;

    public LaminaCalculadora() {
        setLayout(new BorderLayout());

        pantalla = new JButton("0");
        pantalla.setEnabled(false);
        add(pantalla, BorderLayout.NORTH);

        miLamina2 = new JPanel();
        miLamina2.setLayout(new GridLayout(4, 4));

        ActionListener insertar = new InsertaNumero();
        ActionListener orden = new AccionOrden();

        ponerBoton("7", insertar);
        ponerBoton("8", insertar);
        ponerBoton("9", insertar);
        ponerBoton("/", orden);
        ponerBoton("4", insertar);
        ponerBoton("5", insertar);
        ponerBoton("6", insertar);
        ponerBoton("*", orden);
        ponerBoton("1", insertar);
        ponerBoton("2", insertar);
        ponerBoton("3", insertar);
        ponerBoton("-", orden);
        ponerBoton("0", insertar);
        ponerBoton(",", insertar);
        ponerBoton("=", orden);
        ponerBoton("+", orden);

        add(miLamina2, BorderLayout.CENTER);
        ultimaOperacion = "=";
    }

    private void ponerBoton(String rotulo, ActionListener oyente) {
        JButton boton = new JButton(rotulo);
        boton.addActionListener(oyente);
        miLamina2.add(boton);
    }

    private void calcular(double x) {
        // Más corto y facil con switch case
        switch (ultimaOperacion) {
            case "+":
            case "=":
                resultado += x;
//                System.out.println(resultado);
                break;
            case "-":
                resultado -= x;
                break;
            case "*":
                resultado *= x;
                break;
            case "/":
                resultado /= x;
                break;
        }

//        if (ultimaOperacion.equals("+")) {
//            resultado += x;
//            System.out.println(resultado);
//        } else if (ultimaOperacion.equals("-")) {
//            resultado -= x;
//        } else if (ultimaOperacion.equals("*")) {
//            resultado *= x;
//        } else if (ultimaOperacion.equals("/")) {
//            resultado /= x;
//        } else if (ultimaOperacion.equals("=")) {
//            resultado += x;
//        }
        pantalla.setText(String.valueOf(resultado));
    }

    private class InsertaNumero implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String entrada = e.getActionCommand();
            if (principio) {
                pantalla.setText("");
                principio = false;
            }
            pantalla.setText(pantalla.getText() + entrada);
        }
    }

    private class AccionOrden implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String operacion = e.getActionCommand();
            calcular(Double.parseDouble(pantalla.getText()));

            ultimaOperacion = operacion;

            principio = true;
        }
    }
}