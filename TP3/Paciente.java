
/**
 * Clase Paciente,ejercicio 8 TP3.
 * 
 * @author (Ruiz Diaz Emmanuel) 
 * @version (2020)
 */
public class Paciente
{
    private int historiaClinica;
    private String nombre;
    private String domicilio;
    private Localidad localidadNacido;
    private Localidad localidadVive;
    
    /**
     * Constructores de la clase Paciente
     */
    public Paciente(int p_historia, String p_nombre, String p_domicilio, Localidad p_localidadNacido, Localidad p_localidadVive)
    {
        this.setHistoriaClinica(p_historia);
        this.setNombre(p_nombre);
        this.setDomicilio(p_domicilio);
        this.setNacido(p_localidadNacido);
        this.setVive(p_localidadVive);
    }
    
    /**
     * Setters y Getters de la clase Paciente
     */
    private void setHistoriaClinica(int p_historia)
    {
        this.historiaClinica = p_historia;
    }
    public int getHistoriaClinica()
    {
        return this.historiaClinica;
    }
    
    private void setNombre(String p_nombre)
    {
        this.nombre = p_nombre;
    }
    public String getNombre()
    {
        return this.nombre;
    }
    
    private void setDomicilio(String p_domicilio)
    {
        this.domicilio = p_domicilio;
    }
    public String getDomicilio()
    {
        return this.domicilio;
    }
    
    private void setNacido(Localidad p_localidadNacido)
    {
        this.localidadNacido = p_localidadNacido;
    }
    public Localidad getNacido()
    {
        return this.localidadNacido;
    }
    
    private void setVive(Localidad p_localidadVive)
    {
        this.localidadVive = p_localidadVive;
    }
    public Localidad getVive()
    {
        return this.localidadVive;
    }
    
    /**
     * Metodo para mostrar en pantalla la informacion requerida
     * nombre, historia clinica, domicilio, localidad y provincia del paciente
     */
    public void mostrarDatosPantalla()
    {
        System.out.println("Paciente: "+this.getNombre()+"  Historia Clinica: "+this.getHistoriaClinica()+"     Domicilio:"+this.getDomicilio());
        System.out.println("Localidad: "+this.getVive().getNombre()+"   Provincia: "+this.getVive().getProvincia());
    }
    
    /**
     * Metodo que devuelve una cadena formada por la concatenacion de nombre, historia clinica,
     *  domicilio, localidad y provincia donde vive el paciente
     */
    public String cadenaDeDatos()
    {
        return this.getNombre()+"....."+this.getHistoriaClinica()+"...."+this.getDomicilio()+"-"+this.getVive().getNombre()+"-"+this.getVive().getProvincia();
    }
}





















