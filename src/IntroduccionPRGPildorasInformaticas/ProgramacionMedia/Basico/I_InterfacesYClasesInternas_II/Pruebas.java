package IntroduccionPRGPildorasInformaticas.ProgramacionMedia.Basico.I_InterfacesYClasesInternas_II;

import java.util.Arrays;
import java.util.Calendar;

public class Pruebas {

//#############################################################################
//# Interfaces Y Clases Externas II - Píldoras Informáticas - Video 50        #
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

        Jefatura jefa_Finanzas = (Jefatura) misEmpleados[5];

        jefa_Finanzas.setIncentivo(55000);

        Empleados directorComercial = new Jefatura("Sandra", 85000, 2012, Calendar.JUNE, 5);

        Comparable ejemplo = new Empleados("Elisabeth", 95000, 2011, Calendar.JULY, 7);

        if (directorComercial instanceof Jefatura) {
            System.out.println("Es de tipo Jefatura");
        }

        if (ejemplo instanceof Comparable) {
            System.out.println("Implementa la interfaz comparable");
        }

        System.out.println(jefa_Finanzas.tomarDecisiones("dar más días de vacaciones a los empleados"));

        for (Empleados e :
                misEmpleados) {
            e.subeSueldo(5);
        }

        Arrays.sort(misEmpleados);

        for (Empleados e :
                misEmpleados) {
            System.out.println("Nombre: " + e.dameNombre()
                    + " Sueldo: " + e.dameSueldo() // Polimorfismos en acción.
                    + " Fecha de Alta: " + e.dameFechaContrato());
        }
    }
}