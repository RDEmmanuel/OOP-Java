
/**
 * Ejercicio nro 2 del TP3.
 * 
 * @author (Ruiz Diaz Emmanuel) 
 * @version (2020)
 */
public class Punto
{
    public double x;
    public double y;

    /**
     * Constructor de la clase Punto
     */
    public Punto()
    {
        this.setX(0);
        this.setY(0);
    }

    /**
     * Segundo constructor de la clase Punto
     */
    public Punto(double p_x, double p_y)
    {
       this.setX(p_x);
       this.setY(p_y);
    }
    
    /**
     * Setters y Getters de la clase Punto
     */
    private void setX(double p_x)
    {
        this.x = p_x;
    }
    public double getX()
    {
        return this.x;
    }
    
    private void setY(double p_y)
    {
        this.y = p_y;
    }
    public double getY()
    {
        return this.y;
    }
    
    /**
     * Metodo que cambia la posicion del punto x, y
     */
    public void desplazar(double p_dx, double p_dy)
    {
        this.setX(getX() + p_dx);
        this.setY(getY() + p_dy);
    }
    
    /**
     * Metodo para mostrar la salida impresa en pantalla
     * Muestra el punto X y el punto Y
     */
    public void mostrar()
   {
       System.out.println("Punto X:"+this.getX() +"  Y:"+this.getY());
   }
   
   /**
    * Metodo que retorna las coordenadas de los puntos x, y
    */
   public String coordenadas()
   {
       return "(" +this.getX()+","+ this.getY()+ ")";
   }
   
   /**
    * Metodo para calcular la distancia entre dos puntos.
    */
   public double distanciaA(Punto p_ptoDistante)
   {
       return Math.sqrt(Math.pow((p_ptoDistante.getX() - this.getX()), 2) + Math.pow((p_ptoDistante.getY() - this.getY()), 2));
   }
}
