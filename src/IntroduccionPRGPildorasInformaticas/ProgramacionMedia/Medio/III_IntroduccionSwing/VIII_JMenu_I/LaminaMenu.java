package IntroduccionPRGPildorasInformaticas.ProgramacionMedia.Medio.III_IntroduccionSwing.VIII_JMenu_I;

import javax.swing.*;

public class LaminaMenu extends JPanel {

//#############################################################################
//# Introducción a JMenu I - Píldoras Informáticas - Video 100                #
//#############################################################################

    private JMenu subMenu, subMenu2;
    private JMenuBar manuPrincipal;

    public LaminaMenu() {
//        JMenuBar barra = new JMenuBar();
//
//        JMenu archivo = new JMenu("Archivo");
//        JMenu edicion = new JMenu("Edición");
//        JMenu herramientas = new JMenu("Herramientas");
//        JMenu opciones = new JMenu("Opciones");
//
//        JMenuItem guardar = new JMenuItem("Guardar");
//        JMenuItem guardarComo = new JMenuItem("Guardar Como");
//
//        JMenuItem cortar = new JMenuItem("Cortar");
//        JMenuItem copiar = new JMenuItem("Copiar");
//        JMenuItem pegar = new JMenuItem("Pegar");
//
//        JMenuItem generales = new JMenuItem("Generales");
//
//        JMenuItem opcion1 = new JMenuItem("Opción 1");
//        JMenuItem opcion2 = new JMenuItem("Opción 2");
//
//        archivo.add(guardar);
//        archivo.add(guardarComo);
//
//        edicion.add(cortar);
//        edicion.add(copiar);
//        edicion.add(pegar);
//
//        herramientas.add(generales);
//
//        barra.add(archivo);
//        barra.add(edicion);
//        barra.add(herramientas);
//
//        opciones.add(opcion1);
//        opciones.add(opcion2);
//
//        edicion.addSeparator(); // Añadimos separador
//
//        edicion.add(opciones);
//
//        add(barra);

        //Otra manera, con metodos
        manuPrincipal = new JMenuBar();
        creacionMenus("Archivo", 3);
        creacionMenus("Guardar", 0);
        creacionMenus("GuardarComo", 0);
        creacionMenus("Edición", 3);
        creacionMenus("Cortar", 0);
        creacionMenus("Pegar", 0);
        creacionMenus("Copiar", 1);
        creacionMenus("Opciones", 4);
        creacionMenus("Opcion 1", 5);
        creacionMenus("Opcion 2", 5);
        creacionMenus("Herramientas", 3);
        creacionMenus("Generales", 0);

        add(manuPrincipal);
    }

    public void creacionMenus(String nombre, int tipo) {
        switch (tipo) {
            case 0: {
                JMenuItem mainMenu = new JMenuItem(nombre);
                subMenu.add(mainMenu);
                break;
            }
            case 1: {
                JMenuItem mainMenuSeparator = new JMenuItem(nombre);
                subMenu.add(mainMenuSeparator);
                subMenu.addSeparator();
                break;
            }
            case 3:
                subMenu = new JMenu(nombre);
                manuPrincipal.add(subMenu);
                break;
            case 4:
                subMenu2 = new JMenu(nombre);
                subMenu.add(subMenu2);
                break;
            case 5:
                JMenuItem subMenu = new JMenuItem(nombre);
                subMenu2.add(subMenu);
                break;
        }
    }
}