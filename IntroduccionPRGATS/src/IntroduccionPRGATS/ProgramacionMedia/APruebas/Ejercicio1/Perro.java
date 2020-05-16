package IntroduccionPRGATS.ProgramacionMedia.APruebas.Ejercicio1;

public class Perro {

    // Variables de instancia
    String nombre;
    String raza;
    int edad;
    String color;

    // Método constructor
    public Perro(String nombre, String raza, int edad, String color) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.color = color;
    }

    // Métodos Getters && Setters
    public String getNombre() {
        return nombre;
    }

    public String getRaza() {
        return raza;
    }

    public int getEdad() {
        return edad;
    }

    public String getColor() {
        return color;
    }

    // Método toString

    @Override
    public String toString() {
        return "Hola mi nombre es: "+nombre+
                "\nMi raza es: "+raza+
                "\nTengo: "+edad+" Años"+
                "\nMi color es: "+color;
    }
}
