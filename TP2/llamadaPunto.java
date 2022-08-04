import java.util.Scanner;
/**
 * Ejecutable ejercicio 6 del TP2.
 * 
 * @author (Ruiz Diaz Emmanuel) 
 * @version (2020)
 */

public class llamadaPunto
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        double x,y;
        
        System.out.println("Ingrese un valor para x: ");
        x = entrada.nextInt();
        System.out.println("Ingrese un valor para y:  ");
        y = entrada.nextInt();
        
        Punto punto1 = new Punto(x,y);
        punto1.mostrar();
        System.out.print("\nCoordenadas: ");
        System.out.print(punto1.coordenadas());
        
        System.out.println("\n\nIngrese valor para desplazar x: ");
        x = entrada.nextInt();
        System.out.println("Ingrese valor para desplazar y:  ");
        y = entrada.nextInt();
        punto1.desplazar(x,y);
        punto1.mostrar();
        System.out.print("\nCoordenadas: ");
        System.out.print(punto1.coordenadas());
        
    }
   
}
