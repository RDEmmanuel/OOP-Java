import java.util.Scanner;
/**
 * Ejecutable ejercicio 2 del TP3.
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
                        
        System.out.println("----->Ingrese valores para el primer punto<-----");
        System.out.print("Ingrese un valor para x: ");
        x = entrada.nextInt();
        System.out.print("Ingrese un valor para y: ");
        y = entrada.nextInt();
        
        Punto punto1 = new Punto(x,y);
        punto1.mostrar();
        System.out.print("\nCoordenadas: ");
        System.out.print(punto1.coordenadas());
        
        System.out.println("\n\n----->Ingrese valores para el segundo punto<-----");
        System.out.print("Ingrese un valor para x: ");
        x = entrada.nextInt();
        System.out.print("Ingrese un valor para y: ");
        y = entrada.nextInt();
        
        Punto punto2 = new Punto(x,y);
        punto1.mostrar();
        System.out.print("\nCoordenadas: ");
        System.out.print(punto2.coordenadas());
        
        System.out.println("\n\n***Distancia entre el punto 1 y el punto 2***");
        System.out.println(punto1.distanciaA(punto2));
                                
    }
   
}
