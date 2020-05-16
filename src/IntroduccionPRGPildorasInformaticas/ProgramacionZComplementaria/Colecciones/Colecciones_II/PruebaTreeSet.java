package IntroduccionPRGPildorasInformaticas.ProgramacionZComplementaria.Colecciones.Colecciones_II;

import java.util.Comparator;
import java.util.TreeSet;

public class PruebaTreeSet {
    public static void main(String[] args) {
        /*TreeSet<String> ordenarPersonas = new TreeSet<>();

        ordenarPersonas.add("Sandra");
        ordenarPersonas.add("Damián");
        ordenarPersonas.add("Tania");
        ordenarPersonas.add("Alejandro");

        for (String imprimir :
                ordenarPersonas) {
            System.out.println(imprimir);
        }*/

        Articulo primero = new Articulo(1, "Primero artículo");
        Articulo segundo = new Articulo(200, "Segundo artículo");
        Articulo tercero = new Articulo(3, "Tercero artículo");

        TreeSet<Articulo> ordenarArticulos = new TreeSet<>();

        ordenarArticulos.add(segundo);
        ordenarArticulos.add(primero);
        ordenarArticulos.add(tercero);

        for (Articulo art :
                ordenarArticulos) {
            System.out.println(art.getArticulo());
        }

//        Articulo comArticulo = new Articulo();
//
//        TreeSet<Articulo> ordenarArticulos2 = new TreeSet<>(comArticulo);

//        ComparadorArticulos comparaArt = new ComparadorArticulos();

        TreeSet<Articulo> ordenarArticulos2 = new TreeSet<>((articulo, t1) -> {
            String desc1 = articulo.getArticulo();
            String desc2 = t1.getArticulo();

            return desc1.compareToIgnoreCase(desc2);
        });
//        TreeSet<Articulo> ordenarArticulos2 = new TreeSet<>(Comparator.comparing(Articulo::getArticulo));

        ordenarArticulos2.add(primero);
        ordenarArticulos2.add(segundo);
        ordenarArticulos2.add(tercero);

        for (Articulo art :
                ordenarArticulos2) {
            System.out.println(art.getArticulo());
        }
    }
}

class Articulo implements Comparable<Articulo>, Comparator<Articulo> {

    private int num;
    private String articulo;

    public Articulo() {

    }

    public Articulo(int num, String articulo) {
        this.num = num;
        this.articulo = articulo;
    }

    public String getArticulo() {
        return articulo;
    }

    @Override
    public int compareTo(Articulo articulo) {
        return num - articulo.num;
    }

    @Override
    public int compare(Articulo articulo, Articulo t1) {
        String descripcionA = articulo.getArticulo();
        String descripcionB = t1.getArticulo();

        return descripcionA.compareToIgnoreCase(descripcionB);
    }
}