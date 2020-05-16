package IntroduccionPRGATS.ProgramacionBasica.Medio1;

import javax.swing.JOptionPane;

/**
 * @author Oleg
 */
public class Teorico3 {

    public static void main(String[] args) {

//#############################################################################
//# Condicionales sentencia IF y ELSE - Video 19                               #
//#############################################################################

        /* Sentencia IF
            if(Condición, si verdadero){
                Instrucción1;
            }
            else(Si falso){
                Instrucción2;
            }
        */

        int numero, dato = 5;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número"));

        if (numero == dato) {
            JOptionPane.showMessageDialog(null, "El número es 5");
        } else {
            JOptionPane.showMessageDialog(null, "El número es diferente de 5");
        }

//#############################################################################
//# Condicionales sentencia SWITCH - Video 20                                  #
//#############################################################################

        /* Sentencia SWITCH
            switch(Dato){
                case 1: Instrucción1;
                        break;
                case 2: Instrucción2;
                        break;
                ...
                case n: InstrucciónN;
                        break;
                default: CasoContrario;
                        break; // Sirve para salir de la sentencia *Obligatorio en case
            }
        */

        int dato1;
        dato1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un dígito"));

        switch (dato1) {
            case 1:
                JOptionPane.showMessageDialog(null, "El número es 1");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "El número es 2");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "El número es 3");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "El número es 4");
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "El número es 5");
                break;
            default:
                JOptionPane.showMessageDialog(null, "El número no está entre 1 y 5");
        }
    }
}
