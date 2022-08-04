
/**
 * Ejercicio 1 del TP3.
 * 
 * @author (Ruiz Diaz Emmanuel) 
 * @version (2020)
 */
public class Producto
{
    private int codigo;
    private String rubro;
    private String descripcion;
    private double costo;
    private int stock;
    private double porcPtoRepo;
    private int existMinima;
    private Laboratorio laboratorio;
    
    /**
     * Constructores de la clase Producto
     */
    public Producto(int p_codigo, String p_rubro, String p_desc, double p_costo, double p_porcPtoRepo, int p_existMinima,Laboratorio p_lab)
    {
        this.setCodigo(p_codigo);
        this.setRubro(p_rubro);
        this.setDescripcion(p_desc);
        this.setCosto(p_costo);
        this.setPorcPtoRepo(p_porcPtoRepo);
        this.setExistMinima(p_existMinima);
        this.setLaboratorio(p_lab);
        this.setStock(0);
    }
    
    public Producto(int p_codigo, String p_rubro, String p_desc, double p_costo, Laboratorio p_lab)
    {
        this.setCodigo(p_codigo);
        this.setRubro(p_rubro);
        this.setDescripcion(p_desc);
        this.setCosto(p_costo);
        this.setLaboratorio(p_lab);
        this.setPorcPtoRepo(0.0);
        this.setExistMinima(0);
        this.setStock(0);
    }
    
    /**
     * Setters y Getters de la clase Producto
     */
    private void setCodigo(int p_codigo)
    {
        this.codigo = p_codigo;
    }
    public int getCodigo()
    {
        return this.codigo;
    } 
    
    private void setRubro(String p_rubro)
    {
        this.rubro = p_rubro;
    }
    public String getRubro()
    {
        return this.rubro;
    } 
    
    private void setDescripcion(String p_desc)
    {
        this.descripcion = p_desc;
    }
    public String getDescripcion()
    {
        return this.descripcion;
    } 
    
    private void setCosto(double p_costo)
    {
        this.costo = p_costo;
    }
    public double getCosto()
    {
        return this.costo;
    } 
    
    private void setPorcPtoRepo(double p_porcPtoRepo)
    {
        this.porcPtoRepo = p_porcPtoRepo;
    }
    public double getPorcPtoRepo()
    {
        return this.porcPtoRepo;
    } 
    
    private void setExistMinima(int p_existMinima)
    {
        this.existMinima = p_existMinima;
    }
    public int getExistMinima()
    {
        return this.existMinima;
    } 
    
    private void setLaboratorio(Laboratorio p_lab)
    {
        this.laboratorio = p_lab;
    }
    public Laboratorio getLaboratorio()
    {
        return this.laboratorio;
    }
    
    private void setStock(int p_stock)
    {
        this.stock = p_stock;
    }
    public int getStock()
    {
        return this.stock;
    }
    
    /**
     * Metodo para modificar el stock (agregando o quitando)
     */
    public void ajuste(int p_cantidad)
    {
        this.setStock(getStock() + p_cantidad);
    }
    
    /**
     * Metodo que devuelve el valor que resulta de agregar un 12% al precio de costo.
     */
    public double precioLista()
    {
        return this.getCosto() + (this.getCosto()*12)/100;
    }
    
    /**
     * Metodo que devuelve el precio por pago al contado del producto, con bonificacion del 5%
     */
    public double precioContado()
    {
        return this.precioLista() - (this.precioLista()*5)/100;
    }
    
    /**
     * Metodo que devuelve el resultado de multiplicar el stock por el precio de costo, mas una rentabilidad del 12%
     */
    public double stockValorizado()
    {
        return this.getStock() * this.getCosto() + (this.getCosto() * this.getStock() *12)/100; 
    }
    
    /**
     * Metodo con el porcentaje de punto de reposicion
     *
     */
    public void ajustarPtoRepo(double p_porce)
    {
        this.setPorcPtoRepo(p_porce);        
    }
    
    /**
     * Metodo con la existencia minima de cada producto
     */
    public void ajustarExistMinima(int p_cantidad)
    {
        this.setExistMinima(p_cantidad);        
    }  
    
    /**
     * Metodo para mostrar la salida impresa por pantalla de los datos del Laboratorio, rubro, descripcion, precio, stock y stock valorizado del producto
     */
    public void mostrar()
    {
        System.out.println(this.getLaboratorio().mostrar());
        System.out.println("\nRubro: "+this.getRubro());
        System.out.println("Descripcion: "+this.getDescripcion());
        System.out.println("Precio Costo: "+this.getCosto());
        System.out.print("Stock: "+this.getStock());
        System.out.println(" - Stock Valorizado: $"+this.stockValorizado());        
    }
    
    /**
     * Metodo que devuelve una cadena formada por la concatenacion de la descripcion, el precio de lista y el precio de contado del producto
     */
    public String mostrarLinea()
    {
        return this.getDescripcion()+"      " +this.precioLista()+"          " +this.precioContado(); 
    }

    
}
