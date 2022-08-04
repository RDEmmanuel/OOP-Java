import java.util.Scanner;
/**
 * Ejecutable del ejercicio nro 5 del TP2.
 * 
 * @author (Ruiz Diaz Emmanuel) 
 * @version (2020)
 */
public class LlamadaEmpleado
{
    public static void main(String [] args)
    {
        Scanner entrada = new Scanner(System.in);
        entrada.useDelimiter("\n");
        long cuil;
        String apellido;
        String nombre;
        double sueldoBasico;
        int anioIngreso;
        
        System.out.println("Ingrese nro de CUIL: ");
        cuil = entrada.nextLong();
        System.out.println("Ingrese Apellido: ");
        apellido = entrada.next();
        System.out.println("Ingrese Nombre: ");
        nombre = entrada.next();
        System.out.println("Ingrese sueldo basico: ");
        sueldoBasico = entrada.nextDouble();
        System.out.println("Ingrese Año de ingreso: ");
        anioIngreso = entrada.nextInt();
        
        Empleado empleado1 = new Empleado(cuil, apellido, nombre, sueldoBasico,anioIngreso);
        System.out.println("\nMetodo mostrar: \n");
        empleado1.mostrar();
        System.out.println("Metodo mostrar linea: \n");
        System.out.println(empleado1.mostrarLinea());
        
    }
}
