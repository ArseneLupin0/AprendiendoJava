package IntroduccionPRGATS.ProgramacionMedia.ZAvanzadoPOO.MainClases8;

import javax.swing.*;
import java.io.*;

public class Main {

//#############################################################################
//# Introducción a POO (Avanzado) - Video 86 (MainClases8)                    #
//#############################################################################

    public static void main(String[] args) {
        Main prueba = new Main();

        prueba.leerArchivo2();
    }

    public void leerArchivo() throws IOException {
        File archivo = new File("H:\\CFGS\\zPlantillas\\PR - Ayuda\\Ensayo 3 -POO - Intellij\\src\\IntroduccionPRGATS.ProgramacionMedia\\ZAvanzadoPOO\\MainClases8\\prueba");
        FileReader fr = new FileReader(archivo);
        BufferedReader bf = new BufferedReader(fr);

        String linea;

        while ((linea = bf.readLine()) != null) {
            System.out.println(linea);
        }
    }

    public void leerArchivo2() {
        try {
            leerArchivo();
        } catch (FileNotFoundException ex) { // Como lanza un objeto, hay que crearlo "ex"
            JOptionPane.showMessageDialog(null, "No se ha encontrado el archivo deseado, por favor verifique la ruta", "Error Archivo no encontrado", JOptionPane.ERROR_MESSAGE);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido una excepción verificada", "Excepción Verificada", JOptionPane.ERROR_MESSAGE);
        } finally {
            System.out.println("Hola mundo igualmente");
        }

        System.out.println("Programa terminado");
    }
}
