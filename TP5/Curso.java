import java.util.*;
/**
 * Clase Curso, ejercicio nro 5 del TP5.
 * 
 * @author (Ruiz Díaz Emmanuel) 
 * @version (2020)
 */
public class Curso
{    
    private String nombre;    
    private HashMap<Integer, Alumno> alumnos;
    
    /**
     * Constructor de la clase Curso
     */
    public Curso(String p_nombre)
    {
        this.setNombre(p_nombre);
        this.setAlumnos(new HashMap<Integer, Alumno>());
    }
    
    /**
     * Constructor de la clase Curso(metodo sobrecargado)
     */
    public Curso(String p_nombre, HashMap p_alumnos)
    {
        this.setNombre(p_nombre);
        this.setAlumnos(p_alumnos);
    }
    
    /**
     * Setters y Getters de la clase Curso
     */
    private void setNombre(String p_nombre)
    {
        this.nombre = p_nombre;
    }
    public String getNombre()
    {
        return this.nombre;
    }
    
    private void setAlumnos(HashMap<Integer,Alumno> p_alumnos)
    {
        this.alumnos = p_alumnos;
    }
    public HashMap<Integer,Alumno> getAlumnos()
    {
        return this.alumnos;
    }
    
    /**
     * Metodo que agrega un objeto de la clase alumno a la coleccion de inscriptos al Curso.
     */
    public void inscribirAlumno(Alumno p_alumno)
    {
        this.getAlumnos().put(new Integer(p_alumno.getLu()), p_alumno);        
    }
    
    /**
     * Metodo que elimina un objeto de la clase alumno de la coleccion del Curso, segun el nro de LU. Retorna el objeto eliminado.
     */
    public Alumno quitarAlumno(int p_lu)
    {           
        return this.getAlumnos().remove(new Integer(p_lu));        
    }
    
    /**
     * Metodo que retorna la cantidad de alumnos en la coleccion
     */
    public int cantidadAlumnos()
    {
        return this.getAlumnos().size();
    }
    
    /**
     * Verifica si el alumno esta inscripto en el Curso - Busqueda por clave(lu)
     */
    public boolean estaInscripto(int p_lu)
    {
        return this.getAlumnos().containsKey(new Integer(p_lu));
    }
    
    /**
     * Metodo sobrecargado, verifica si el alumno esta inscripto, busca por Objeto alumno(valor), y no por nroLU(clave).
     */
    public boolean estaInscripto(Alumno p_alumno)
    {
        return this.getAlumnos().containsValue(p_alumno);
    }
    
    /**
     * Retorna al alumno correspondiente al nro de LU(clave) pasado por parámetro.
     */
    public Alumno buscarAlumno(int p_lu)
    {
        return this.getAlumnos().get(new Integer(p_lu));        
    }
    
    /**
     * Metodo que imprime el promedio correspondiente al nro de LU(clave) pasado por parámetro
     */
    public void imprimirPromedioDelAlumno(int p_lu)
    {                         
        System.out.println("Promedio: "+this.buscarAlumno(p_lu).promedio());
    }
    
    /**
     * Metodo que recorre la coleccion y muestra lista de inscriptos al Curso.
     */
    public void mostrarInscriptos()
    {        
        for(Map.Entry<Integer, Alumno> e : alumnos.entrySet())
        {            
            System.out.println(e.getKey() +"\t "+e.getValue().nomYApe());                        
        }        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}    
