package IntroduccionPRGPildorasInformaticas.ProgramacionMedia.Medio.III_IntroduccionSwing.I_CuadrosDeTexto_IV;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LaminaPassword extends JPanel {

//#############################################################################
//# Introducción a Cuadros de Texto IV - Píldoras Informáticas - Video 89     #
//#############################################################################

    private JPasswordField campo2; // Crear contraseña con asteriscos

    public LaminaPassword() {
        setLayout(new BorderLayout());
        JPanel laminaSuperior = new JPanel();
        laminaSuperior.setLayout(new GridLayout(2, 2));
        add(laminaSuperior, BorderLayout.NORTH);

        JLabel usuario = new JLabel("Usuario: ");
        laminaSuperior.add(usuario);

        JTextField campo1 = new JTextField(15);
        laminaSuperior.add(campo1);

        JLabel password = new JLabel("Contraseña: ");
        laminaSuperior.add(password);

        campo2 = new JPasswordField(15);
        campo2.getDocument().addDocumentListener(new EscuchaTexto()); // En un paso
//        Document miPass = campo2.getDocument();
//        miPass.addDocumentListener(new EscuchaTexto());
        laminaSuperior.add(campo2);

        JButton ejecuta = new JButton("Enviar");
        ejecuta.addActionListener(new EscuchaTexto());
        add(ejecuta, BorderLayout.SOUTH);
    }

    private class EscuchaTexto implements DocumentListener, ActionListener {
        int i = 0;

        @Override
        public void insertUpdate(DocumentEvent e) {
            passConf();
        }

        @SuppressWarnings("LoopStatementThatDoesntLoop")
        private void passConf() {
            for (i = 1; i <= campo2.getPassword().length; i++) {
                System.out.println("Tu longitud es: " + campo2.getPassword().length);
                if (campo2.getPassword().length >= 8 && (campo2.getPassword().length <= 12)) {
                    System.out.println("Correcto");
                    campo2.setForeground(Color.GREEN);
                } else if (campo2.getPassword().length >= 12) {
                    System.out.println("Demasiados caracteres");
                    campo2.setForeground(Color.RED);
                } else {
                    System.out.println("Tienes menos de 8 caracteres");
                    campo2.setForeground(Color.RED);
                }
                break;
            }
        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            passConf();
        }

        @Override
        public void changedUpdate(DocumentEvent e) {

        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (campo2.getPassword().length >= 8 && campo2.getPassword().length <= 12) {
                JOptionPane.showMessageDialog(null, "Correcto", "Contraseña correcta", JOptionPane.WARNING_MESSAGE);
            } else
                JOptionPane.showMessageDialog(null, "Incorrecto", "Contraseña incorrecta", JOptionPane.ERROR_MESSAGE);
        }
    }
}