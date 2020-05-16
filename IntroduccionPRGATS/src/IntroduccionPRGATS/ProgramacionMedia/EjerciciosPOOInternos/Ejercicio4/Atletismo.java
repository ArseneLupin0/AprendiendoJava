package IntroduccionPRGATS.ProgramacionMedia.EjerciciosPOOInternos.Ejercicio4;

public class Atletismo {
    // Atributos
    private int nAtleta;
    private String nombre;
    private int tiempoMin;

    // Constructor
    public Atletismo(int nAtleta, String nombre, int tiempoMin) {
        this.nAtleta = nAtleta;
        this.nombre = nombre;
        this.tiempoMin = tiempoMin;
    }

    // Métodos Getter & Setter
    public int getTiempoMin() {
        return tiempoMin;
    }

    public String mostrarDatos() {
        return "Nombre del atleta: " + nombre +
                "\nNúmero del atleta: " + nAtleta +
                "\nTiempo de carrera (min): " + tiempoMin + "\n";
    }
}
