package IntroduccionPRGATS.ProgramacionMedia.ZAvanzadoPOO.MainClases4;

public class Vehiculo {

//#############################################################################
//# Introducción a POO (Avanzado) - Video 78 - Continuación                   #
//#############################################################################

    // Atributos
    protected String matricula, marca, modelo;

    // Constructor
    public Vehiculo(String matricula, String marca, String modelo) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
    }

    // Getter & Setter
    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    // Métodos
    // Overrides
    @Override
    public String toString() {
        return "Vehiculo{" +
                "matricula='" + matricula + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}