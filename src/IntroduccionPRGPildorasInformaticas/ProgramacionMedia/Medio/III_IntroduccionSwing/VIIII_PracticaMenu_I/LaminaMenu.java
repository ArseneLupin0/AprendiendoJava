package IntroduccionPRGPildorasInformaticas.ProgramacionMedia.Medio.III_IntroduccionSwing.VIIII_PracticaMenu_I;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class LaminaMenu extends JPanel {

//#############################################################################
//# Introducción a Procesador Textos - Píldoras Informáticas - Video 101      #
//#############################################################################

    private JMenu subMenu, subMenu2;
    private JMenuBar menuPrincipal;

    public LaminaMenu() {
        setLayout(new BorderLayout());

        menuPrincipal = new JMenuBar();
        JTextPane area = new JTextPane();
        JScrollPane scrollArea = new JScrollPane(area);

        creacionMenus("Fuente", 3, e -> {

        });
        creacionMenus("Arial", 0, e -> {

        });
        creacionMenus("Courier New", 0, e -> {

        });
        creacionMenus("Verdana", 0, e -> {

        });
        creacionMenus("Estilo", 3, e -> {

        });
        creacionMenus("Negrita", 0, e -> {

        });
        creacionMenus("Cursiva", 0, e -> {

        });
        creacionMenus("Tamaño", 3, e -> {

        });
        creacionMenus("12", 0, e -> {

        });
        creacionMenus("16", 0, e -> {

        });
        creacionMenus("18", 0, e -> {

        });
        creacionMenus("20", 0, e -> {

        });

        JPanel panelCentrado = new JPanel();
        panelCentrado.add(menuPrincipal);

        add(panelCentrado, BorderLayout.NORTH);
        menuPrincipal.setMargin(new Insets(5, 50, 5, 5));
        add(scrollArea, BorderLayout.CENTER);
    }

    public void creacionMenus(String nombre, int tipo, ActionListener e) {
        switch (tipo) {
            case 0: {
                JMenuItem mainMenu = new JMenuItem(nombre);
                subMenu.add(mainMenu);
                mainMenu.addActionListener(e);
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
                menuPrincipal.add(subMenu);
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