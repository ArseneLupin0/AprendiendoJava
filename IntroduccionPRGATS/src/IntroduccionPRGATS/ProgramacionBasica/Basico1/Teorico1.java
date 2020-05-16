package IntroduccionPRGATS.ProgramacionBasica.Basico1;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * @author Oleg
 */
public class Teorico1 {

    public static void main(String[] args) {

//#############################################################################
//# Hola mundo en Java -  Vídeo 1                                             #
//#############################################################################

        System.out.println("Hola mundo!"); // Ponemos sout+tab, para acortar
        System.out.println();

//#############################################################################
//# Tipos de datos primitivos -  Vídeo 6                                      #
//#############################################################################
        
        /* Algunos tipos de variables - enteras
           Nombre   Tamaño   Rango
           long     64 Bits  -9,223,372,036,854,775,808 a 9,223,372,036,854,775,807
           int      32 Bits  -2,147,483,648 a 2,147,483,647
           short    16 Bits  -32,768 a 32,767
           byte     8 Bits   -128 a 127
        */

        byte entero1 = 123;
        System.out.println("El número definido (byte) es: " + entero1);

        short entero2 = 12345;
        System.out.println("El número definido (short) es: " + entero2);

        int entero3 = 1234567891;
        System.out.println("El número definido (int) es: " + entero3);

        long entero4 = 1234567891234567891L;
        System.out.println("El número definido (long) es: " + entero4);
        
        /* Algunos tipos de variables - decimales
           Nombre   Tamaño   Rango
           double   64 Bits  (-)4.9e-324 a (+)1.8e+308
           float    32 Bits  (-)1.4e-045 a (+)3.4e+038
        */

        float decimal1 = 1.12345678f; // Importante! Poner la f al final del número float, o entre paréntesis
        System.out.println("El número definido (float) es: " + decimal1);

        double decimal2 = 1.12345678912345678;
        System.out.println("El número definido (double) es: " + decimal2);
        
        /* Otros tipos de variables
           Nombre   Tamaño   Rango
           char     16 Bits  Todos los caracteres de UTF-16 Unicode
           boolean  2 Bits   Compuesto por True y False
        */

        boolean booleana1 = true;
        System.out.println("La booleana definida (boolean) es: " + booleana1);

        char caracter1 = 'a'; // Importante! Al seleccionar un caracter, tiene que ser con comillas simples
        System.out.println("El caracter definido (char) es: " + caracter1);
        System.out.println();

//#############################################################################
//# Tipos de datos NO primitivos y Cadenas -  Vídeo 7                         #
//#############################################################################

        /* Variables NO primitivas
           Nombre   Descripción
           Integer  Variable, que incluye métodos y clases. Por lo tanto es un objeto y es capaz de almacenar números
           String   Variable, que incluye métodos y clases. Por lo tanto es un objeto y es capaz de almacenar frases 
        */

        String cadena1 = "Bienvenido a mi mundo!";
        //cadena1.getBytes(); // Posibilidad de métodos...
        System.out.println("La cadena definida (string) es: " + cadena1);

        Integer enteros1 = 1;
        //enteros1.longValue(); // Posibilidad de métodos...
        System.out.println("El entero definido (integer) es: " + enteros1);
        System.out.println();

//#############################################################################
//# Cómo funciona una constante -  Vídeo 8                                    #
//#############################################################################

        /* Constantes en Java
           Nombre   Descripción
           final    Para hacer una vaariable constante, solo tendremos que añadir (final), al principio
        */

        final byte numero1 = 120;
        //numero1 = 125; // Si quitásemos el final de el principio de byte, la variable se cambiará
        System.out.println("La constante (final) es: " + numero1);
        System.out.println();

//#############################################################################
//# Funcionamiento de Entrada y Salida de datos por consola -  Vídeo 9        #
//#############################################################################

        /* Clase para obtener datos de entrada por parte del usuario
           Nombre   Descripción
           Scanner  Es una clase de tipo objeto, donde se pueden utilizar varios métodos,
                    para obtener información del usuario. Dependiendo del tipo de datos
        */

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite un número: ");
        int numero2 = entrada.nextInt();
        System.out.println("El número es: " + numero2);
        System.out.println();

        Scanner entrada2 = new Scanner(System.in);
        System.out.print("Digite un segundo número: ");
        float numero3 = entrada2.nextFloat();
        System.out.println("El número es: " + numero3);
        System.out.println();

        Scanner entrada3 = new Scanner(System.in);
        System.out.print("Ponga una frase: ");
        String cadena2 = entrada3.nextLine();
        System.out.println("La cadena es la siguiente: " + cadena2);
        System.out.println();

        Scanner entrada4 = new Scanner(System.in);
        System.out.print("Ponga una letra: ");
        char cadena3 = entrada4.next().charAt(0);
        System.out.println("La letra de entrada es: " + cadena3);
        System.out.println();

//#############################################################################
//# Funcionamiento de Entrada y Salida de datos con JOptionPane -  Vídeo 10   #
//#############################################################################

        /* Clase para obtener datos de entrada por parte del usuario
           Nombre        Descripción
           JOptionPane   Es una clase de tipo objeto, donde se pueden utilizar varios métodos,
                         para obtener información del usuario. Dependiendo del tipo de datos.
                         También crea pequeñas vetanas de interacción con el usuario
        */

        String cadena;
        int entero5;
        char letra;
        double decimal3;

        cadena = JOptionPane.showInputDialog("Digitie una cadena: ");

        entero5 = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));

        letra = JOptionPane.showInputDialog("Digite un caracter: ").charAt(0);

        decimal3 = Double.parseDouble(JOptionPane.showInputDialog("Digite un número con decimales: ")); // Importante! Decimal, se expresa con .

        JOptionPane.showMessageDialog(null, "Esta es la cadena escrita: " + cadena);
        JOptionPane.showMessageDialog(null, "El numero digitado es: " + entero5);
        JOptionPane.showMessageDialog(null, "El caracter escogido es: " + letra);
        JOptionPane.showMessageDialog(null, "El número con decimal es: " + decimal3);

//#############################################################################
//# FINALIZACIÓN DE REPASO PRIMERA PARTE - 1-10 <> CONTINUAR CON TESTING2     #
//#############################################################################

    }
}