
/**
 * Clase Hombre, ejercicio 10 del TP3.
 * 
 * @author (Ruiz Diaz Emmanuel) 
 * @version (2020)
 */
public class Hombre
{
    private String nombre;
    private String apellido;
    private int edad;
    private String estadoCivil;
    private Mujer esposa;
    
    /**
     * Constructores de la clase Hombre
     */
    public Hombre(String p_nombre, String p_apellido, int p_edad)
    {
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setEdad(p_edad);
        this.setEstadoCivil("Soltero");
    }
    
    public Hombre(String p_nombre, String p_apellido, int p_edad, Mujer p_esposa)
    {
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setEdad(p_edad);
        this.setEstadoCivil("Soltero");
        this.setEsposa(p_esposa);
    }
    
    /**
     * Setters y Getters de la clase Hombre
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
    
    private void setEsposa(Mujer p_esposa)
    {
        this.esposa = p_esposa;
    }
    public Mujer getEsposa()
    {
        return this.esposa;
    }
    
    /**
     * Metodo que asigna la esposa indicada y cambia el estado civil a Casado
     */
    public void casarseCon(Mujer p_mujer)
    {             
        if(this.getEstadoCivil() != "Casado")
        {
          this.setEsposa(p_mujer);
          this.setEstadoCivil("Casado");     
          this.getEsposa().casarseCon(this);
        }
    }
    
    /**
     * Metodo que cambia el estado civil de la persona a Divorciado, y se asigna null en el atributo esposa
     */
    public void divorcio()
    {
        if(this.getEstadoCivil() != "Soltero")
        {
            this.setEstadoCivil("Divorciado");
            this.setEsposa(null);        
            this.getEsposa().divorcio();
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
     * Metodo que muestra los datos de la persona y de su esposa(si lo tiene)
     */
    public void casadoCon()
    {
        String estado = "Casado";
        if(getEstadoCivil() == estado)
        {
            System.out.println(this.datos()+" está casado con "+this.getEsposa().datos());
        }
    }
    
    
    
    
    
}
