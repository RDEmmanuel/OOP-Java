
/**
 * Write a description of class Ecuación here.
 * 
 * @author (Ruiz Diaz Emmanuel) 
 * @version (2020)
 */
public class Ecuación
{
   public static void main(String []args)
   {
       double a = Double.parseDouble(args[0]);
       double b = Double.parseDouble(args[1]);
       double c = Double.parseDouble(args[2]);
       double x,x1,x2,discriminante;
       
       discriminante = Math.pow(b,2)-4*a*c;
       
       if(discriminante < 0)
       {
           System.out.println("Solución compleja!");
        }
       else if(discriminante == 0)
       {
           x=-b/(2*a);
           System.out.println("El resultado de la raiz es: "+x);
           System.out.println("x1 = x2");
        }
       else if(discriminante > 0)
       {
           x1 = (-b+Math.sqrt(Math.pow(b,2)-4*a*c))/2*a;
           x2 = (-b-Math.sqrt(Math.pow(b,2)-4*a*c))/2*a;
           System.out.println("Las raíces son: ");
           System.out.println(+x1);
           System.out.println(+x2);
        }
       else
       {
           System.out.println("La ecuación no es de segundo grado.");
        }
        
        
        
       
        
   }
    
    
}
