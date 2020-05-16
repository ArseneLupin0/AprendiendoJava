package IntroduccionPRGPildorasInformaticas.ProgramacionBasica.Basico.I_EstrucutrasPrincipales.EstructurasPrincipales_V;

public class EstructuraConstantes_Operadores {

//#############################################################################
//# Declaración de operadores II - Píldoras Informáticas - Video 08           #
//#############################################################################

    public static void main(String[] args) {
        final int c = 5; // Constante

        System.out.println(c);

//        c = 8; // Error porque no se puede cambiar el valor de constante (error en compilación)

        // ¿Cuántas pulgas tiene 6 cm?
        final double apulgada = 2.54;

        double cm = 6;

        double resultado = cm / apulgada;

        System.out.println("En " + cm + " cm hay " + resultado + " pulgadas");

        int operador1, operador2, resultado1; // Declaración en una misma línea

        operador1 = 8;
        operador2 = 7;
        resultado1 = operador1 + operador2;

        System.out.println(resultado1);

    }
}
