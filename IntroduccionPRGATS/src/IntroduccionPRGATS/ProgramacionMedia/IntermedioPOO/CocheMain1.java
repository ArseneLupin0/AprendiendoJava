package IntroduccionPRGATS.ProgramacionMedia.IntermedioPOO;

public class CocheMain1 {

//#############################################################################
//# Introducción a POO, Creación de Clases y Objetos - Video 62 Continuación  #
//#############################################################################

    // Atributos
    String color, marca;
    int km;

    // Un solo método public - Main
    public static void main(String[] args) {

        // Creamos un objeto
        CocheMain1 coche1 = new CocheMain1();

        // Rellenamos nuestros atribustos creados anteriormente en la clase Coche
        coche1.color = "Blanco";
        coche1.marca = "Audi";
        coche1.km = 0;

        // Imprimimos los resultados
        System.out.println("El color del coche 1 es: "+coche1.color);
        System.out.println("La marca del coche 1 es: "+coche1.marca);
        System.out.println("El kilometraje del coche 1 es: "+coche1.km);

        CocheMain1 coche2 = new CocheMain1();

        coche2.color = "Rojo";
        coche2.marca = "Ferrari";
        coche2.km = 100;

        System.out.println("\nEl color del coche 2 es: "+coche2.color);
        System.out.println("La marca del coche 2 es: "+coche2.marca);
        System.out.println("El kilometraje del coche 2 es: "+coche2.km);
    }
}
