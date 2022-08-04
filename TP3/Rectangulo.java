
/**
 * Clase Rectangulo, ejercicio 4 del TP3.
 * 
 * @author (Ruiz Diaz Emmanuel) 
 * @version (2020)
 */
public class Rectangulo
{
    private Punto origen;
    private double ancho;
    private double alto;
    
    public Rectangulo(Punto p_origen,double p_ancho,double p_alto)
    {
        this.setOrigen(p_origen);
        this.setAncho(p_ancho);
        this.setAlto(p_alto);
    }
    public Rectangulo(double p_ancho,double p_alto)
    {
        this.setAncho(p_alto);
        this.setAlto(p_ancho);
        this.setOrigen(new Punto());
    }
    
    /**
     * Setters y Getteres de la clase Rectangulo
     */
    private void setOrigen(Punto p_origen)
    {
        this.origen = p_origen;
    }
    private void setAncho(double p_ancho)
    {
        this.ancho = p_ancho;
    }
    private void setAlto(double p_alto)
    {
        this.alto = p_alto;
    }
    public Punto getOrigen()
    {
        return this.origen;
    }
    public double getAncho()
    {
        return this.ancho;
    }
    public double getAlto()
    {
        return this.alto;
    }
    
    /**
     * Metodo para dezplazar el origen del rectangulo
     */
    public void desplazar(double p_dx,double p_dy)
    {
        this.getOrigen().desplazar(p_dx,p_dy);
    }
    
    /**
     * Metodo para calcular el perimetro del rectangulo
     * @return (*2(ancho + alto))
     */
    public double perimetro()
    {
        return (2*(this.getAncho() + this.getAlto()));
    }
    
    /**
     * Metodo para calcular la superficie del rectangulo
     *@return (ancho * alto)
     */
    public double superficie()
    {
        return (this.getAncho() * this.getAlto());
    }
    
    /**
     * Metodo para calcular la distancia de un rectangulo a otro
     * Retorna la distancia entre el origen de cada rectangulo
     */
    public double distanciaA(Rectangulo otroRectangulo)
    {
        return this.getOrigen().distanciaA(otroRectangulo.getOrigen());
    }
    
    /**
     * Metodo para averiguar cual de los dos rectangulos es el mayor, con respecto a la superficie
     */
    public Rectangulo elMayor(Rectangulo otroRectangulo)
    {
        if(this.superficie() > otroRectangulo.superficie())
        {
            return this;
        }else
        {
            return otroRectangulo;
        }
    }
    
    /**
     * Metodo para mostrar por pantalla las caracteristicas del rectangulo
     * Muestra las coordenadas, alto y ancho, la superficie y el perimetro.
     */
    public void caracteristicas()
    {
        System.out.println("******Rectangulo******");
        System.out.print("Origen: "+this.getOrigen().coordenadas());
        System.out.println("  -Alto: "+this.getAlto() +" -Ancho: "+getAncho());
        System.out.print("Superficie: "+superficie());
        System.out.println("  -  Perimetro: "+perimetro());
    }
}
