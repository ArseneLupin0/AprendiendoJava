// Introducción a los métodos, retornos de valores
package IntroduccionPRGATS.ProgramacionMedia.IntermedioPOO;

import javax.swing.*;

public class MainOperacion3 {

//#############################################################################
//# Introducción a POO, Métodos, Retorno de valores - Video 65 Continuación   #
//#############################################################################

    public static void main(String[] args) {

        // Pedimos valores
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un número"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un número"));

        // Creamos objeto
        Operacion3 op = new Operacion3();

        //Definimos las propiedades del objeto y lo guardamos en una variable
        int suma = op.sumar(n1, n2);
        int resta = op.restar(n1, n2);
        int multi = op.multiplicar(n1, n2);
        int div = op.dividir(n1, n2);

        // Definimos las variables
        op.mostrarResultados(suma, resta, multi, div);

        System.out.println("----------");

        // También podemos imprimir los resultados de esta manera, no haría falta hacer el método de mostrar resultados
        System.out.println("La suma es: "+op.sumar(n1, n2));
        System.out.println("La resta es: "+op.restar(n1, n2));
        System.out.println("La multi es: "+op.multiplicar(n1, n2));
        System.out.println("La div es: "+op.dividir(n1, n2));
    }
}
