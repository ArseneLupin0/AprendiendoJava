package IntroduccionPRGPildorasInformaticas.ProgramacionMedia.Basico.I_InterfacesYClasesInternas_IV;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class DameLaHora implements ActionListener {

//#############################################################################
//# Interfaces Y Clases Externas IV - Píldoras Informáticas - Video 52        #
//#############################################################################

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        Date ahora = new Date();

        System.out.println("Te pongo la hora cada 5 segundos: " + ahora);
    }
}
