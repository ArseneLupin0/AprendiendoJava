package IntroduccionPRGPildorasInformaticas.ProgramacionBasica.Basico.IV_EntradaSalidaDatos_II;

import javax.swing.*;

public class PruebaClases {

//#############################################################################
//# Entrada Salida de Datos II - Píldoras Informáticas - Video 15             #
//#############################################################################

    public static void main(String[] args) {
        String nombreUsuario = JOptionPane.showInputDialog("Introduce tu nombre, por favor");

//        String edadUsuario = JOptionPane.showInputDialog("Introduce tu edad, por favor"); // Devuelve String

        int edadUsuario = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad, por favor"));

        edadUsuario++;

        System.out.println("Hola, " + nombreUsuario + ". Tienes " + edadUsuario + " años");
    }
}
