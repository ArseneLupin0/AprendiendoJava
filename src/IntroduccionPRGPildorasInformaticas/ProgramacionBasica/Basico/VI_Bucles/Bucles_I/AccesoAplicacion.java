package IntroduccionPRGPildorasInformaticas.ProgramacionBasica.Basico.VI_Bucles.Bucles_I;

import javax.swing.*;

public class AccesoAplicacion {

//#############################################################################
//# Bucles I - Píldoras Informáticas - Video 18                               #
//#############################################################################
    public static void main(String[] args) {

        String clave = "Juan";

        String pass = "";

        while (!clave.equals(pass)) {
            pass = JOptionPane.showInputDialog("Introduce la contraseña por favor");

            if (!clave.equals(pass)) {
                System.out.println("Contraseña incorrecta");
            }
        }
        System.out.println("Contraseña correcta. Acceso permitido");
    }
}