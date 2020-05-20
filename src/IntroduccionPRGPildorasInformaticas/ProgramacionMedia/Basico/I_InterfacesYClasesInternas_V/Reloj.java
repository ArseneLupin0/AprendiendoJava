package IntroduccionPRGPildorasInformaticas.ProgramacionMedia.Basico.I_InterfacesYClasesInternas_V;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Reloj {

    private int intervalo;
    private boolean sonido;

    public Reloj(int intervalo, boolean sonido) {
        this.intervalo = intervalo;
        this.sonido = sonido;
    }

    public void enMarcha() {
        ActionListener oyente = new DameLaHora();
        Timer miTemporizador = new Timer(intervalo, oyente);
        miTemporizador.start();
    }

    // ⬇⬇⬇⬇ Clase Interna, te puedes ahorrar métodos getter y setter!! ⬇⬇⬇⬇

    private class DameLaHora implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            Date ahora = new Date();

            System.out.println("Te pongo la hora cada 3 sg " + ahora);

            if (sonido) {
                Toolkit.getDefaultToolkit().beep();
            }
        }
    }
}