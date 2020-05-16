package IntroduccionPRGPildorasInformaticas.ProgramacionBasica.Medio.III_Herencia_III;

public class Jefatura extends Empleados {

//#############################################################################
//# Herencia III - Píldoras Informáticas - Video 42                           #
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
}
