package IntroduccionPRGPildorasInformaticas.ProgramacionMedia.Basico.I_InterfacesYClasesInternas_II;

public class Jefatura extends Empleados implements Jefes {

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

    @Override
    public String tomarDecisiones(String decision) {
        return "Un miembro de la dirección ha tomado la decisión de: " + decision;
    }
}