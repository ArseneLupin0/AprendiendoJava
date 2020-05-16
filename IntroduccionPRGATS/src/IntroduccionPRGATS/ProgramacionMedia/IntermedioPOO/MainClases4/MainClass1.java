// Miembros estátiso de una clase, o también miembros de clase, contunuación
package IntroduccionPRGATS.ProgramacionMedia.IntermedioPOO.MainClases4;

public class MainClass1 {

//#############################################################################
//# Introducción a POO, Miembros estáticos de una clase - Video 71            #
//#############################################################################

    private /*static*/ String frase = "Primera frase";

    public static int sumar(int n1, int n2) {
        int suma = n1 + n2;
        return suma;
    }

    public static void main(String[] args) {
        MainClass1 objeto1 = new MainClass1();
        MainClass1 objeto2 = new MainClass1();

        objeto2.frase = "Segunda frase";

        System.out.println(objeto1.frase);
        System.out.println(objeto2.frase);

        System.out.println(MainClass1.sumar(10,10));
    }
}
