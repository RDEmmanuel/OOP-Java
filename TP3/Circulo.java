
/**
 * Ejercicio 3 del TP3.
 * 
 * @author (Ruiz Diaz Emmanuel) 
 * @version (2020)
 */
public class Circulo
{
    private double radio;
    private Punto centro;
    
    /**
     * Constructores de la clase Circulo
     */
    public Circulo()
    {
        this.setRadio(0);
        this.setCentro(new Punto());
    }
    
    public Circulo(double p_radio, Punto p_centro)
    {
        this.setRadio(p_radio);
        this.setCentro(p_centro);
    }
    
    /**
     * Setters y Getters de la clase circulo
     */
    private void setRadio(double p_radio)
    {
        this.radio = p_radio;
    }
    public double getRadio()
    {
        return this.radio;
    }
    
    private void setCentro(Punto p_centro)
    {
        this.centro = p_centro;
    }
    public Punto getCentro()
    {
        return this.centro;
    }
    
    /**
     * Metodo para desplazar el circulo
     */
    public void desplazar(double p_dx, double p_dy)
    {
        this.getCentro().desplazar(p_dx, p_dy);       
    }
    
    /**
     * Metodo para calcular el perimetro del circulo
     */
    public double perimetro()
    {
        return 2*3.14*this.getRadio();
    }
    
    /**
     * Metodo para calcular la superficie del circulo
     */
    public double superficie()
    {
        return Math.pow(3.14*this.getRadio(),2);
    }
    
    /**
     * Metodo para mostrar por pantalla las caracteristicas del circulo
     * Muestra las coordenadas, el radio, la superficie y el perimetro
     */
    public void caracteristicas()
    {
        System.out.println("******Circulo******");
        System.out.print("Centro: "+this.getCentro().coordenadas());
        System.out.println("  -Radio: "+this.getRadio());
        System.out.print("Superficie: "+superficie());
        System.out.println("  -  Perimetro: "+perimetro());
    }
    
    /**
     * Metodo para calcular la distancia entre dos circulos
     */
    public double distanciaA(Circulo otroCirculo)
    {
        return this.getCentro().distanciaA(otroCirculo.getCentro());
    }
        
    /**
     * Metodo para averiguar cual de los dos circulos es mayor con respecto a la superficie
     * @return el mayor de los circulos
     */
    public Circulo elMayor(Circulo otroCirculo)
    {
        if(this.superficie() > otroCirculo.superficie())
        {
            return this;
        }else
        {
            return otroCirculo;
        }
    }
    
    
}




















