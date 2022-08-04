import java.util.Scanner;
/**
 * Clase ejecutable ArrayDePuntos
 * 
 * @author (Ruiz Diaz Emmanuel) 
 * @version (2020)
 */
public class ArrayDePuntos
{
    public static void main(String [] args)
    {
        Scanner entrada = new Scanner(System.in);
        Punto[] puntos = new Punto[6];
        double x,y;
        
        /**
         * Ingresa datos y carga el contenedor con 6 elementos de la clase Punto 
         * 
         */
        for(int i=0; i<puntos.length; i++)
        {
            System.out.println("Ingrese el valor de X: ");
            x = entrada.nextDouble();
            System.out.println("Ingrese el valor de Y: ");
            y = entrada.nextDouble();
            
            Punto punto1 = new Punto(x,y);
            puntos[i] = punto1;
        }
        
        /**
         * Recorre el contenedor e imprime las coordenadas
         */
        for(int i=0; i<puntos.length; i++)
        {
            System.out.println(puntos[i].coordenadas());
        }
    }
    
    
}
