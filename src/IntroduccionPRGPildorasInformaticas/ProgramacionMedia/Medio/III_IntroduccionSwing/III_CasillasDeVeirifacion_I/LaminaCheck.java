package IntroduccionPRGPildorasInformaticas.ProgramacionMedia.Medio.III_IntroduccionSwing.III_CasillasDeVeirifacion_I;

import javax.swing.*;
import java.awt.*;

public class LaminaCheck extends JPanel {

//#############################################################################
//# Introducción a CheckBox I - Píldoras Informáticas - Video 92              #
//#############################################################################

    private JLabel texto;
    private JCheckBox check1, check2;

    public LaminaCheck() {
        setLayout(new BorderLayout());
        Font letra = new Font("Serif", Font.PLAIN, 24);
        texto = new JLabel("En un lugar de la Mancha de cuyo nombre...");
        texto.setFont(letra);

        JPanel laminaTexto = new JPanel();
        laminaTexto.add(texto);
        add(laminaTexto, BorderLayout.CENTER);

        check1 = new JCheckBox("Negrita");
        check2 = new JCheckBox("Cursiva");

        check1.addActionListener(e -> setChecks());

        check2.addActionListener(e -> setChecks());

        JPanel laminaChecks = new JPanel();
        laminaChecks.add(check1);
        laminaChecks.add(check2);
        add(laminaChecks, BorderLayout.SOUTH);
    }

    private void setChecks() {
        int tipo = 0;
        if (check1.isSelected()) tipo += Font.BOLD;
        if (check2.isSelected()) tipo += Font.ITALIC;
        //noinspection MagicConstant
        texto.setFont(new Font("Serif", tipo, 24));
    }
}