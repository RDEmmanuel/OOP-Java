import java.util.*;
import java.util.Scanner;
/**
 * Clase ejecutable Carrera, ejercicio 6 del TP5.
 * 
 * @author (Ruiz Díaz Emmanuel) 
 * @version (2020)
 */
public class Carrera
{
    
    public static void main(String [] args)
    {
        Scanner entrada = new Scanner(System.in);
        entrada.useDelimiter("\n");
        
        System.out.println("Ingrese nombre del curso: ");
        String nombre = entrada.next();
        Curso curso1 = new Curso(nombre);
        System.out.println("Se ha creado el curso!");
        
        char sigue = 's';
        boolean salir = false;
        int opcion;
        
            
        while(!salir)
        {
            System.out.println("************************************************");
            System.out.println("*************** Menu de opciones ***************");
            System.out.println("1-Salir");
            System.out.println("2-Agregar un Alumno al curso");
            System.out.println("3-Dar de baja a un alumno: ");
            System.out.println("4-Mostrar Inscriptos");
            System.out.println("5-Buscar un alumno");
            System.out.println("6-Agregar notas a un alumno");
            System.out.println("7-Esta inscripto??");
            System.out.println("--------> Ingrese una opcion del menu <--------");                        
            System.out.println("************************************************");    
            opcion = entrada.nextInt();
            switch(opcion)
            {
                case 1:
                {
                    salir = true;
                }break;
                
                case 2:
                {
                    System.out.println("Ingrese nro LU");
                    int lu = entrada.nextInt();
                    System.out.println("Ingrese Nombre del Alumno");
                    String nombreAlumno = entrada.next();
                    System.out.println("Ingrese Apellido del Alumno");
                    String apellido = entrada.next();
                    //se crea el objeto de la clase alumno
                    Alumno alumno1 = new Alumno(lu, nombreAlumno, apellido);
                    curso1.inscribirAlumno(alumno1);
                    
                }break;
                
                case 3:
                {
                    System.out.println("Ingrese LU del alumno a dar baja");
                        int lu = entrada.nextInt();
                        
                        if(curso1.estaInscripto(lu))
                        {
                            System.out.println("Se ha dado de baja a "+curso1.buscarAlumno(lu).getNombre()+" porque abandona el curso--***");
                            curso1.quitarAlumno(lu);
                        }else
                        {
                            System.out.println("El alumno no esta inscripto en el curso");
                        }                                                                   
                }break;
                
                case 4:
                {
                    System.out.println("****-- Cantidad de inscriptos: "+curso1.cantidadAlumnos());
                    curso1.mostrarInscriptos();
                }break;
                
                case 5:
                {
                    System.out.println("Ingrese LU del alumno para buscar");
                        int lu = entrada.nextInt();
                        if(curso1.estaInscripto(lu))
                        {
                            System.out.println("Se ha encontrado al alumno solicitado:");
                            curso1.buscarAlumno(lu).mostrar();
                        }else
                            {
                                    System.out.println("No Se ha encontrado al alumno porque no esta inscripto");
                            }
                    
                  
                }break;
                
                case 6:
                {
                    System.out.println("Ingrese LU del alumno para agregar notas");
                        int lu = entrada.nextInt(); 
                        if(curso1.estaInscripto(lu))
                        {
                            System.out.println("Ingrese nota 1: ");
                            double nota1 = entrada.nextDouble();
                            System.out.println("Ingrese nota 2: ");
                            double nota2 = entrada.nextDouble();
                            curso1.buscarAlumno(lu).setNota1(nota1);
                            curso1.buscarAlumno(lu).setNota2(nota2);
                            System.out.println("Se agregaron las notas al alumno");
                            curso1.imprimirPromedioDelAlumno(lu);
                        }else
                            {
                                    System.out.println("No se pueden agregar notas, el alumno no existe.");
                            }
                                                                                                              
                }break;
                
                case 7:
                {                    
                    System.out.println("Ingrese LU de alumno para saber si esta inscripto en el curso");
                    int lu = entrada.nextInt();
                    if(curso1.estaInscripto(lu))
                    {
                        System.out.print("Está "+curso1.buscarAlumno(lu).nomYApe()+" inscripto??-->");
                        System.out.println(curso1.estaInscripto(lu));
                    }else
                        {
                            System.out.print("Está Inscripto??-->");
                            System.out.println(curso1.estaInscripto(lu));
                        }
            }    
            /*System.out.println("Ingrese nro LU");
            int lu = entrada.nextInt();
            System.out.println("Ingrese Nombre del Alumno");
            String nombreAlumno = entrada.next();
            System.out.println("Ingrese Apellido del Alumno");
            String apellido = entrada.next();
            //se crea el objeto de la clase alumno
            Alumno alumno1 = new Alumno(lu, nombreAlumno, apellido);
            
            System.out.println("Ingrese nota 1 del alumno: ");
            double nota1 = entrada.nextDouble();
            System.out.println("Ingrese nota 2 del alumno: ");
            double nota2 = entrada.nextDouble();
            //se agrega la nota 1 y nota 2
            alumno1.setNota1(nota1); alumno1.setNota2(nota2);
            curso1.inscribirAlumno(alumno1);
            
            System.out.println("Desea ingresar mas alumnos? S/N :");
            sigue = (entrada.next()).charAt(0);            
        }
        System.out.println("****-- Cantidad de inscriptos: "+curso1.cantidadAlumnos());
        curso1.mostrarInscriptos();
        
        System.out.println("\n****--Se da de baja a Pedro porque abandona el curso--****");        
        curso1.quitarAlumno(32555);//se da de baja un alumno del curso
        System.out.println("Esta Pedro Gomez inscripto??-->"+curso1.estaInscripto(2222));
        
        System.out.println("\n****-- Alumnos inscriptos actualmente: "+curso1.cantidadAlumnos());
        curso1.mostrarInscriptos();//muestra los alumnos inscriptos
        
        System.out.println("\n****--Busca y muestra el alumno con numero de libreta 30123--****");
        curso1.buscarAlumno(30123).mostrar();//recupera un alumno y lo muestra
        
        System.out.println("****--Mostrar promedio del alumno 23564--****");
        curso1.imprimirPromedioDelAlumno(23564);//muestra promedio de un alumno*/
            
    }
}
System.out.println("*** Fin de Programa ***");
}
}
