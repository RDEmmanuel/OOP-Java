
/**
 * Clase Mujer, ejercicio 10 del TP3.
 * 
 * @author (Ruiz Diaz Emmanuel) 
 * @version (2020)
 */
public class Mujer
{
    private String nombre;
    private String apellido;
    private int edad;
    private String estadoCivil;
    private Hombre esposo;
    
    /**
     * Constructores de la clase Mujer
     */
    public Mujer(String p_nombre, String p_apellido, int p_edad)
    {
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setEdad(p_edad);
        this.setEstadoCivil("Soltera");
        
    }
    
    public Mujer(String p_nombre, String p_apellido, int p_edad, Hombre p_esposo)
    {
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setEdad(p_edad);
        this.setEstadoCivil("Soltera");
        this.setEsposo(p_esposo);
    }
    
    /**
     * Setters y Getters de la clase Mujer
     */
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
    
    private void setEdad(int p_edad)
    {
        this.edad = p_edad;
    }
    public int getEdad()
    {
        return this.edad;
    }
    
    private void setEstadoCivil(String p_estadoCivil)
    {
        this.estadoCivil = p_estadoCivil;
    }
    public String getEstadoCivil()
    {
        return this.estadoCivil;
    }
    
    private void setEsposo(Hombre p_esposo)
    {
        this.esposo = p_esposo;
    }
    public Hombre getEsposo()
    {
        return this.esposo;
    }
    
    /**
     * Metodo que asigna el esposo indicado, y cambia el estado civil a Casada
     */
    public void casarseCon(Hombre p_hombre)
    {   
        if(this.getEstadoCivil() != "Casada")
        {
            this.setEsposo(p_hombre);
            this.setEstadoCivil("Casada"); 
            this.getEsposo().casarseCon(this);
        }
    }
    
    /**
     * Metodo que cambia el estado civil de la persona a Divorciada, y se asigna null en el atributo esposo
     */
    public void divorcio()
    {
        if(this.getEstadoCivil() != "Soltera")
        {
            this.setEstadoCivil("Divorciada");
            this.setEsposo(null);
            this.getEsposo().divorcio();                    
        }
    }
    
    /**
     * Metodo que retorna una cadena formada por la concatenacion del nombre, apellido y la edad
     */
    public String datos()
    {
        return this.getNombre()+" "+this.getApellido()+" de "+this.getEdad()+" años";
    }
    
    /**
    * Metodo que muestra los datos y el estado civil de la persona
    */
    public void mostrarEstadoCivil()
    {
        System.out.println(this.datos()+" - "+this.getEstadoCivil());
    }
    
    /**
     * Metodo que muestra los datos de la persona y de su esposo(si lo tiene)
     */
    public void casadaCon()
    {
        if(getEstadoCivil() == "Casada")
        {
            System.out.println(this.datos()+" está casada con "+this.getEsposo().datos());
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
