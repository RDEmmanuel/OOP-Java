
/**
 * Write a description of class TriánguloRectangulo here.
 * 
 * @author (Ruiz Diaz Emmanuel) 
 * @version (2020)
 */
public class TriánguloRectangulo
{
   public static void main(String []args)
   {
       double h = Double.parseDouble(args[0]);
       double cateto1 = Double.parseDouble(args[1]);
       double cateto2 = Double.parseDouble(args[2]);
       
       if(Math.pow(h,2) == (Math.pow(cateto1,2) + Math.pow(cateto2,2)))
       {
           System.out.println("El tríangulo es rectángulo!");
        }
        else
        {
            System.out.println("El tríangulo no es rectángulo!");
        }       
    }
}
