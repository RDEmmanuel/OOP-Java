
/**
 * Clase gestionHospital, ejercicio 8 del TP3.
 * 
 * @author (Ruiz Diaz Emmanuel) 
 * @version (2020)
 */
public class GestionHospital
{
    public static void main(String[]args)
    {
        Localidad localidadNacido = new Localidad("Paso de los Libres", "Corrientes");
        Localidad localidadVive = new Localidad("Monte Caseros", "Corrientes");
        Localidad localidadNacido1 = new Localidad("Mercedes", "Misiones");
        Localidad localidadVive1 = new Localidad("Corrientes", "Corrientes");
        
        Paciente paciente = new Paciente(4522, "Julio Cesar Chavez", "Libertad 5400", localidadNacido1, localidadVive1);
        Paciente paciente1 = new Paciente(57869, "Juan Manuel Ortigoza","Bulevar 3 de Abril",localidadNacido,localidadVive);
        Hospital hospital1 = new Hospital("Garrahan", "Leonardo Ruiz");
        
        //consulta datos filiatorios 
        hospital1.consultaDatosFiliatorios(paciente1);
        System.out.println();
        hospital1.consultaDatosFiliatorios(paciente);
        System.out.println();
        System.out.println();
        //se muestra por pantalla los datos de los pacientes con el metodo mostrarDatosPantalla
        System.out.println("*********** Datos Pacientes ***********");
        paciente.mostrarDatosPantalla();
        System.out.println();
        paciente1.mostrarDatosPantalla();
        System.out.println();
        //se muestra por pantalla los datos de los pacientes con el metodo cadenadDeDatos
        System.out.println("----------- Lista Pacientes -----------");
        System.out.println(paciente.cadenaDeDatos());
        System.out.println(paciente1.cadenaDeDatos());
    }
}
