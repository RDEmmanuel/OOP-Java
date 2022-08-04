
/**
 * Clase Localidad ejercicio 8 TP3.
 * 
 * @author (Ruiz Diaz Emmanuel) 
 * @version (2020)
 */
public class Localidad
{
    private String nombre;
    private String provincia;
    
    /**
     * Constructor de la clase Localidad
     */
    public Localidad(String p_nombre, String p_provincia)
    {
        this.setNombre(p_nombre);
        this.setProvincia(p_provincia);
    }
    
    /**
     * Setters y Getters de la clase Localidad
     */
    private void setNombre(String p_nombre)
    {
        this.nombre = p_nombre;
    }
    public String getNombre()
    {
        return this.nombre;
    }
    
    private void setProvincia(String p_provincia)
    {
        this.provincia = p_provincia;
    }
    public String getProvincia()
    {
        return this.provincia;
    }
    
    /**
     * Metodo que devuelve una cadena formada por la concatenacion de la localidad y provincia
     */
    public String mostrar()
    {
        return "Localidad: "+this.getNombre()+"      Provincia: "+this.getProvincia();
    }
}









