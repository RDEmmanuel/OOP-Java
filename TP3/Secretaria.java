import java.util.Scanner;
/**
 * Ejecutable ejercicio 6 del TP3.
 * 
 * @author (Ruiz Diaz Emmanuel) 
 * @version (2020)
 */
public class Secretaria
{
    public static void main(String [] args)
    {
        Scanner entrada = new Scanner(System.in);
        entrada.useDelimiter("\n");
        String nombre;
        String grado;
        double sueldoBasico;
        double asignacionFamiliar;
        String nombreEscuela;
        String domicilio;
        String director;
        
        //Se ingresan por teclado los datos del docente
        System.out.println("--->Por favor ingrese los datos del docente<---");
        System.out.println("\nIngrese nombre y apellido: ");
        nombre = entrada.next();
        System.out.println("Ingrese grado: ");
        grado = entrada.next();
        System.out.println("Ingrese sueldo basico:");
        sueldoBasico = entrada.nextDouble();
        System.out.println("Ingrese asigancion familiar: ");
        asignacionFamiliar = entrada.nextDouble();
        
        //se crea el objeto de la clase docente
        Docente docente1 = new Docente(nombre, grado, sueldoBasico, asignacionFamiliar);
        System.out.println("\nSe han ingresado los datos del docente con exito!");
        
        //se ingresan por teclado los datos de la clase escuela
        System.out.println("\n--->A continuacion ingrese los datos de la Escuela<---");
        System.out.println("\nIngrese nombre de la Escuela: ");
        nombreEscuela = entrada.next();
        System.out.println("Ingrese domicilio: ");
        domicilio = entrada.next();
        System.out.println("Ingrese nombre del director: ");
        director = entrada.next();
        
        //se crea el objeto de la clase escuela
        Escuela escuela1 = new Escuela(nombreEscuela, domicilio, director);
        System.out.println("\nSe han ingresado los datos de la escuela con exito!");
        
        System.out.println("\n**********************************************************************************\n");
        escuela1.imprimirRecibo(docente1);//se imprime el recibo solicitante
    }
    
}
