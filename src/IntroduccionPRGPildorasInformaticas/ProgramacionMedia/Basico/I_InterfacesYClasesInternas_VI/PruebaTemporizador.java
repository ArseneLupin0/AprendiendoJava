package IntroduccionPRGPildorasInformaticas.ProgramacionMedia.Basico.I_InterfacesYClasesInternas_VI;

import javax.swing.*;

public class PruebaTemporizador {

//#############################################################################
//# Interfaces Y Clases Externas VI - Píldoras Informáticas - Video 54        #
//#############################################################################

    public static void main(String[] args) {
        Reloj miReloj = new Reloj();
        miReloj.enMarcha(3000, true);

        JOptionPane.showMessageDialog(null, "Pulsa Aceptar para terminar");
        System.exit(0);
    }
}