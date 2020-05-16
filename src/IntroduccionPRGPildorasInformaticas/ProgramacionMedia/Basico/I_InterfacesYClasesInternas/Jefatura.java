package IntroduccionPRGPildorasInformaticas.ProgramacionMedia.Basico.I_InterfacesYClasesInternas;

public class Jefatura extends Empleados {

//#############################################################################
//# Interfaces Y Clases Externas I - Píldoras Informáticas - Video 49         #
//#############################################################################

    private double incentivo;

    public Jefatura(String nom, double sue, int agno, int mes, int dia) {
        super(nom, sue, agno, mes, dia);
    }

    public void setIncentivo(double incentivo) {
        this.incentivo = incentivo;
    }

    @Override
    public double dameSueldo() {
        return super.dameSueldo() + incentivo; // Utilizando super llamará a dameSueldo de la clase padre
    }

    @Override
    public String toString() {
        return "Jefatura{" +
                "incentivo=" + incentivo + ", " + super.toString() +
                '}';
    }
}