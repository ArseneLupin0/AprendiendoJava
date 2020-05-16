package IntroduccionPRGATS.ProgramacionMedia.APruebas;

import javax.swing.*;

public class Tablero {

    private double ejey;
    private double ynegativo;
    private double ejex;
    private double xnegativo;
    public int con_ejey = 0, con_ynegativo = 0, con_ejex = 0, con_xnegativo = 0;
    public String direccion = "Ninguna";

    //Metodo constructor de la clases Tablero
    public Tablero(double ejey, double ynegativo, double ejex, double xnegativo) {
        this.ejey = ejey;
        this.ynegativo = ynegativo;
        this.ejex = ejex;
        this.xnegativo = xnegativo;
    }

    public void setEjex(double ejex) {
        con_ejex += 1;
        direccion = "Derecha";
        if (xnegativo < 0) {
            xnegativo++;
            ejex = 0;
        }
        this.ejex = ejex;
    }

    public void setEjey(double ejey) {
        con_ejey += 1;
        direccion = "Arriba";
        if (ynegativo < 0) {
            ynegativo++;
            ejey = 0;
        }
        this.ejey = ejey;
    }

    public void setYnegativo(double ynegativo) {
        con_ynegativo += 1;
        direccion = "Abajo";
        if (ejey > 0) {
            ejey--;
            ynegativo = 0;
        }
        this.ynegativo = ynegativo;
    }

    public void setXnegativo(double xnegativo) {
        con_xnegativo += 1;
        direccion = "Izquierda";
        if (ejex > 0) {
            ejex--;
            xnegativo = 0;
        }
        this.xnegativo = xnegativo;
    }

    public double getXnegativo() {
        return xnegativo;
    }

    public double getYnegativo() {
        return ynegativo;
    }


    public double getEjex() {
        return ejex;
    }

    public double getEjey() {
        return ejey;
    }

    public void vaciartablero(){

        setEjex(0);
        setEjey(0);
        setXnegativo(0);
        setYnegativo(0);
        con_ejex = 0;
        con_ejey = 0;
        con_xnegativo = 0;
        con_ynegativo = 0;
        direccion = "Ninguna";

    }


    public void mostrarmenu(){

        int opcion = Integer.parseInt(JOptionPane.showInputDialog("Seleccione la dirección a la cual desea Moverse: \n"
                +"Opcion 1 Arriba \n"
                +"Opcion 2 Abajo \n"
                +"Opcion 3 Derecha \n"
                +"Opcion 4 Izquierda \n"
                +"Opcion 5 reiniciar \n"
                +"Opcion 6 Salir \n \n"
                +"Contador de movimientos: \n"
                +" Arriba ("+con_ejey+") Abajo ("+con_ynegativo+")"
                +" Derecha ("+con_ejex+") izquierda ("+con_xnegativo+") \n \n"
                +"Coordenadas de tu ubicación: \n "
                +"Y+ ("+ejey+") Y- ("+ynegativo+") X+ ("+ejex+") X- ("+xnegativo+") \n \n"
                +"Dirección elegida: "+direccion));


        switch(opcion){

            case 1:
                setEjey(ejey += 1);

                break;

            case 2:
                setYnegativo(ynegativo -= 1);
                mostrarmenu();
                break;

            case 3:
                setEjex(ejex += 1);
                mostrarmenu();
                break;

            case 4:
                setXnegativo(xnegativo -= 1);
                mostrarmenu();
                break;

            case 5:
                vaciartablero();
                break;

            case 6:
                System.exit(0);
                break;

            case 7:
            case 8:
            case 9:
                JOptionPane.showMessageDialog(null, "Opcion no valida");
                break;

            default:
                mostrarmenu();
                break;
        }

    }

}

class Principal {

   public static void main(String[] args) {

       boolean varr = true;

       //Declaración del objeto tab1 de la clase tablero
       Tablero tab1 = new Tablero(0,0,0,0);

       do {
           tab1.mostrarmenu();
       } while (varr == true);
   }
}