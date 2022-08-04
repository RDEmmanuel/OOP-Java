
/**
 * Ejercicio nro 6 del TP2.
 * 
 * @author (Ruiz Diaz Emmanuel) 
 * @version (1.0)
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
        x = 0;
        y = 0;
    }

    /**
     * Segundo constructor de la clase Punto
     */
    public Punto(double p_x, double p_y)
    {
       this.setX(p_x);
       this.setY(p_y);
    }
    
    private void setX(double p_x)
    {
        this.x = p_x;
    }
    public double getX()
    {
        return x;
    }
    
    private void setY(double p_y)
    {
        this.y = p_y;
    }
    public double getY()
    {
        return y;
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
     */
    public void mostrar()
   {
       System.out.println("Punto X:"+getX() +"  Y:"+getY());
   }
   
   /**
    * Metodo que retorna las coordenadas de los puntos x, y
    */
   public String coordenadas()
   {
       return "\n(" +getX()+","+ getY()+ ")\n";
   }
}
