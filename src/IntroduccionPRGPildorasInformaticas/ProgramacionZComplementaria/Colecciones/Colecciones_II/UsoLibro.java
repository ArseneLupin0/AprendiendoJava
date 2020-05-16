package IntroduccionPRGPildorasInformaticas.ProgramacionZComplementaria.Colecciones.Colecciones_II;

public class UsoLibro {
    public static void main(String[] args) {
        Libro libro1 = new Libro("P en Java", "Juan", 25);
        Libro libro2 = new Libro("P en Java x2", "Juan", 25);

        if (libro1.equals(libro2)) {
            System.out.println("Es el mismo libro");
        } else System.out.println("Son diferentes libros");
    }
}
