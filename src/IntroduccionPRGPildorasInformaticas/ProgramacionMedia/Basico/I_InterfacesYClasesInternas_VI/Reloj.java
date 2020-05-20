package IntroduccionPRGPildorasInformaticas.ProgramacionMedia.Basico.I_InterfacesYClasesInternas_VI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Reloj {

    public void enMarcha(int intervalo, boolean sonido) {
        // ⬇⬇⬇⬇ Clase Interna Local, no es visible ⬇⬇⬇⬇

        class DameLaHora implements ActionListener {

            @Override
            public void actionPerformed(ActionEvent event) {
                Date ahora = new Date();

                System.out.println("Te pongo la hora cada 3 sg " + ahora);

                if (sonido) {
                    Toolkit.getDefaultToolkit().beep();
                }
            }
        }

        ActionListener oyente = new DameLaHora();
        Timer miTemporizador = new Timer(intervalo, oyente);
        miTemporizador.start();
    }
}