// Introducción a los métodos
package IntroduccionPRGATS.ProgramacionMedia.IntermedioPOO;

import javax.swing.*;

public class Operacion1 {

//#############################################################################
//# Introducción a POO, Creación de Métodos - Video 63 Continuación           #
//#############################################################################

    // Atributos
    int numero1;
    int numero2;
    int suma;
    int resta;
    int multiplicacion;
    int division;

    // Métodos

    // Método para pedirle al usuario que nos digite dos números
    public void leerNumeros(){
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un número"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un número"));
    }

    // Método para sumar ambos números - Todos sin retorno
    public void sumar(){
        suma = numero1 + numero2;
    }

    // Método para restar ambos números
    public void restar(){
        resta = numero1 - numero2;
    }

    // Método para multiplicar ambos números
    public void multiplicar(){
        multiplicacion = numero1 * numero2;
    }

    // Método para dividir ambos números
    public void division(){
        division = numero1 / numero2;
    }

    // Método para imprimir todos los resultados
    public void mostrarResultados(){
        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La multiplicación es: "+multiplicacion);
        System.out.println("La división es: "+division);
    }
}
