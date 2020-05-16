package IntroduccionPRGPildorasInformaticas.ProgramacionBasica.Medio.II_Variado.Final_I;

public class Pruebas {

//#############################################################################
//# Constantes Uso Final I - Píldoras Informáticas - Video 36                 #
//#############################################################################
    public static void main(String[] args) {
        Empleados trabajador1 = new Empleados("Paco");
        Empleados trabajador2 = new Empleados("Ana");

        trabajador1.cambiaSeccion("RRHH");

        System.out.println(trabajador1.toString());
        System.out.println(trabajador2.toString());
    }
}
