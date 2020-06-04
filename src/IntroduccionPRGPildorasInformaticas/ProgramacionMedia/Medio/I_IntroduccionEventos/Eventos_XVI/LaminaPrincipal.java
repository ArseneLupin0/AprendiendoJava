package IntroduccionPRGPildorasInformaticas.ProgramacionMedia.Medio.I_IntroduccionEventos.Eventos_XVI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LaminaPrincipal extends JPanel {

//#############################################################################
//# Introducción a los eventos XVI - Píldoras Informáticas - Video 80         #
//#############################################################################

    public JButton botonCerrar;

    public LaminaPrincipal() {
        JButton botonNuevo = new JButton("Nuevo");
        add(botonNuevo);

        botonCerrar = new JButton("Cerrar todo");
        add(botonCerrar);

        botonNuevo.addActionListener(new OyenteNuevo());
    }

    private class OyenteNuevo implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            MarcoEmergente marco = new MarcoEmergente(botonCerrar);
            marco.setVisible(true);
        }
    }

}