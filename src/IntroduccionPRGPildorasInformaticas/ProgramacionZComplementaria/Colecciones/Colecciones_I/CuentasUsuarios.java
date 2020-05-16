package IntroduccionPRGPildorasInformaticas.ProgramacionZComplementaria.Colecciones.Colecciones_I;

import java.util.HashSet;
import java.util.Set;

public class CuentasUsuarios {

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Antonio Banderas", "00001", 200000);
        Cliente cliente2 = new Cliente("Rafael Nadal", "00002", 250000);
        Cliente cliente3 = new Cliente("Penélope Cruz", "00003", 300000);
        Cliente cliente4 = new Cliente("Julio Iglesias", "00004", 500000);
        Cliente cliente5 = new Cliente("Julio Iglesias", "00004", 500000);

        Set<Cliente> clientesBanco = new HashSet<>();

        clientesBanco.add(cliente1);
        clientesBanco.add(cliente2);
        clientesBanco.add(cliente3);
        clientesBanco.add(cliente4);
        clientesBanco.add(cliente5);

        for (Cliente clientes :
                clientesBanco) {
            System.out.println(clientes.toString());
        }
    }
}