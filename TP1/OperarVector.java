
/**
 * Write a description of class OperarVector here.
 * 
 * @author (Ruiz Diaz Emmanuel) 
 * @version (2020)
 */
import java.util.Scanner;
public class OperarVector
{
    public static void main(String []args)
    {
        Scanner teclado = new Scanner(System.in);
        teclado.useDelimiter("\n");
        
        int total=0, mayor;
        float promedio=0;
        
        System.out.println("Ingrese el tamaño del array: ");
        int n = teclado.nextInt();
        int notas[] = new int[n];
        
        for(int i=0; i<notas.length; i++)
        {
        System.out.println("Ingrese nota: "+(i+1));
        notas[i] = teclado.nextInt();
        total += notas[i];
        promedio = (float)total / n;        
        }
                
        mayor = notas[0];
        for(int i=0; i<notas.length; i++)
        {           
            if(notas[i] > mayor)
            {
                mayor = notas[i];
            }
        }
        
        System.out.println("Notas ingresadas: ");
        for(int i=0; i<notas.length; i++)
        {
            System.out.print("  "+notas[i]);
        }
        
        System.out.println("\nEl promedio de notas es: "+promedio);
        System.out.println("El máximo valor es: "+mayor);
        
    }
   
}
