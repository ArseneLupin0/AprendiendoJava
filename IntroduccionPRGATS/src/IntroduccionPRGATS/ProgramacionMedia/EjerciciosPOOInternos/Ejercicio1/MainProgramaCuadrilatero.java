package IntroduccionPRGATS.ProgramacionMedia.EjerciciosPOOInternos.Ejercicio1;

import javax.swing.*;

public class MainProgramaCuadrilatero {

//#############################################################################
//# Ejercicio 1 - POO - Video 72                                              #
//#############################################################################

    /* Ejercicio 1
        Construir un programa que calcule el área y el perímetro de un cuadrilátero
        dada la longitud de sus dos lados. Los valores de la longitud deberán introducirse
        por líena de ordenes. Si es un cuadrado, sólo se proporcionará la longitud de uno
        de los lados al constructor.
     */

    public static void main(String[] args) {
        int opcion;
        double lado1, lado2;

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("\tEscoja una opción" +
                    "\n1.- Pedir datos" +
                    "\n2.- Salir"));
            System.out.println();
            switch (opcion){
                case 1:
                    lado1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer lado"));
                    lado2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo lado"));
                    ProgramaCuadrilatero cuadrilatero1 = new ProgramaCuadrilatero(lado1, lado2);

                    if (lado1 == lado2){
                        System.out.flush();
                        System.out.println("Esto es un cuadrado");
                        System.out.println("El área es: "+cuadrilatero1.getAreaCuadrado());
                        System.out.println("El perímetro es: "+cuadrilatero1.getPerimetroCuadrado());
                        System.out.println();
                    }
                    else {
                        System.out.println("Esto es un cuadrilátero");
                        System.out.println("El área es: "+cuadrilatero1.getAreaCuadri());
                        System.out.println("El perímetro es: "+cuadrilatero1.getPerimetroCuadri());
                    }
                    break;
                case 2:
                    System.out.println("Usted va a salir del programa");

            }
            if (opcion < 1 || opcion > 2){
                System.out.println("Ingrese un número correcto");
            }
        } while (opcion != 2);
    }
}
