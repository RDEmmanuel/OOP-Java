import java.util.Calendar;
import java.util.GregorianCalendar;
/**
 * Write a description of class EmpresaEmpleadoConJefe here.
 * 
 * @author (Ruiz Diaz Emmanuel) 
 * @version (2020)
 */
public class EmpresaEmpleadoConJefe
{
    public static void main(String [] args)
    {
        Calendar fechaIngreso1 = new GregorianCalendar(2010, Calendar.SEPTEMBER , 12);
        Calendar fechaIngreso2 = new GregorianCalendar(2005, Calendar.APRIL , 21);
        Calendar fechaIngreso3 = new GregorianCalendar(1995, Calendar.OCTOBER, 19);
        
        EmpleadoConJefe jefe = new EmpleadoConJefe(1425,"Gregorio","Bulgheri", 55000.0, fechaIngreso3);
        EmpleadoConJefe empleado1 = new EmpleadoConJefe(145212368,"Carlos","Gomez", 20000.0, fechaIngreso2,jefe);
        EmpleadoConJefe empleado2 = new EmpleadoConJefe(425532585,"Juan","Perez", 25000.0, fechaIngreso1,jefe); 
        
        jefe.mostrarPantalla();
        System.out.println("--------------------------------------------------------------------------");
        empleado1.mostrarPantalla();
        
        if(empleado1.esAniversario() == true)
         {
             System.out.println("\n---->Se imprime un permiso de salida por cumplir un año mas de trabajo en la empresa\n");
             System.out.println("Firma del Jefe: __________________ ");
         }else
            {
                System.out.println("---------------------------------------------------------------------------------");
            }
                
        empleado2.mostrarPantalla();
        
        if(empleado2.esAniversario() == true)
         {
             System.out.println("\n---->Se imprime un permiso de salida por cumplir un año mas de trabajo en la empresa\n");
             System.out.println("Firma del Jefe: __________________ ");
         }else
            {
                System.out.println("---------------------------------------------------------------------------------");
            }
        
    }
}
