package IntroduccionPRGPildorasInformaticas.ProgramacionMedia.Medio.I_IntroduccionEventos.Eventos_XIII;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class AccionColor extends AbstractAction {

//#############################################################################
//# Introducción a los eventos XIII - Píldoras Informáticas - Video 77        #
//#############################################################################

    public AccionColor(String nombre, Icon icono, Color colorBoton) {
        putValue(Action.NAME, nombre);
        putValue(Action.SMALL_ICON, icono);
        putValue(Action.SHORT_DESCRIPTION, "Poner la lámina de color " + nombre);
        putValue("ColorDeFondo", colorBoton);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

    }
}
