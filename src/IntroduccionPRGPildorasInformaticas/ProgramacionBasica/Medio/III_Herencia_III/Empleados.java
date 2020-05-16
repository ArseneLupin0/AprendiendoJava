package IntroduccionPRGPildorasInformaticas.ProgramacionBasica.Medio.III_Herencia_III;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Empleados {

//#############################################################################
//# Herencia III - Píldoras Informáticas - Video 42                           #
//#############################################################################

    private String nombre;
    private double sueldo;
    private Date altaContrato;

    public Empleados(String nom, double sue, int agno, int mes, int dia) {
        nombre = nom;
        sueldo = sue;
        GregorianCalendar calendario = new GregorianCalendar(agno, mes, dia);

        altaContrato = calendario.getTime();
    }

    public Empleados(String nom) {
        this(nom, 30000, 2000, Calendar.JANUARY, 1);
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

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", sueldo=" + sueldo +
                ", altaContrato=" + altaContrato +
                '}';
    }
}
