import java.util.Scanner;
/**
 * Ejecutable del ejercicio nro 3 del TP2.
 * 
 * @author (Ruiz Diaz Emmanuel) 
 * @version (2020)
 */
public class llamadaCliente
{
    public static void main(String [] args)
    {
        Scanner entrada = new Scanner(System.in);
        
        int nroDNI = Integer.parseInt(args[0]);
        String apellido = (args[1]);
        String nombre = (args[2]);
        double saldo = Double.parseDouble(args[3]);
        double importe;
        
        Cliente cliente1 = new Cliente(nroDNI, apellido, nombre, saldo);
        cliente1.mostrar();
        System.out.println("Agregar saldo: ");
        importe = entrada.nextDouble();
        cliente1.agregarSaldo(importe);
        cliente1.mostrar();
        /*
        cliente1.nuevoSaldo(999);
        cliente1.mostrar();*/
    }
}
