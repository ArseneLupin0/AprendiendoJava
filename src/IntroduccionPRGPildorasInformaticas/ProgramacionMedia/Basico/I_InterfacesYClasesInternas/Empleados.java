package IntroduccionPRGPildorasInformaticas.ProgramacionMedia.Basico.I_InterfacesYClasesInternas;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Empleados {

//#############################################################################
//# Interfaces Y Clases Externas I - Píldoras Informáticas - Video 49         #
//#############################################################################

    private String nombre;
    private double sueldo;
    private Date altaContrato;
    private int id;
    private static int idSiguiente=1;

    public Empleados(String nom, double sue, int agno, int mes, int dia) {
        nombre = nom;
        sueldo = sue;
        GregorianCalendar calendario = new GregorianCalendar(agno, mes, dia);
        altaContrato = calendario.getTime();

        id = idSiguiente;
        idSiguiente++;
    }

    public Empleados(String nom) {
        this(nom, 30000, 2000, Calendar.JANUARY, 1);
        id = idSiguiente;
        idSiguiente++;
    }

    public String dameNombre() { // GETTER
        return nombre + " Id: " + id;
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

    public static String dameIdSiguiente() {
        return "El Id siguiente es: " + idSiguiente;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre=" + nombre +
                ", id=" + id +
                ", sueldo=" + sueldo +
                ", altaContrato=" + altaContrato +
                '}';
    }
}