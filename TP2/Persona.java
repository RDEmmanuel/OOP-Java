import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Clase Persona, primer ejercicio del TP2.
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
    
    /**
     * Seters y Geters de la clase Persona
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
    

    /**
     * Metodo para Calcular edad
     * @return     diferencia entre año actual y el anio nacimiento
     */
    public int edad()
    {
        Calendar fechaHoy = new GregorianCalendar();
        int anioHoy = fechaHoy.get(Calendar.YEAR);
        int edad = anioHoy - anioNacimiento;
        return edad;
    }
    
    /**
     * Metodo que retorna apellido y nombre
     */
    public String apeYNom()
    {
        return "Apellido y Nombre: " +this.getApellido() + " " +this.getNombre();
    }
    
    /**
     * Metodo que retorna nombre y apellido
     */
    public String nomYApe()
    {
        return "Nombre y Apellido: " +this.getNombre() + " " +this.getApellido();
    }
    
    /**
     * Metodo para mostrar la salida impresa por pantalla
     */
    public void mostrar()
    {
        System.out.println(nomYApe());       
        System.out.print("DNI: "+ getDNI() + "  Edad: ");
        System.out.print(edad());
        System.out.print("  años\n\n");
    }
    
}
