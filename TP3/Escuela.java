
/**
 * Clase Escuela, Ejercicio 6 del TP3.
 * 
 * @author (Ruiz Diaz Emmanuel) 
 * @version (2020)
 */
public class Escuela
{
        private String nombre;
        private String domicilio;
        private String director;
    
        /**
         * Constructor de la clase Escuela
         */
        public Escuela(String p_nombre, String p_domicilio, String p_director)
        {
             this.setNombre(p_nombre);
             this.setDomicilio(p_domicilio);
             this.setDirector(p_director);
        }
        
        /**
         * Setters y Getters de la clase Escuela
         */
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
        
        private void setDirector(String p_director)
        {
            this.director = p_director;
        }
        public String getDirector()
        {
            return this.director;
        }
        
        /**
         * Metodo que imprime por pantalla el recibo 
         * muestra nombre domicilio y director de la escuela.
         * nombre, sueldo basico asignacion familiar del docente.
         */
        public void imprimirRecibo(Docente p_docente)
        {
            System.out.println("Escuela: "+this.getNombre()+"     Domicilio: "+this.getDomicilio()+"      Director: "+this.getDirector());
            System.out.println("-------------------------------------------------------------------------------------------");
            System.out.println("Docente: "+p_docente.getNombre());
            System.out.println("Sueldo:............................$"+p_docente.calcularSueldo());
            System.out.println("Sueldo Basico:.....................$"+p_docente.getSueldoBasico());
            System.out.println("Asignacion Familiar:...............$"+p_docente.getAsignacionFamiliar());
        }
}














