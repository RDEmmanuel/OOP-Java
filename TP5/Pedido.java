import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.*;
/**
 * Clase Pedido, ejercicio 2 del TP5 .
 * 
 * @author (Ruiz Díaz Emmanuel) 
 * @version (2020)
 */
public class Pedido
{
    private Calendar fecha;
    private ArrayList<Producto> productos;
    private Cliente cliente;
    
    /**
     * Constructores de la clase Pedido
     */
    public Pedido(Calendar p_fecha, Cliente p_cliente, ArrayList p_productos)
    {
        this.setFecha(p_fecha);
        this.setCliente(p_cliente);
        this.setProductos(p_productos);
    }
    /**
     * Constructor sobrecargado de la clase Pedido
     */
    public Pedido(Calendar p_fecha, Cliente p_cliente,Producto p_producto)
    {
        this.setFecha(p_fecha);
        this.setCliente(p_cliente);
        this.setProductos(new ArrayList());
    }
    
    /**
     * Setters y Getters de la clase Pedido
     */
    private void setFecha(Calendar p_fecha)
    {
        this.fecha = p_fecha;
    }
    public Calendar getFecha()
    {
        return this.fecha;
    }
    
    private void setCliente(Cliente p_cliente)
    {
        this.cliente = p_cliente;
    }
    public Cliente getCliente()
    {
        return this.cliente;
    }
    
    private void setProductos(ArrayList<Producto> p_producto)
    {
        this.productos = p_producto;        
    }
    public ArrayList<Producto> getProductos()
    {
        return this.productos;
    }
    
    /**
     *Metodo para agregar un objeto producto a la coleccion 
     */
    public boolean agregarProducto(Producto p_producto)
    {
        return this.getProductos().add(p_producto);
    }
    
    /**
     *Metodo para quitar un objeto producto de la coleccion 
     */
    public boolean quitarProducto(Producto p_producto)
    {
        return this.getProductos().remove(p_producto);
    }
    
    /**
     * Metodo que devuelve el total al contado de todos los productos en la coleccion
     */
    public double totalAlContado()
    {
        double total = 0 ;
        for(int i=0; i<this.getProductos().size(); i++)
        {
            total = total + this.getProductos().get(i).precioContado();
        }
        return total;
    }
    
    
    /**
     * Metodo que devuelve el total financiado de todos los productos en la coleccion
     */
    public double totalFinanciado()
    {
        double total = 0;
        for(int i=0; i<this.getProductos().size(); i++)
        {
            total = total + this.getProductos().get(i).precioLista();
        }
        return total;
    }
    
    /**
     * Metodo que imprime en pantalla el detalle del pedido 
     * muestra el precio de lista y precio al contado de cada producto
     * y al final muestra el total financiado y el total al contado.
     */
    public void mostrarPedido()
    {
        System.out.println("****** Detalle del pedido ****** Fecha: ");
        System.out.println("\nProducto        Precio Lista    Precio Contado");
        System.out.println("-------------------------------------------------------");
        
        for(int i=0; i<this.productos.size(); i++)
        {
            System.out.println(this.getProductos().get(i).mostrarLinea());                                 
        }
        System.out.println("-------------------------------------------------------");
        System.out.println("****Total ------ "+this.totalFinanciado()+"          "+this.totalAlContado());
        System.out.println();
        System.out.println();
        System.out.println();
        }
    }
        
        
        
        
        
        
        
        
        
        
        
        
        

