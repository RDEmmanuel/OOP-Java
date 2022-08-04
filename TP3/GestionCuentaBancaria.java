import java.util.Calendar;
import java.util.GregorianCalendar;
/**
 * Ejecutable de la clase Cuenta Bancaria, ejercicio 5 del TP3.
 * 
 * @author (Ruiz Diaz Emmanuel) 
 * @version (2020)
 */
public class GestionCuentaBancaria
{
    public static void main(String[]args)
    {
        Calendar fecha = new GregorianCalendar(1986, Calendar.SEPTEMBER, 24);        
        Persona persona1 = new Persona(35123456, "Juan", "Perez", fecha);
        CuentaBancaria cuenta1 = new CuentaBancaria(1249, persona1, 1500.0); 
        
        System.out.println("Se ha creado una cuenta bancaria: \n");
        cuenta1.mostrar();                
        cuenta1.extraer(400);
        System.out.println("\nSe ha realizado una extraccion: \n");
        cuenta1.mostrar();
        
        System.out.println("\n------------------------------------------------------------------------------\n");
        
        Calendar fecha1 = new GregorianCalendar(1996, Calendar.OCTOBER, 17);
        Persona persona2 = new Persona(24456789, "Carlos", "Acosta", fecha1);
        CuentaBancaria cuenta2 = new CuentaBancaria(9876, persona2);
        
        System.out.println("Se ha creado otra cuenta bancaria: \n");
        cuenta2.mostrar();
        cuenta2.depositar(2600);
        System.out.println("\nSe ha realizado un deposito: \n");
        cuenta2.mostrar();
        
        System.out.println("\n------------------------------------------------------------------------------\n");
        
        System.out.println("******* Cuentas Bancarias *******\n");
        System.out.println(cuenta1.toStrinf());
        System.out.println(cuenta2.toStrinf());
    }
}
