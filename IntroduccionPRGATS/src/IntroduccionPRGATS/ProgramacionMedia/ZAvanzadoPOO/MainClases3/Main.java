package IntroduccionPRGATS.ProgramacionMedia.ZAvanzadoPOO.MainClases3;

public class Main {

//#############################################################################
//# Introducción a POO (Avanzado) - Video 77 - Continuación                   #
//#############################################################################

    public static void main(String[] args) {

        // Creación de los objetos
        Planta platan1 = new Planta();
        AnimalCarnivoro animalc = new AnimalCarnivoro();
        AnimalHerbivoro animalh = new AnimalHerbivoro();

        // Imprimimos
        platan1.alimentarse();
        animalc.alimentarse();
        animalh.alimentarse();
    }
}
