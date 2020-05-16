package IntroduccionPRGPildorasInformaticas.ProgramacionBasica.Basico.I_EstrucutrasPrincipales.EstructurasPrincipales_VII;

public class Calculos_conMath {

//#############################################################################
//# Clase Math II - Píldoras Informáticas - Video 10                          #
//#############################################################################
    public static void main(String[] args) {
        double num1 = 5.85F;

        int resultado1 = (int) Math.round(num1); // Cast/Refundición a tipo INT

        System.out.println(resultado1);

        int base = 5, exponente = 3;

        int resultado2 = (int) Math.pow(base, exponente);

        System.out.println("El resultado de: " + base + " elevado a " + exponente + " es " + resultado2);
    }
}
