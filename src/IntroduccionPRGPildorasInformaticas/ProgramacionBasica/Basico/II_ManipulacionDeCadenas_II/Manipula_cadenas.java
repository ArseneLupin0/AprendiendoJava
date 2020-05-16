package IntroduccionPRGPildorasInformaticas.ProgramacionBasica.Basico.II_ManipulacionDeCadenas_II;

public class Manipula_cadenas {

//#############################################################################
//# Clase String II - Píldoras Informáticas - Video 12                        #
//#############################################################################

    public static void main(String[] args) {
        String frase = "Hoy es un estupendo día para aprender a programar en Java";

        String fraseResumen = frase.substring(0, 29) + "irnos a la playa y olvidarnos de todo... y " +
                frase.substring(29, 57);

        System.out.println(fraseResumen);

        String alumno1, alumno2;

        alumno1 = "David";
        alumno2 = "david";

        System.out.println(alumno1.equalsIgnoreCase(alumno2));
    }
}
