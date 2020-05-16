package IntroduccionPRGPildorasInformaticas.ProgramacionBasica.Medio.III_Herencia_II;

public class UsoVehiculo {

//#############################################################################
//# Herencia II - Píldoras Informáticas - Video 41                            #
//#############################################################################

    public static void main(String[] args) {

        Coche miCoche1 = new Coche();

        miCoche1.estableceColor("Rojo");

        Furgoneta miFurgoneta1 = new Furgoneta(7, 580);

        miFurgoneta1.estableceColor("Azul");
        miFurgoneta1.configuraAsiento("Si");
        miFurgoneta1.configuraClimatizador("Si");
        System.out.println(miFurgoneta1.toString());
        System.out.println(miCoche1.toString());
    }
}