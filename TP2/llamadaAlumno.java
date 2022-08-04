import java.util.Scanner;
/**
 * Ejecutable de la clase Alumno.
 * 
 * @author (Ruiz Diaz Emmanuel) 
 * @version (2020)
 */
public class llamadaAlumno
{
    public static void main(String [] args)
    {
        Scanner entrada = new Scanner(System.in);
        entrada.useDelimiter("\n");
        
        int lu = Integer.parseInt(args [0]);
        String nombre = (args [1]);
        String apellido = (args [2]);
        double nota1, nota2;
                
        Alumno alumno1 = new Alumno(lu, nombre, apellido);
        System.out.println("Ingrese nota 1: ");
        nota1 = entrada.nextDouble();
        System.out.println("Ingrese nota 2: ");
        nota2 = entrada.nextDouble();        
        alumno1.setNota1(nota1);
        alumno1.setNota2(nota2);
        alumno1.mostrar();    
    }
}
