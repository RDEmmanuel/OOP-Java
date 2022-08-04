
/**
 * Write a description of class Ejercicio4 here.
 * 
 * @author (Ruiz Diaz Emmanuel) 
 * @version (2020)
 */
public class Ejercicio4
{
    public static void main(String []args)
    {
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);
        double semiperímetro, area;
        
        semiperímetro = (a+b+c)/2;
        area = Math.sqrt(semiperímetro * ((semiperímetro - a) * (semiperímetro - b) * (semiperímetro - c)));
        System.out.println("El semiperímetro es: "+semiperímetro);
        System.out.println("El area es: "+area);
    }
}
