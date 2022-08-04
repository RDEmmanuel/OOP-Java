
/**
 * Write a description of class Circunferencia here.
 * 
 * @author (Ruiz Diaz Emmanuel) 
 * @version (2020)
 */
import java.util.Scanner;

public class CircunferenciaEj7
{
    public static void main(String []args)
    {
        Scanner teclado = new Scanner(System.in);
        teclado.useDelimiter("\n");
        int valor1;
        System.out.print("Ingrese el radio: ");
        valor1 = teclado.nextInt();
        
        while(valor1 != 0)
        {
        System.out.println("Perímetro: " + (2 * 3.14 * valor1));
        System.out.print("Ingrese el radio: ");
        valor1 = teclado.nextInt();
        }
        
        System.out.println("Ejercicio finalizado!");
     }
        
}

