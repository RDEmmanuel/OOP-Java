import java.util.Calendar;
import java.util.GregorianCalendar;
/**
 * Ejercicio nro 11 del TP3.
 * 
 * @author (Ruiz Diaz Emmanuel) 
 * @version (2020)
 */
public class EmpleadoConJefe
{
    private long cuil;
    private String apellido;
    private String nombre;
    private double sueldoBasico;
    private int anioIngreso;
    private Calendar fechaIngreso;
    private EmpleadoConJefe jefe;
    
    /**
     * Constructor de la clase EmpleadoConJefe
     */
    public EmpleadoConJefe(long p_cuil, String p_nombre, String p_apellido, double p_importe, int p_anio)
    {
        this.setCuil(p_cuil);
        this.setApellido(p_apellido);
        this.setNombre(p_nombre);
        this.setSueldoBasico(p_importe);
        this.setAnio(p_anio);        
    }
    
    public EmpleadoConJefe(long p_cuil, String p_nombre, String p_apellido, double p_importe, Calendar p_fecha)
    {   
        this.setCuil(p_cuil);
        this.setApellido(p_apellido);
        this.setNombre(p_nombre);
        this.setSueldoBasico(p_importe);
        this.setFechaIngreso(p_fecha);
    }
    
    public EmpleadoConJefe(long p_cuil, String p_nombre, String p_apellido, double p_importe, Calendar p_fecha, EmpleadoConJefe p_jefe)
    {   
        this.setCuil(p_cuil);
        this.setApellido(p_apellido);
        this.setNombre(p_nombre);
        this.setSueldoBasico(p_importe);
        this.setFechaIngreso(p_fecha);
        this.setJefe(p_jefe);
    }
            
    /**
     * Seters y Geters de la clase EmpleadoConJefe
     */
    private void setCuil(long p_cuil)
    {
        this.cuil = p_cuil;
    }
    public long getCuil()
    {
        return this.cuil;
    }
    
    private void setApellido(String p_apellido)
    {
        this.apellido = p_apellido;
    }
    public String getApellido()
    {
        return this.apellido;
    }
    
    private void setNombre(String p_nombre)
    {
        this.nombre = p_nombre;
    }
    public String getNombre()
    {
        return this.nombre;
    }
    
    private void setSueldoBasico(double p_importe)
    {
        this.sueldoBasico = p_importe;
    }
    public double getSueldoBasico()
    {
        return this.sueldoBasico;
    }
    
    private void setAnio(int p_anio)
    {
        this.anioIngreso = p_anio;
    }
    public int getAnio()
    {
        return this.anioIngreso;
    }
    
    private void setFechaIngreso(Calendar p_fecha)
    {
        this.fechaIngreso = p_fecha;
    }
    public Calendar getFechaIngreso()
    {
        return this.fechaIngreso;
    }
    
    private void setJefe(EmpleadoConJefe p_jefe)
    {
        this.jefe = p_jefe;
    }
    public EmpleadoConJefe getJefe()
    {
        return this.jefe;
    }
    
    
    /**
     * Metodo que devuelve la cantidad de anios desde que ingreso a la empresa
     * Retorna la diferencia entre el año actual y el año de ingreso
     */
    public int antiguedad()
    {
        Calendar fechaHoy = new GregorianCalendar();
        int anioHoy = fechaHoy.get(Calendar.YEAR);
        int antiguedad = anioHoy - getFechaIngreso().get(Calendar.YEAR);
        return antiguedad;
    }
    
    /**
     * Metodo que corresponde al 2% del sueldo basico en concepto de la obra social + $12 de seguro de vida
     */
    public double descuento()
    {
        double descuento;
        descuento = (sueldoBasico * 2) / 100;
        descuento = descuento + 12;
        return descuento;
    }
    
    /**
     * Metodo que realiza una asignacion sobre el sueldo basico en base a la antiguedad
     * Si tiene 10 o mas años de antiguedad se asigna el 6%
     * Si tiene entre 2 y 10 años de antiguedad se asigna el 4%
     * Si tiene menos de 2 años de antiguedad se asigna el 2%
     */
    public double adicional()
    {
        double asignacion = 0.0;
        if(antiguedad() >= 10)
        {
            asignacion = asignacion + (sueldoBasico * 6) / 100; 
        }
        else if((antiguedad() <= 10) & (antiguedad() >=2))
        {
            asignacion = asignacion + (sueldoBasico * 4) / 100;
        }
        else
        {
            asignacion = asignacion + (sueldoBasico * 2) / 100;
        }
                    
        return asignacion;
    }
    
    /**
     * Metodo que calcula el sueldo neto, sumando el adicional y restando el descuento.
     */    
    public double sueldoNeto()
    {
        double neto = 0.0;
        neto = this.getSueldoBasico() + adicional() - descuento();
        return neto;
    }
    
    /**
     * Metodo que retorna apellido y nombre
     */
    public String apeYNom()
    {
        return this.getApellido() + ", " +this.getNombre();
    }
    
    /**
     * Metodo que retorna nombre y apellido
     */
    public String nomYApe()
    {
        return  this.getNombre() +" " +this.getApellido();
    }
    
    /**
     * Metodo para mostrar la salida impresa en pantalla
     * Muestra nombre y apellido, cuil, antiguedad, sueldo neto.
     * Si tiene jefe muestra el nombre y apellido del gerente
     * Si no tiene jefe es el Generente general.
     */
    public void mostrarPantalla()
    {
            System.out.println("Nombre y Apellido: " +nomYApe());
            System.out.print("CUIL: " +this.getCuil());
            System.out.print("  Antiguedad: ");
            System.out.print(this.antiguedad());
            System.out.println(" años de servicio");
            System.out.print("Sueldo Neto: $");
            System.out.print(sueldoNeto() + "\n");
            if(this.getJefe() != null)
            {
                System.out.println("Responde a: "+getJefe().apeYNom()+" / GERENTE GENERAL");
            }else
                {
                    System.out.println("GERENTE GENERAL");
                }
    }
    
    /**
     * Metodo que muestra cuil, apellido y nombre, y el sueldo neto
     */
    public String mostrarLinea()
    {
        return +this.getCuil() + "   " +this.getApellido() +"," +this.getNombre() + "............$" +this.sueldoNeto() ;
    }    
    
    /**
     * Metodo que compara el dia y mes actual con el dia y mes de ingreso 
     * Retorna true si cumple un año de aniversario
     * 
     */
    public boolean esAniversario()
    {
       Calendar fechaHoy = new GregorianCalendar();
       int mesHoy = fechaHoy.get(Calendar.MONTH) + 1 ;
       int diaHoy = fechaHoy.get(Calendar.DATE);
       
       int dia = this.getFechaIngreso().get(Calendar.DATE);
       int mes = this.getFechaIngreso().get(Calendar.MONTH) +1 ;
              
       if((dia == diaHoy) && (mes == mesHoy))
       {
           return true;           
       }else
           return false; 
    }
}
























