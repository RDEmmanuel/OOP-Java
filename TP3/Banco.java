import java.util.Calendar;
import java.util.GregorianCalendar;
/**
 * Ejecutable del ejercicio 7 del TP3.
 * 
 * @author (Ruiz Diaz Emmanuel) 
 * @version (2020)
 */
public class Banco
{                           
        public static void main(String []args)
        {
            Calendar cumple = new GregorianCalendar(2020, Calendar.SEPTEMBER, 12);
            //cumple.set(2020, 9, 12);            
            Persona persona1 = new Persona(39235222, "Juan", "Perez", cumple);
                       
                if(persona1.esCumpleanios() == true)
                {
                    System.out.println("*************************************************");
                    System.out.println("*****La empresa le desea un feliz cumpleaños*****");
                    System.out.println("*************************************************");
                }        
            
            CajaDeAhorro caja1 = new CajaDeAhorro(1234, persona1, 12000.0);
            CuentaCorriente cuenta1 = new CuentaCorriente(55825, persona1, 4000);
            
            //se realizan acciones sobre la caja de ahorro
            caja1.mostrar();//se muestran los datos de la caja de ahorro           
            caja1.extraer(1000);
            caja1.extraer(1000);
            caja1.extraer(1000);
            caja1.extraer(1000);
            caja1.extraer(15000);//la extraccion supera el saldo
            caja1.extraer(1500);
            caja1.extraer(1000);
            caja1.extraer(1000);
            caja1.extraer(1000);
            caja1.extraer(1000);//se realizan 9 extracciones con exito            
            caja1.mostrar();
            caja1.extraer(1000);
            caja1.extraer(1000);
            caja1.mostrar();
            caja1.depositar(3200);//se realiza un deposito
            System.out.println("Se ha a realizado un deposito con exito!");
            caja1.mostrar();
            
            //se realizan acciones sobre la cuenta corriente
            cuenta1.mostrar();//se muestran los datos de la cuenta corriente
            cuenta1.depositar(200);//se hace un deposito 
            System.out.println("Se ha realizado un deposito con exito!");
            cuenta1.mostrar();
            cuenta1.extraer(600);//se realiza una extraccion con exito
            cuenta1.mostrar();
            cuenta1.extraer(4101);//se realiza una extraccion que sobrepasa el limite descubierto
            cuenta1.mostrar();                       
        }                
}
