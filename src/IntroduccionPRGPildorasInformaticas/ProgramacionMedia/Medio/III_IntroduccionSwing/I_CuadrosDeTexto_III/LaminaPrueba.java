package IntroduccionPRGPildorasInformaticas.ProgramacionMedia.Medio.III_IntroduccionSwing.I_CuadrosDeTexto_III;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;
import java.awt.*;

public class LaminaPrueba extends JPanel {

//#############################################################################
//# Introducción a Cuadros de Texto III - Píldoras Informáticas - Video 88    #
//#############################################################################

    public LaminaPrueba() {
        setLayout(new BorderLayout());
        JPanel lamina2 = new JPanel();
        lamina2.setLayout(new FlowLayout());

        JLabel texto1 = new JLabel("Email: ");
        lamina2.add(texto1);
        JTextField campo1 = new JTextField(20);
        Document miDoc = campo1.getDocument();
        miDoc.addDocumentListener(new EscuchaTexto());
        lamina2.add(campo1);

        add(lamina2, BorderLayout.NORTH);
    }

    private static class EscuchaTexto implements DocumentListener {
        @Override
        public void insertUpdate(DocumentEvent documentEvent) {
            System.out.println("Has insertado texto");
        }

        @Override
        public void removeUpdate(DocumentEvent documentEvent) {
            System.out.println("Has borrado texto");
        }

        @Override
        public void changedUpdate(DocumentEvent documentEvent) {

        }
    }
}