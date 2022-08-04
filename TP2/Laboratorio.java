
/**
 * Ejercicio nro 2 del TP2.
 * 
 * @author (Ruiz Diaz Emmanuel) 
 * @version (2020)
 */
public class Laboratorio
{
   private String nombre;
    private String domicilio;
    private String telefono;
    private int compraMinima;
    private int diaEntrega;
    
    /**
     * Constructor de la clase Laboratorio
     */
    public Laboratorio(String p_nombre,String p_domicilio,String p_telefono,int p_compraMin,int p_DiaEnt)
    {
        this.setNombre(p_nombre);
        this.setDomicilio(p_domicilio);
        this.setTelefono(p_telefono);
        this.setCompraMinima(p_compraMin);
        this.setDiaEntrega(p_DiaEnt);
    }
    
    /**
     * Seters y Geters de la clase Laboratorio.
     */
    private void setNombre(String p_nombre)
    {
        this.nombre = p_nombre;
    }
    public String getNombre()
    {
        return nombre;
    }
    
    private void setDomicilio(String p_domicilio)
    {
        this.domicilio = p_domicilio;
    }
    public String getDomicilio()
    {
        return domicilio;
    }
    
    private void setCompraMinima(int p_compraMin)
    {
        this.compraMinima = p_compraMin;
    }
    public int getCompraMinima()
    {
        return compraMinima;
    }
    
     private void setTelefono(String p_telefono)
    {
        this.telefono = p_telefono;
    }
    public String getTelefono()
    {
        return telefono;
    }
    
    private void setDiaEntrega(int p_DiaEnt)
    {
        this.diaEntrega = p_DiaEnt;
    }
    public int getDiaEntrega()
    {
        return diaEntrega;
    }
    
    /**
     * Segundo Constructor de la clase Laboratorio
     */
    public Laboratorio(String p_domicilio,String p_telefono,String p_nombre)
    {
        this.setNombre(p_nombre);
        this.setDomicilio(p_domicilio);
        this.setTelefono(p_telefono);
    }
        
    public void ajusteCompraMinima(int p_compraMin)
    {
        this.setCompraMinima(this.getCompraMinima() + p_compraMin);
    }
    
    public void ajusteDiaEntrega(int p_diaEnt)
    {
        this.setDiaEntrega(this.getDiaEntrega() + p_diaEnt);
    }
    
    public String mostrar()
    {
        return "Laboratorio: " +getNombre() +"\nDomicilio: " +getDomicilio() +" - " + "Teléfono: " +getTelefono() ;
    }
    
    public void mostrarCompra()
    {
        System.out.println(getCompraMinima());
    }
}
