package IntroduccionPRGATS.ProgramacionMedia.ZAvanzadoPOO.MainClases4;

public class MainVehiculo {

//#############################################################################
//# Introducción a POO (Avanzado) - Video 78 - Continuación                   #
//#############################################################################

    public static void main(String[] args) {
        // Creamos objeto / dos maneras
        // Manera fácil
        Vehiculo coche1 = new Vehiculo("AAA1111", "Lamborguini", "720s");
        Vehiculo coche2 = new VehiculoTurismo("BBB2222", "Opel", "corsa", 5);
        Vehiculo coche3 = new VehiculoDeportivo("CCC333", "Ferrari", "A1", 400);
        Vehiculo coche4 = new VehiculoFurgoneta("DDD4444", "Scania", "Tocho", 900);

        // Con arreglos
        Vehiculo[] misVehiculos = new Vehiculo[4];
        misVehiculos[0] = new Vehiculo("AAA1111", "Lamborguini", "720s");
        misVehiculos[1] = new VehiculoTurismo("BBB2222", "Opel", "corsa", 5);
        misVehiculos[2] = new VehiculoDeportivo("CCC333", "Ferrari", "A1", 400);
        misVehiculos[3] = new VehiculoFurgoneta("DDD4444", "Scania", "Tocho", 900);

        // Imprimimos los datos
            // Manera fácil
        System.out.println("-- Con print --");
        System.out.println(coche1.toString());
        System.out.println(coche2.toString());
        System.out.println(coche3.toString());
        System.out.println(coche4.toString());

            // Con arreglos
        System.out.println("\n-- Con arreglos --");
        for (Vehiculo vehiculos :
                misVehiculos) {
            System.out.println(vehiculos.toString() + "\n");
        }
    }
}
