package IntroduccionPRGATS.ProgramacionMedia.ZAvanzadoPOO.MainClases7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

//#############################################################################
//# Introducción a POO (Avanzado) - Video 85 (MainClases7)                    #
//#############################################################################

    public static void main(String[] args) {

    }

    // Error que nos arroja - java: unreported exception java.io.FileNotFoundException; must be caught or declared to be thrown
    public void leerArchivo() throws FileNotFoundException {
        File archivo = new File("H:\\CFGS\\zPlantillas\\PR - Ayuda\\Ensayo 3 -POO - Intellij\\src\\IntroduccionPRGATS.ProgramacionMedia\\ZAvanzadoPOO\\MainClases7\\prueba");

        FileReader fr = new FileReader(archivo);
        System.out.println(archivo);
    }

    public void leerArchivo2() throws IOException {
        leerArchivo();
    }
}
