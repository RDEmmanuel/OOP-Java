
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
     * Seters y Geters de la clase Alumno
     */
    private void setLu(int p_lu)
    {
        this.lu = p_lu;
    }
    public int getLu()
    {
        return lu;
    }
    
    private void setNombre(String p_nombre)
    {
        this.nombre = p_nombre;
    }
    public String getNombre()
    {
        return nombre;
    }
    
    private void setApellido(String p_apellido)
    {
        this.apellido = p_apellido;
    }
    public String getApellido()
    {
        return apellido;
    }
    
    public void setNota1(double p_nota)
    {
        this.nota1 = p_nota;
    }
    public double getNota1()
    {
        return nota1;
    }
    
    public void setNota2(double p_nota)
    {
        this.nota2 = p_nota;
    }
    public double getNota2()
    {
        return nota2;
    }
    
    /**
     * Metodo para calcular promedio de notas
     * @Retorna promedio de las dos notas.
     */
    public double promedio()
    {
        return ((getNota1() + getNota2()) / 2);
    }
    
    /**
     * Metodo retorna verdadero si las dos notas son mayores o iguales a 6, caso contrario retorna false
     */
    public boolean aprueba()
    {
        if((getNota1() >= 6) & (getNota2() >= 6))        
            return true;        
        else
            return false;
    }
    
    /**
     * Metodo retorna una leyenda "APROBADO" o "DESASPROBADO" segun el metodo aprueba()
     */
    public String leyendaAprueba()
    {
        if(aprueba() == true)        
            return "APROBADO";        
        else        
            return "DESAPROBADO";        
    }
    
    /**
     * Metodo Retorna Apellido y Nombre
     */
    public String apeYNom()
    {
        return "Apellido y Nombre: " +getApellido() + " " +getNombre();
    }
    
    /**
     * Metodo Retorna Nombre y Apellido
     */
    public String nomYApe()
    {
        return "Nombre y Apellido: " +getNombre() +" " +getApellido();
    }
    
    /**
     * Metodo para mostrar la salida en pantalla
     */
    public void mostrar()
    {        
        System.out.println(nomYApe());
        System.out.println("LU: " +getLu() + "    Notas: "+getNota1() +" - " +getNota2());
        System.out.print("Promedio: ");
        System.out.print(promedio());
        System.out.print(" - ");
        System.out.println(leyendaAprueba());
        System.out.println("");
    }
     
}
