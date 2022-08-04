import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Clase Persona, ejercicio 5 del TP3.
 * 
 * @author (Ruiz Diaz Emmanuel) 
 * @version (2020)
 */
public class Persona
{
    private int nroDni;
    private String nombre;
    private String apellido;
    private int anioNacimiento;
    private Calendar fechaNacimiento;

    /**
     * Constructor de la clase Persona
     */
    public Persona(int p_dni, String p_nombre, String p_apellido, int p_anio)
    {
        this.setDNI(p_dni);
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setAnioNacimiento(p_anio);        
    }
    
    public Persona(int p_dni, String p_nombre, String p_apellido, Calendar p_fecha)
    {
        this.setDNI(p_dni);
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setFechaNacimiento(p_fecha);        
    }
    
    /**
     * Setters y Getters de la clase Persona
     */
    private void setDNI(int p_dni)
    {
        this.nroDni = p_dni;
    }
    public int getDNI()
    {
        return this.nroDni;
    }
    
    private void setNombre(String p_nombre)
    {
        this.nombre = p_nombre;
    }
    public String getNombre()
    {
        return this.nombre;
    }
    
    private void setApellido(String p_apellido)
    {
        this.apellido = p_apellido;
    }
    public String getApellido()
    {
        return this.apellido;
    }
    
    private void setAnioNacimiento(int p_anio)
    {
        this.anioNacimiento = p_anio;
    }
    public int getAnioNacimiento()
    {
        return this.anioNacimiento;
    }
    
    private void setFechaNacimiento(Calendar p_fecha)
    {
        this.fechaNacimiento = p_fecha;
    }
    public Calendar getFechaNacimiento()
    {
        return this.fechaNacimiento;
    }
    

    /**
     * Metodo para Calcular edad
     * @return     diferencia entre año actual y el anio nacimiento
     */
    public int edad()
    {
        Calendar fechaHoy = new GregorianCalendar();
        int anioHoy = fechaHoy.get(Calendar.YEAR);
        int edad = anioHoy - getFechaNacimiento().get(Calendar.YEAR);
        return edad;
    }
    
    /**
     * Metodo que compara el dia y mes de nacimiento con el dia y mes actual
     * @retorna true o false 
     */
    public boolean esCumpleanios()
    {   
       Calendar fechaHoy = new GregorianCalendar();
       int mesHoy = fechaHoy.get(Calendar.MONTH) + 1 ;
       int diaHoy = fechaHoy.get(Calendar.DATE);
       
       int dia = this.getFechaNacimiento().get(Calendar.DATE);
       int mes = this.getFechaNacimiento().get(Calendar.MONTH) + 1 ;
              
       if((dia == diaHoy) && (mes == mesHoy))
       {
           return true;           
       }else
           return false;              
    }
            
    /**
     * Metodo que retorna un string con apellido y nombre concatenados
     */
    public String apeYNom()
    {
        return this.getApellido() + " " +this.getNombre();
    }
    
    /**
     * Metodo que retorna un string con nombre y apellido concatenados
     */
    public String nomYApe()
    {
        return  this.getNombre() + " " +this.getApellido();
    }
    
    /**
     * Metodo para mostrar la salida impresa por pantalla
     * Muestra nombre y apellido, dni y la edad.
     */
    public void mostrar()
    {
        System.out.println("Nombre y Apellido: "+this.nomYApe());       
        System.out.print("DNI: "+this.getDNI() + "  Edad: ");
        System.out.print(this.edad());
        System.out.print("  años\n\n");
    }
    
}
