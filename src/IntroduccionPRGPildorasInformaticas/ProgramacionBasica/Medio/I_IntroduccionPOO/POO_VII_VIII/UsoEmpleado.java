package IntroduccionPRGPildorasInformaticas.ProgramacionBasica.Medio.I_IntroduccionPOO.POO_VII_VIII;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class UsoEmpleado {

//#############################################################################
//# Introducción a POO VII + VIII - Píldoras Informáticas - Video 33 y 34     #
//#############################################################################

}

class Empleado {

    private String nombre;
    private double sueldo;
    private Date altaContrato;

    public Empleado(String nom, double sue, int agno, int mes, int dia) {
        nombre = nom;
        sueldo = sue;
        GregorianCalendar calendario = new GregorianCalendar(agno, Calendar.JANUARY, dia);

        altaContrato = calendario.getTime();
    }

    public String DameNombre() { // GETTER
        return nombre;
    }

    public double dameSueldo() { // GETTER
        return sueldo;
    }

    public Date dameFechaContrato() {
        return altaContrato;
    }

    public void subeSueldo(double porcentaje) { // SETTER
        double aumento = sueldo * porcentaje / 100;

        sueldo += aumento;
    }


}
