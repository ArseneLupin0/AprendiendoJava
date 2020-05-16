package IntroduccionPRGPildorasInformaticas.ProgramacionBasica.Basico.V_Condicionales_II;

import javax.swing.*;
import java.util.Scanner;

public class Poligonos {

//#############################################################################
//# Condicionales II - Píldoras Informáticas - Video 17                       #
//#############################################################################

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Elije una opción: \n" +
                "1: Cuadrado\n" +
                "2: Rectángulo\n" +
                "3: Triángulo\n" +
                "4: Círculo" +
                "Opción a escoger: ");

        int figura = entrada.nextInt();

        switch (figura) {
            case 1:
                // es estático no es necesario crear objeto, se utiliza el nombre de la clase
                int lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado"));
                System.out.println("El área del cuadrado es: " + Math.pow(lado, 2));
                break;
            case 2:
                int base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
                int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
                System.out.println("El área del rectángulo es: " + base * altura);
                break;
            case 3:
                base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
                altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
                System.out.println("El área del triángulo es: " + base*altura/2);
                break;
            case 4:
                int radio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el raido"));
                System.out.print("El área del círculo es: ");
                System.out.printf("%1.2f", Math.PI * (Math.pow(radio, 2)));
                break;
            default:
                System.out.println("La opción no es correcta");
        }
    }
}