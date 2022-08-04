import java.util.Scanner;
/**
 * Ejecutable del ejericio nro 1 del TP2.
 * 
 * @author (Ruiz Diaz Emmanuel) 
 * @version (2020)
 */
public class LlamadaPersona
{
    public static void main(String [] args)
    {    
         Persona persona2 = new Persona(35123456, "Juan", "Perez", 1998);
        persona2.mostrar();
        Persona persona1 = new Persona(39993061,"Emmanuel", "Ruiz Diaz", 1996);    
        persona1.mostrar();       
    }
}
