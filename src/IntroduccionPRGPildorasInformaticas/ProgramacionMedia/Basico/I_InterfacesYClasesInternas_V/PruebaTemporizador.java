package IntroduccionPRGPildorasInformaticas.ProgramacionMedia.Basico.I_InterfacesYClasesInternas_V;

import javax.swing.*;

public class PruebaTemporizador {

//#############################################################################
//# Interfaces Y Clases Externas V - Píldoras Informáticas - Video 53         #
//#############################################################################

    public static void main(String[] args) {
        Reloj miReloj = new Reloj(3000, true);
        miReloj.enMarcha();

        JOptionPane.showMessageDialog(null, "Pulsa Aceptar para terminar");
        System.exit(0);
    }
}