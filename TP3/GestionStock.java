
/**
 * Ejecutable GestionStock, ejercicio 1 del TP3 .
 * 
 * @author (Ruiz Diaz Emmanuel) 
 * @version (2020)
 */
public class GestionStock
{
    public static void main(String [] args)
    {
        Laboratorio objetoLab = new Laboratorio("Colgate S.A","Scalabrini Ortiz 5524","54-11-4239-8447");
        
        Producto objetoProducto = new Producto(111,"Perfumería", "Jabón Deluxe",5.25, objetoLab );
        Producto objetoProducto1 = new Producto(45213,"Perfumería", "Desodorante",12.25, objetoLab );
        
        objetoProducto.ajuste(500);
        objetoProducto.mostrar();
        objetoProducto.ajuste(-200);
        System.out.println("***Se ha realizado una baja de 200 productos debido a un mal estibo de los mismos***\n");
        objetoProducto.mostrar();
                
        objetoProducto1.ajuste(250);
        objetoProducto1.ajustarPtoRepo(2.5);
        System.out.println(objetoProducto1.getPorcPtoRepo());
        
        objetoProducto1.mostrar();
        
        System.out.println("\n"+objetoProducto.mostrarLinea());
        System.out.println(objetoProducto1.mostrarLinea());
    }
    
}
