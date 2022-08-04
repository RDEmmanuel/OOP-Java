import java.util.*;
/**
 * Clase Banco, ejercicio 3 del TP5.
 * 
 * @author (Ruiz Diaz Emmanuel) 
 * @version (2020)
 */
public class Banco
{    
    private String nombre;
    private int nroSucursal;
    private Localidad localidad;
    private ArrayList<Empleado> empleados;
    private ArrayList<CuentaBancaria> cuentasBancarias;
    
    /**
     * Constructores de la clase Banco
     */
    public Banco(String p_nombre, Localidad p_localidad, int p_nroSucursal, Empleado p_empleados)
    {      
        this.setNombre(p_nombre);
        this.setLocalidad(p_localidad);
        this.setNroSucursal(p_nroSucursal);
        this.setCuentasBancarias(new ArrayList());
        this.setEmpleados(new ArrayList());                               
    }
    /**
     * Constructores de la clase Banco (metodo sobrecargado)
     */
    public Banco(String p_nombre, Localidad p_localidad, int p_nroSucursal, ArrayList p_empleados)
    {        
        this.setNombre(p_nombre);
        this.setLocalidad(p_localidad);
        this.setNroSucursal(p_nroSucursal);
        this.setEmpleados(p_empleados);
    }
    
    /**
     * Constructores de la clase banco (metodo sobrecargado)
     */
    public Banco(String p_nombre, Localidad p_localidad, int p_nroSucursal, ArrayList p_empleados, ArrayList p_cuentas)
    {
        this.setNombre(p_nombre);
        this.setLocalidad(p_localidad);
        this.setNroSucursal(p_nroSucursal);
        this.setEmpleados(p_empleados);
        this.setCuentasBancarias(p_cuentas);
    }
    
    /**
    * Setters y Getters de la clase Banco
    */
    private void setNombre(String p_nombre)
    {
       this.nombre = p_nombre;
    }
    public String getNombre()
    {
      return this.nombre; 
    }
    
    private void setLocalidad(Localidad p_localidad)
    {
       this.localidad = p_localidad;
    }
    public Localidad getLocalidad()
    {
      return this.localidad;
    }
    
    public void setNroSucursal(int p_nroSucursal)
    {
       this.nroSucursal = p_nroSucursal;
    }
    public int getNroSucursal()
    {
       return this.nroSucursal;
    }
    
    private void setEmpleados(ArrayList<Empleado> p_empleados) 
    {
      this.empleados = p_empleados;
    }
    public ArrayList getEmpleados() 
    {
        return this.empleados;
    }
    
    private void setCuentasBancarias(ArrayList<CuentaBancaria> p_cuentas)
    {
        this.cuentasBancarias = p_cuentas;
    }
    public ArrayList getCuentasBancarias()
    {
        return this.cuentasBancarias;
    }
    
    /**
     * Metodo que agrega un objeto empleado a la coleccion 
     */                
    public boolean agregarEmpleado(Empleado p_empleado)
    {
     return this.getEmpleados().add(p_empleado);
    }
    
    /**
     * Metodo que elimina un objeto empleado de la coleccion
     */
    public boolean quitarEmpleado(Empleado p_empleado)
    {
     return this.getEmpleados().remove(p_empleado);
    }
    
    /**
     * Metodo que agrega un objeto cuenta bancaria a la coleccion
     */
    public boolean agregarCuentaBancaria(CuentaBancaria p_cuentas)
    {
     return this.getCuentasBancarias().add(p_cuentas);
    }
    
    /**
     * Metodo que elimina un objeto cuenta bancaria de la coleccion
     */
    public boolean quitarCuentaBancaria(CuentaBancaria p_cuentas)
    {
     return this.getCuentasBancarias().remove(p_cuentas);
    }
    
    /**
     * Metodo que muestra un Listado de empleados con el sueldo neto
     */
    public void listarSueldos()
    {
    for(int i=0; i<this.getEmpleados().size(); i++)
        {
          System.out.println(((Empleado)this.getEmpleados().get(i)).mostrarLinea());            
        }
    }
    
    /**
     * Metodo que devuelve el sueldo a pagar
     */
    public double sueldosAPagar()
    {
        double sueldoAPagar = 0;
        for(int i=0; i<this.getEmpleados().size(); i++)
        {
          sueldoAPagar = sueldoAPagar + ((Empleado)this.getEmpleados().get(i)).sueldoNeto();            
        }
        return sueldoAPagar;
    }
    
    /**
     * Metodo mostrar que imprime la salida solicitada 
     * muestra nombre del banco y sucursal
     * muestra la localidad
     * muestra la lista de empleados en la coleccion
     * y muestra el total de sueldos a pagar
     */
    public void mostrar()
    {
        System.out.println("--------------------------------------------------------------");
        System.out.println("Banco: " + this.getNombre() + "\t Sucursal:" + this.getNroSucursal());
        System.out.println(this.getLocalidad().mostrar()+"\n");
        
        for(int i=0; i<this.getEmpleados().size(); i++)
        {
          System.out.println(((Empleado)this.getEmpleados().get(i)).mostrarLinea());            
        }
        System.out.println("\nTotal a Pagar----------------------------" + this.sueldosAPagar());
        System.out.println("-------------------------------------------------------------");
    }
    
    /**
     * Metodo que muestra las cuentas bancarias con saldo cero.
     */
    public void mostrarSaldoCero()
    {
        System.out.println("Titulares con Cuenta en Saldo Cero");
        System.out.println("---------------------------------------------------------------------");
        
        for(int i=0; i<this.getCuentasBancarias().size(); i++)
        {
            if(((CuentaBancaria)this.getCuentasBancarias().get(i)).getSaldo() == 0)
            {
                System.out.println(((CuentaBancaria)this.getCuentasBancarias().get(i)).toStrinf());
            }
        }
        System.out.println("--------------------------------------------------------------------");
    }
    
    /**
     * Metodo que devuelve la cantidad de cuentas bancarias con saldo activo (saldo > 0)
     */
    private int cuentasSaldoActivo()
    {
        int cantidad = 0;        
        for(int i=0; i<this.getCuentasBancarias().size(); i++)
        {
            if(((CuentaBancaria)this.getCuentasBancarias().get(i)).getSaldo() > 0)            
            {
                cantidad = cantidad + 1;
            }
        }
        return cantidad;
    }
    
    /**
     * Metodo que imprime en pantalla el resumen de cuentas bancarias
     * muestra el nombre del banco y la sucursal 
     * muestra la localidad 
     * muestra cantidad total de cuentas, cantidad de cuentas activas y cantidad de cuentas saldo cero.
     */
    public void mostrarResumen()
    {    
        
        System.out.println("Banco: " + this.getNombre() + "  -  Sucursal:" + this.getNroSucursal());
        System.out.println(this.getLocalidad().mostrar());
        System.out.println("********************************************************************");
        System.out.println("RESUMEN DE CUENTAS BANCARIAS");
        System.out.println("********************************************************************");
        
        System.out.println("Número total de Cuentas Bancarias: "+this.getCuentasBancarias().size());
        System.out.println("Cuentas Activas: "+this.cuentasSaldoActivo());
        System.out.println("Cuentas Saldo Cero: "+(this.getCuentasBancarias().size() - this.cuentasSaldoActivo()));
        System.out.println("---------------------------------------------------------------------");
    }
}


























