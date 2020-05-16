package IntroduccionPRGATS.ProgramacionMedia.ZAvanzadoPOO.MainClases6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

//#############################################################################
//# Introducción a POO (Avanzado) - Video 84 (MainClases6)                    #
//#############################################################################

    public static void main(String[] args ) throws IOException {

        // Excepciones Verificadas (IOException)
            // Lectura de un archivo de texto (.txt)
            BufferedReader bf = new BufferedReader(new FileReader("H:\\CFGS\\zPlantillas\\PR - Ayuda\\Ensayo 3 -POO - Intellij\\src\\IntroduccionPRGATS.ProgramacionMedia\\ZAvanzadoPOO\\MainClases6\\prueba"));

            String linea = bf.readLine();

            if (linea != null) {
                System.out.println(linea);
            }

        // Excepciones NO Verificadas (RunTimeException)
            // División entre cero
            int num1 = 5, num2 = 0, resultado;

            resultado = num1 / num2;

            System.out.println(resultado);
    }
}
