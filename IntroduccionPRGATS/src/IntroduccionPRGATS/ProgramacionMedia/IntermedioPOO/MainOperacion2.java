// Introducción a los métodos - Parámetros y Argumentos
package IntroduccionPRGATS.ProgramacionMedia.IntermedioPOO;

import javax.swing.*;

public class MainOperacion2 {

//#############################################################################
//# Introducción a POO, Parámetros y Argumentos - Video 64 Continuación       #
//#############################################################################

    public static void main(String[] args) {

        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un número"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un número"));

        Operacion2 op = new Operacion2();

        op.sumar(n1, n2);
        op.restar(n1, n2);
        op.multiplicar(n1, n2);
        op.dividir(n1, n2);

        op.mostrarResultados();
    }
}
