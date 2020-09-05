package IntroduccionPRGPildorasInformaticas.ProgramacionMedia.Medio.III_IntroduccionSwing.VIIII_PracticaMenu_IV;

import javax.swing.*;

public class LaminaProcesador extends JPanel {

//#############################################################################
//# Introducción a JMenu I - Píldoras Informáticas - Video 107                #
//#############################################################################

    private JMenu subMenu, subMenu2;
    private JMenuBar manuPrincipal;

    public LaminaProcesador() {
        manuPrincipal = new JMenuBar();
        creacionMenus("Archivo", 3, new ImageIcon());
        creacionMenus("Guardar", 0, new ImageIcon());
        creacionMenus("GuardarComo", 0, new ImageIcon());
        creacionMenus("Edición", 3, new ImageIcon());
        creacionMenus("Cortar", 0, new ImageIcon("src/IntroduccionPRGPildorasInformaticas/ProgramacionMedia/Medio/III_IntroduccionSwing/VIIII_PracticaMenu_IV/cortar.gif"));
        creacionMenus("Copiar", 1, new ImageIcon("src/IntroduccionPRGPildorasInformaticas/ProgramacionMedia/Medio/III_IntroduccionSwing/VIIII_PracticaMenu_IV/copiar.gif"));
        creacionMenus("Pegar", 0, new ImageIcon("src/IntroduccionPRGPildorasInformaticas/ProgramacionMedia/Medio/III_IntroduccionSwing/VIIII_PracticaMenu_IV/pegar.gif"));
        creacionMenus("Opciones", 4, new ImageIcon());
        creacionMenus("Opcion 1", 5, new ImageIcon());
        creacionMenus("Opcion 2", 5, new ImageIcon());
        creacionMenus("Herramientas", 3, new ImageIcon());
        creacionMenus("Generales", 0, new ImageIcon());

        add(manuPrincipal);
    }

    public void creacionMenus(String nombre, int tipo, ImageIcon imagen) {
        if (tipo == 0) {
            JMenuItem mainMenu = new JMenuItem(nombre, imagen);
            // mainMenu.setHorizontalTextPosition(SwingConstants.LEFT);
            subMenu.add(mainMenu);
        } else if (tipo == 1) {
            JMenuItem mainMenuSeparator = new JMenuItem(nombre, imagen);
            subMenu.add(mainMenuSeparator);
            subMenu.addSeparator();
        } else if (tipo == 3) {
            subMenu = new JMenu(nombre);
            manuPrincipal.add(subMenu);
        } else if (tipo == 4) {
            subMenu2 = new JMenu(nombre);
            subMenu.add(subMenu2);
        } else if (tipo == 5) {
            JMenuItem subMenu = new JMenuItem(nombre, imagen);
            subMenu2.add(subMenu);
        }
    }
}