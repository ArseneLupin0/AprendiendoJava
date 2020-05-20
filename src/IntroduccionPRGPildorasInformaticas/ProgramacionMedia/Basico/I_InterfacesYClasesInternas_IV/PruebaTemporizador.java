package IntroduccionPRGPildorasInformaticas.ProgramacionMedia.Basico.I_InterfacesYClasesInternas_IV;

import javax.swing.*;

public class PruebaTemporizador {

//#############################################################################
//# Interfaces Y Clases Externas IV - Píldoras Informáticas - Video 52        #
//#############################################################################

    public static void main(String[] args) {
        DameLaHora oyente = new DameLaHora();

//        ActionListener oyente = new DameLaHora(); // Otra manera de hacerlo funcionar con lo aprendido anteriormente
        Timer miTemporizador = new Timer(5000, oyente);
        miTemporizador.start();

        JOptionPane.showMessageDialog(null, "Pulsa aceptar para detener");
        System.exit(0);
    }
}