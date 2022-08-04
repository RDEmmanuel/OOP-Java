import java.util.*;
import java.lang.Number;
/**
 * Clase Comercio, ejercicio 6 del TP5.
 * 
 * @author (Ruiz Diaz Emmanuel) 
 * @version (2020)
 */
public class Comercio
{        
    private String nombre;
    private HashMap<Long, Empleado> empleados;
    
    /**
     * Constructor de la clase Comercio
     */
    public Comercio(String p_nombre)
    {
        this.setNombre(p_nombre);
        this.setEmpleados(new HashMap<Long, Empleado>());
    }
    
    /**
     * Constructor de la clase Comercio (metodo sobrecargado)
     */
    public Comercio(String p_nombre, HashMap<Long, Empleado> p_empleados)
    {
        this.setNombre(p_nombre);
        this.setEmpleados(p_empleados);
    }
    
    /**
     * Setters y Getters de la clase Comercio
     */
    private void setNombre(String p_nombre)
    {
        this.nombre = p_nombre;
    }
    public String getNombre()
    {
        return this.nombre;
    }
        
    private void setEmpleados(HashMap<Long, Empleado> p_empleados)
    {
        this.empleados = p_empleados;
    }
    public HashMap<Long, Empleado> getEmpleados()
    {
        return this.empleados;
    }
    
    /**
     * Metodo que agrega un objeto empleado a la coleccion
     */
    public void altaEmpleado(Empleado p_empleado)
    {
        this.getEmpleados().put(new Long(p_empleado.getCuil()), p_empleado);
    }
    
    /**
     * Metodo que quita un objeto empleado de la coleccion
     */    
    public Empleado bajaEmpleado(Long p_cuil)
    {
        return (Empleado)this.getEmpleados().remove(new Long(p_cuil));
    }
    
    /** 
     * Metodo que devuelve la cantidad de empleados en la coleccion
     */
    public int cantidadDeEmpleados()
    {
        return this.getEmpleados().size();
    }
    
    /**
     * Verifica si el empleado es empleado del comercio- Busqueda por clave(cuil)
     * devuelve verdadero o falso
     */
    public boolean esEmpleado(Long p_cuil)
    {
        return this.getEmpleados().containsKey(new Long(p_cuil));
    }
    
    /**
     * Metodo para buscar un empleado en la coleccion del comercio.
     * Busqueda por cuil(clave)
     * devuelve el empleado
     */
    public Empleado buscarEmpleado(Long p_cuil)
    {
        return (Empleado)this.getEmpleados().get(new Long(p_cuil));
    }
    
    /**
     * Metodo que muestra el sueldo neto de un empleado sabiendo su nro de cuil (clave)
     */
    public void sueldoNeto(Long p_cuil)
    {        
        System.out.println("Sueldo Neto: "+this.buscarEmpleado(p_cuil).sueldoNeto());
    }
    
    /**
     * Metodo que recorre la coleccion y muestra la lista de empleados del Comercio.
     */
    public void nomina()
    {        
        for(Map.Entry<Long, Empleado> e : empleados.entrySet())
        {            
            System.out.println(e.getValue().mostrarLinea());                        
        }    
    }
    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
     
}
