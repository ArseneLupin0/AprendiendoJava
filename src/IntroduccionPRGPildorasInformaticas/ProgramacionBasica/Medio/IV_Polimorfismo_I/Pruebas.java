package IntroduccionPRGPildorasInformaticas.ProgramacionBasica.Medio.IV_Polimorfismo_I;

import java.util.Calendar;

public class Pruebas {

//#############################################################################
//# Polimorfismo y enlazado dinámico I - Píldoras Informáticas - Video 43     #
//#############################################################################
    public static void main(String[] args) {
        Jefatura jefeRRHH = new Jefatura("Juan", 55000, 2006, 9, 25);

        jefeRRHH.setIncentivo(2570);

        Empleados[] misEmpleados = new Empleados[6];

        misEmpleados[0] = new Empleados("Ana", 30000, 2000, Calendar.AUGUST, 7);
        misEmpleados[1] = new Empleados("Carlos", 50000, 1995, Calendar.JULY, 15);
        misEmpleados[2] = new Empleados("Paco", 25000, 2005, Calendar.OCTOBER, 25);
        misEmpleados[3] = new Empleados("Antonio", 47500, 2009, Calendar.DECEMBER, 9);
        misEmpleados[4] = jefeRRHH; // Polimorfismos en acción. Principio de sustitución.
        misEmpleados[5] = new Jefatura("María", 95000, 1999, Calendar.JUNE, 26);

        for (Empleados e :
                misEmpleados) {
            e.subeSueldo(5);
        }

        for (Empleados e :
                misEmpleados) {
            System.out.println(e.toString());
        }

        System.out.println();

        for (Empleados e :
                misEmpleados) {
            System.out.println("Nombre: " + e.dameNombre()
                    + " Sueldo: " + e.dameSueldo() // Polimorfismos en acción.
                    + " Fecha de Alta: " + e.dameFechaContrato());
        }
    }
}