package IntroduccionPRGPildorasInformaticas.ProgramacionBasica.Medio.II_Variado.Static_I;

public class Pruebas {

//#############################################################################
//# Constantes Uso Static I - Píldoras Informáticas - Video 37                #
//#############################################################################
    public static void main(String[] args) {
        Empleados trabajador1 = new Empleados("Paco");
        Empleados trabajador2 = new Empleados("Ana");
        Empleados trabajador3 = new Empleados("Antonio");
        Empleados trabajador4 = new Empleados("María");

        trabajador1.cambiaSeccion("RRHH");

        System.out.println(trabajador1.toString());
        System.out.println(trabajador2.toString());
        System.out.println(trabajador3.toString());
        System.out.println(trabajador4.toString());
    }
}
