package IntroduccionPRGATS.ProgramacionMedia.EjerciciosPOOInternos.Ejercicio2;

public class Tablero {

    // Atributos
    private int arribaFijo;
    private int abajoFijo;
    private int derechaFijo;
    private int izquierdaFijo;
    private int x = 0, y = 0;

    // Método Constructor

    // Getter && Setter

    // Métodos generales
    public int izquierdaPunto() {
        limpiar();
        izquierdaFijo += 1;
        int izquierda = izquierdaFijo;
        return izquierdaFijo;
    }
    public int derechaPunto() {
        limpiar();
        derechaFijo += 1;
        return derechaFijo;
    }
    public int arribaPunto() {
        limpiar();
        arribaFijo += 1;
        return arribaFijo;
    }
    public int abajoPunto() {
        limpiar();
        abajoFijo += 1;
        return abajoFijo;
    }
    public int arriba(){
        y++;
        return y;
    }
    public int abajo(){
        y--;
        return y;
    }
    public int derecha (){
        x++;
        return x;
    }
    public int izquierda (){
        x--;
        return x;
    }

    public void limpiar() {
        arribaFijo = 0;
        abajoFijo = 0;
        derechaFijo = 0;
        izquierdaFijo = 0;
    }
    // Métodos de posición tridimensional

    public void pos (){
        System.out.println("Ubicacion tiempo real (x,y) = ("+x+":"+y+")");
    }

    @Override
    public String toString() {
        return "Tablero{" +
                "arriba=" + arribaFijo +
                ", abajo=" + abajoFijo +
                ", derecha=" + derechaFijo +
                ", izquierda=" + izquierdaFijo +
                '}';
    }
}
