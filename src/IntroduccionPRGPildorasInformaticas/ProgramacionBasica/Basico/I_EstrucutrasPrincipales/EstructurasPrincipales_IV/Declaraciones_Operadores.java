package IntroduccionPRGPildorasInformaticas.ProgramacionBasica.Basico.I_EstrucutrasPrincipales.EstructurasPrincipales_IV;

public class Declaraciones_Operadores {
    public static void main(String[] args) {
        int a = 5;
        int b;
        b = 7;
        int c = b + a;

        System.out.println(c);

        c++;

        System.out.println(c);

        c += 6;

        System.out.println(c);

        c -= 5;

        System.out.println(c);

        c = b * a;

        System.out.println(c);

        c = b / a; // Ignora la parte decimal

        System.out.println(c); // Comportamiento de ayuda --> Intelli-sense

        double d = 10, e = 8, f;

        f = d / e;

        System.out.println(f);
    }
}