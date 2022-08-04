import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Clase ejecutable Empresa, ejercicio 11 del TP3.
 * 
 * @author (Ruiz Diaz Emmanuel) 
 * @version (2020)
 */
public class Empresa
{
     public static void main(String [] args)
     {  
         Calendar fechaIngreso1 = new GregorianCalendar(2012, Calendar.SEPTEMBER , 12);
         Empleado empleado1 = new Empleado(145212368,"Carlos","Caseres", 20000.0, fechaIngreso1);
         
         empleado1.mostrar();
         if(empleado1.esAniversario() == true)
         {
             System.out.println("\nSe imprime un permiso de salida por cumplir un año mas de trabajo en la empresa\n");             
         }else
            {
                System.out.println("\nNo corresponde permiso de salida\n");
            }
                           
         Calendar fechaIngreso2 = new GregorianCalendar(2009, Calendar.APRIL , 24);
         Empleado empleado2 = new Empleado(295482124,"Julio","Monzon", 25000.0, fechaIngreso2); 
         
         empleado2.mostrar();   
         if(empleado2.esAniversario() == true)
         {
             System.out.println("\nSe imprime un permiso de salida por cumplir un año mas de trabajo en la empresa\n");
         }else
            {
                System.out.println("\n");
            }   
     }
    
}
