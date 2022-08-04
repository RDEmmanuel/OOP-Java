import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.*;
/**
 * Clase ejecutable TomaPedido, ejercicio 2 del TP5.
 * 
 * @author (Ruiz Diaz Emmanuel) 
 * @version (2020)
 */
public class TomaPedido
{
    public static void main(String [] args)
    {
        Calendar fechaHoy = new GregorianCalendar(2020, 5, 12);        
        Laboratorio laboratorio1 = new Laboratorio("Impulso", "Cordoba","3798652457", 4, 3);        
        Producto producto1 = new Producto(111,"Varios","CD.musica", 23 ,laboratorio1);
        Producto producto2 = new Producto(222,"Libreria","Libro-POO", 112.3 ,laboratorio1);
        Producto producto3 = new Producto(333,"Varios","Revista-user", 15.20 ,laboratorio1);        
        Cliente cliente1 = new Cliente(36487523,"Romero", "Carlos");        
        Pedido pedido1 = new Pedido(fechaHoy,cliente1,producto1);
        pedido1.agregarProducto(producto1);
        pedido1.agregarProducto(producto1);
        pedido1.agregarProducto(producto2);
        pedido1.agregarProducto(producto3);
        pedido1.mostrarPedido();                
        pedido1.quitarProducto(producto1);
        pedido1.mostrarPedido();
        
    }
}
