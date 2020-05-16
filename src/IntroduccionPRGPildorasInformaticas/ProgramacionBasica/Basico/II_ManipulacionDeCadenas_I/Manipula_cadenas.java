package IntroduccionPRGPildorasInformaticas.ProgramacionBasica.Basico.II_ManipulacionDeCadenas_I;

public class Manipula_cadenas {

//#############################################################################
//# Clase String I - Píldoras Informáticas - Video 11                         #
//#############################################################################

    public static void main(String[] args) {
        String nombre = "Felipe Juan Froilán de Todos los Santos";

        System.out.println("Mi nombre es " + nombre);

        System.out.println("Mi nombre tiene " + nombre.length() + " letras");

        System.out.println("La primera letra de "+ nombre + " es la: " + nombre.charAt(0));

        int ultima_letra = nombre.length();

        System.out.println("La última letra es la: " + nombre.charAt(ultima_letra-1));
    }
}
