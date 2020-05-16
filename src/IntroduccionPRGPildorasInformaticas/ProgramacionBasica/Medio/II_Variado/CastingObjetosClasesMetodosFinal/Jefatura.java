package IntroduccionPRGPildorasInformaticas.ProgramacionBasica.Medio.II_Variado.CastingObjetosClasesMetodosFinal;

public class Jefatura extends Empleados {

//#############################################################################
//# Polimorfismo y enlazado dinámico I - Píldoras Informáticas - Video 43     #
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