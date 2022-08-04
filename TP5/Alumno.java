
/**
 * Ejercicio nro 4 del TP2.
 * 
 * @author (Ruiz Diaz Emmanuel) 
 * @version (2020)
 */
public class Alumno
{
    private int lu;
    private String nombre;
    private String apellido;
    private double nota1;
    private double nota2;
    
    /**
     * Constructor de la clase Alumno
     */
    public Alumno(int p_lu, String p_nombre, String p_apellido)
    {
        this.setLu(p_lu);
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);        
    }
    
    /**
     * Setters y Getters de la clase Alumno
     */
    private void setLu(int p_lu)
    {
        this.lu = p_lu;
    }
    public int getLu()
    {
        return this.lu;
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
    
    public void setNota1(double p_nota)
    {
        this.nota1 = p_nota;
    }
    public double getNota1()
    {
        return this.nota1;
    }
    
    public void setNota2(double p_nota)
    {
        this.nota2 = p_nota;
    }
    public double getNota2()
    {
        return this.nota2;
    }
    
    /**
     * Metodo para calcular promedio de notas
     * @Retorna promedio de las dos notas.
     */
    public double promedio()
    {
        double prom;
        prom = (this.getNota1() + this.getNota2()) / 2;
        return prom;
    }
    
    /**
     * Metodo retorna verdadero si las dos notas son mayores o iguales a 6, caso contrario retorna false
     */
    public boolean aprueba()
    {
        if((this.getNota1() >= 6) & (this.getNota2() >= 6))        
            return true;        
        else
            return false;
    }
    
    /**
     * Metodo retorna una leyenda "APROBADO" o "DESASPROBADO" segun el metodo aprueba()
     */
    public String leyendaAprueba()
    {
        if(this.aprueba() == true)        
            return "Aprobado";        
        else        
            return "Desaprobado";        
    }
    
    /**
     * Metodo Retorna Apellido y Nombre
     */
    public String apeYNom()
    {
        return "Apellido y Nombre: " +this.getApellido() + " " +this.getNombre();
    }
    
    /**
     * Metodo Retorna Nombre y Apellido
     */
    public String nomYApe()
    {
        return  this.getNombre() +" " +this.getApellido();
    }
    
    /**
     * Metodo para mostrar la salida en pantalla
     */
    public void mostrar()
    {        
        System.out.println(this.nomYApe());
        System.out.println("LU: " +this.getLu() + "    Notas: "+this.getNota1() +", " +this.getNota2());
        System.out.print("Promedio: ");
        System.out.print(this.promedio());
        System.out.print(" - ");
        System.out.println(this.leyendaAprueba());
        System.out.println("");
    }
     
}
