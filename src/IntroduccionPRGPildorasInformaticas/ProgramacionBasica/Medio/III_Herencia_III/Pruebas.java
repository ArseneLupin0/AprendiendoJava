package IntroduccionPRGPildorasInformaticas.ProgramacionBasica.Medio.III_Herencia_III;

public class Pruebas {

//#############################################################################
//# Herencia III - Píldoras Informáticas - Video 42                           #
//#############################################################################
    public static void main(String[] args) {
        Empleados trabajador1 = new Empleados("Paco");
        Empleados trabajador2 = new Empleados("Ana");
        Empleados trabajador3 = new Empleados("Antonio");
        Empleados trabajador4 = new Empleados("María");



        System.out.println(trabajador1.toString());
        System.out.println(trabajador2.toString());
        System.out.println(trabajador3.toString());
        System.out.println(trabajador4.toString());
    }
}
