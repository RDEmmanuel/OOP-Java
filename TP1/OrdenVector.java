/**
 * Write a description of class OrdenVector here.
 * 
 * @author (Ruiz Diaz Emmanuel) 
 * @version (2020)
 */

import java.util.Scanner;
public class OrdenVector
{
    public static void menu(String []args)
    {
        Scanner teclado = new Scanner(System.in);
        teclado.useDelimiter("\n");
        
        System.out.println("Ingrese el tamaño del array: ");
        int n = teclado.nextInt();
        double vector[] = new double[n];
        
        for(int x=0; x<vector.length; x++)
        {
            System.out.println("Ingrese valor "+(x+1));
            vector[x] = teclado.nextDouble();
        }
        
        System.out.println("\nVector ingresado: ");
        for(int x=0; x<vector.length; x++)
        {
            System.out.print("  "+vector[x]);
        }
        
        double menor = vector[0];
        for(int x=0; x<vector.length; x++)
        {            
            if(vector[x] < menor)
            {
                menor = vector[x];
            }            
        }
        
        int i, j;
        double aux;
        for(i=0; i<vector.length - 1; i++)
        {
            for(j=0; j<vector.length - i - 1; j++)
            {
                if(vector[j + 1] < vector[j])
                {
                    aux = vector[j + 1];
                    vector[j + 1] = vector[j];
                    vector[j] = aux;
                }
            }
        }
        
        System.out.println("\n\nVector ordenado de menor a mayor por método de Burbuja: ");
        for(int x=0; x<vector.length; x++)
        {
            System.out.print("  "+vector[x]);
        }
        System.out.println("\n\nEl menor valor ingresado es: "+menor);
        
    }
}
