import java.util.*;
import java.util.Scanner;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.lang.Number;
/**
 * Write a description of class GestionComercio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GestionComercio
{
    public static void main(String [] args)
    {
        Scanner entrada = new Scanner(System.in);
        entrada.useDelimiter("\n");
        
        System.out.println("Se ingresan datos para crear la coleccion. Instancia de la clase Comercio");
        System.out.println("Ingrese nombre del Comercio: ");
        String nombre = entrada.next();
        Comercio comercio1 = new Comercio(nombre);
        System.out.println("Se ha creado la coleccion con exito!");
        
        boolean salir = false;        
        int opcion;
                        
        while(!salir)
        {
            System.out.println("************************************************");
            System.out.println("*************** Menu de opciones ***************");
            System.out.println("1-Salir");
            System.out.println("2-Dar de alta un Empleado ");
            System.out.println("3-Dar de baja un Empleado: ");
            System.out.println("4-Buscar un Empleado");
            System.out.println("5-Mostrar nomina de Empleados");
            System.out.println("--------> Ingrese una opcion del menu <--------");                        
            System.out.println("************************************************");    
            opcion = entrada.nextInt();   
                 
                switch(opcion)
                { 
                    case 1:
                    {
                        salir = true;
                    }break;
                    
                    case 2:
                    {
                        char respuesta = 's';                      
                        while((respuesta == 's') || (respuesta == 'S'))
                        {
                            System.out.println("Ingrese CUIL");
                            long cuil = entrada.nextLong();
                            System.out.println("Ingrese Nombre");
                            String nombreEmpleado = entrada.next();
                            System.out.println("Ingrese Apellido");
                            String apellido = entrada.next();
                            System.out.println("Ingrese Sueldo");
                            double sueldo = entrada.nextDouble();
                            System.out.println("Ingrese Año de Nacimiento");
                            int añoNacimiento = entrada.nextInt();
                            System.out.println("Ingrese Mes de Nacimiento");
                            int mesNacimiento = entrada.nextInt();
                            System.out.println("Ingrese Dia de Nacimiento");
                            int diaNacimiento = entrada.nextInt();
                        
                            Calendar fecha1 = new GregorianCalendar(añoNacimiento,mesNacimiento,diaNacimiento);
                            Empleado empleado1 = new Empleado(cuil, nombreEmpleado, apellido,sueldo,fecha1);
                            comercio1.altaEmpleado(empleado1);
                            
                            System.out.println("Desea seguir ingresando empleados? S/N :");
                            respuesta = (entrada.next()).charAt(0);                                                        
                        }
                    }break;
                    
                    case 3:
                    {                        
                        System.out.println("Ingrese cuil del empleado a dar baja");
                        long cuil = entrada.nextLong(); 
                        if(comercio1.getEmpleados().containsKey(cuil))
                        {
                            comercio1.bajaEmpleado(cuil);
                            System.out.println("Se ha dado de baja al empleado!");
                        }else
                            {
                                    System.out.println("No existe en el empleado en la nomina");
                                }
                    }break;
            
                    case 4:
                    {                        
                        System.out.println("Ingrese cuil del empleado para buscar");
                        long cuil = entrada.nextLong();
                        if(comercio1.getEmpleados().containsKey(cuil))
                        {
                            System.out.println("Se ha encontrado al empleado solicitado:");
                            System.out.println(comercio1.buscarEmpleado(cuil).mostrarLinea());
                        }else
                            {
                                    System.out.println("No Se ha encontrado al empleado porque no existe en la nomina");
                                }
                        //System.out.println(comercio1.buscarEmpleado(cuil).mostrarLinea());
                    }break;
                    
                    case 5:
                    {
                        System.out.println("**** Nomina de empleados de "+nombre+" ****");
                        comercio1.nomina();
                        System.out.println();
                    }break;
            
                }
                                                                                                                                                                                        
    }
    System.out.println("\n*** Fin del Programa ***");
  }
}

