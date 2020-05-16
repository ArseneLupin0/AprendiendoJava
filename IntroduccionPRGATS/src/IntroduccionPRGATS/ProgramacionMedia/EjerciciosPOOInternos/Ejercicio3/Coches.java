package IntroduccionPRGATS.ProgramacionMedia.EjerciciosPOOInternos.Ejercicio3;

public class Coches {
    // Atributos
    private String marca, modelo;
    private double precio;

    // Método Constructor
    public Coches(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    // Getter && Setter
    public double getPrecio() {
        return precio;
    }

    // Métodos generales
    public String mostrarDatos() {
        return "Marca: "+marca+
                "\nModelo: "+modelo+
                "\nPrecio: "+precio;
    }
}
