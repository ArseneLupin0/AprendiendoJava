package IntroduccionPRGPildorasInformaticas.ProgramacionMedia.Medio.III_IntroduccionSwing.V_Desplegables_I;

import javax.swing.*;
import java.awt.*;

public class LaminaCombo extends JPanel {

//#############################################################################
//# Introducción a JComboBox I - Píldoras Informáticas - Video 95             #
//#############################################################################

    private JLabel texto;
    private JComboBox<String> combo;

    public LaminaCombo() {
        setLayout(new BorderLayout());
        texto = new JLabel("En un lugar de la Mancha de cuyo nombre...");
        texto.setFont(new Font("Serif", Font.PLAIN, 18));
        add(texto, BorderLayout.CENTER);

        JPanel laminaNorte = new JPanel();
        combo = new JComboBox<>();
        combo.setEditable(true);
        combo.addActionListener(e -> texto.setFont(new Font((String) combo.getSelectedItem(), Font.PLAIN, 18)));

        combo.addItem("Serif");
        combo.addItem("Sans Serif");
        combo.addItem("Monospaced");
        combo.addItem("Dialog");

        laminaNorte.add(combo);

        add(laminaNorte, BorderLayout.NORTH);
    }
}