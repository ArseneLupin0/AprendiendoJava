package IntroduccionPRGATS.ProgramacionMedia.EjerciciosPOOInternos.Ejercicio2;

import javax.swing.*;

public class MainTablero {

//#############################################################################
//# Ejercicio 2 - POO - Video 72                                              #
//#############################################################################

    /* Ejercicio 2
        Construir un programa que permita dirigir el movimiento de un objeto dentro de un
        tablero y actualice su posición dentro del mismo. Los movimiento posibles son
        ARRIBA, ABAJO, IZQUIERDA y DERECHA. Tras cada movimiento el programa mostrará la
        nueva dirección elegida y las coordenas de situación del objeto dentro del tablero.
     */

    public static void main(String[] args) {
        Tablero ficha = new Tablero();

        String numero;

        do {
            numero = JOptionPane.showInputDialog("\t\tBienvenido al Ejercicio 2" +
                    "\nIngrese una de las siguientes letras:\n" +
                    "\nW  --- Para arriba" +
                    "\nD   --- Para la derecha" +
                    "\nA   --- Para la izquierda" +
                    "\nS   --- Para ir para abajo" +
                    "\n\nPara imprimir la posición escriba:" +
                    "\n- Pos");
            switch (numero) {
                case "w":
                    ficha.arribaPunto();
                    ficha.arriba();
                    System.out.println(ficha.toString());
                    break;
                case "s":
                    ficha.abajoPunto();
                    ficha.abajo();
                    System.out.println(ficha.toString());
                    break;
                case "d":
                    ficha.derechaPunto();
                    ficha.derecha();
                    System.out.println(ficha.toString());
                    break;
                case "a":
                    ficha.izquierdaPunto();
                    ficha.izquierda();
                    System.out.println(ficha.toString());
                    break;
                case "salir":
                    break;
                case "pos":
                    System.out.println();
                    ficha.pos();
                    break;
                default:
                    System.out.println("Ingrese otra letra" +
                            "\n\t\to" +
                            "\nEscriba \"salir\"");
            }

        } while (numero.compareToIgnoreCase("salir") != 0);

        ficha.pos();
    }
}
