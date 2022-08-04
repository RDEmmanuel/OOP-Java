import java.util.Random;
/**
 * Clase CreaFigura, ejercicio 3 y 4 del TP3.
 * 
 * @author (Ruiz Diaz Emmanuel) 
 * @version (2020)
 */
public class CreaFigura
{
   public static void main(String[]args)
   {
       Random unNumero = new Random();
       double radio = unNumero.nextDouble() * 100.0;
       double radio2 = unNumero.nextDouble() * 100.0;
       double ancho = unNumero.nextDouble() * 100.0;
       double alto = unNumero.nextDouble() * 100.0;
       double ancho2 = unNumero.nextDouble() * 100.0;
       double alto2 = unNumero.nextDouble() * 100.0;
                     
       Punto punto1 = new Punto(3,2);//se crea punto (0,0)
       Circulo circulo1 = new Circulo(radio, punto1);       
       System.out.println("Se ha creado un circulo: ");
       circulo1.caracteristicas();
       punto1.desplazar(-240, -230);
       System.out.println("\nSe ha desplazado el circulo: ");
       circulo1.caracteristicas();
       
       Punto punto2 = new Punto(3, 5);
       Circulo circulo2 = new Circulo(radio2, punto2);
       System.out.println("\nSe ha creado otro circulo: ");
       circulo2.caracteristicas();
       System.out.print("\nEl mayor de los circulos es: \n");
       circulo1.elMayor(circulo2).caracteristicas();
       System.out.print("\nLa distancia entre los dos circulos es: ");
       System.out.print(punto1.distanciaA(punto2));
       
       System.out.println("\n\n---------------------------------------------------------------------------\n");
       
       Punto punto3 = new Punto();//se crea punto (0,0)
       Rectangulo rectangulo1 = new Rectangulo(punto3,ancho,alto);//se crea un rectangulo con origen (0,0) con ancho y altura aleatorios.
       System.out.println("Se ha creado un rectangulo: ");
       rectangulo1.caracteristicas();
       rectangulo1.desplazar(40, -20);
       System.out.println("\nSe ha desplazado el rectangulo: ");
       rectangulo1.caracteristicas();
       
       Punto punto4 = new Punto(7.4,4.5);
       Rectangulo rectangulo2 = new Rectangulo(punto4, ancho2, alto2);
       System.out.println("\nSe ha creado otro rectangulo: ");
       rectangulo2.caracteristicas();
       
       System.out.print("\nEl mayor de los rectangulos es: \n");
       rectangulo1.elMayor(rectangulo2).caracteristicas();
       
       System.out.print("\nLa distancia entre los dos rectangulos es: ");
       System.out.print(rectangulo1.distanciaA(rectangulo2));
   }
}
