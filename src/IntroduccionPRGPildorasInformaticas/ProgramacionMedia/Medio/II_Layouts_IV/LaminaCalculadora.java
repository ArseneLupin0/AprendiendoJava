package IntroduccionPRGPildorasInformaticas.ProgramacionMedia.Medio.II_Layouts_IV;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LaminaCalculadora extends JPanel {

//#############################################################################
//# Introducción a Layouts IV - Píldoras Informáticas - Video 84              #
//#############################################################################

    private JPanel miLamina2;
    private JButton pantalla;

    public LaminaCalculadora() {
        setLayout(new BorderLayout());

        pantalla = new JButton("0");
        pantalla.setEnabled(false);
        add(pantalla, BorderLayout.NORTH);

        miLamina2 = new JPanel();
        miLamina2.setLayout(new GridLayout(4, 4));

        ActionListener insertar = new InsertaNumero();

        ponerBton("7", insertar);
        ponerBton("8", insertar);
        ponerBton("9", insertar);
//        ponerBton("/");
        ponerBton("4", insertar);
        ponerBton("5", insertar);
        ponerBton("6", insertar);
//        ponerBton("*");
        ponerBton("1", insertar);
        ponerBton("2", insertar);
        ponerBton("3", insertar);
//        ponerBton("-");
        ponerBton("0", insertar);
        ponerBton(",", insertar);
//        ponerBton("=");
//        ponerBton("+");

        add(miLamina2, BorderLayout.CENTER);
    }

    private void ponerBton(String rotulo, ActionListener oyente) {
        JButton boton = new JButton(rotulo);
        boton.addActionListener(oyente);
        miLamina2.add(boton);
    }

    private class InsertaNumero implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String entrada = e.getActionCommand();
            if (pantalla.getText().equals("0"))
                pantalla.setText("");
            pantalla.setText(pantalla.getText() + entrada);
        }
    }
}