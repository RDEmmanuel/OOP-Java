import java.util.Scanner;
import java.util.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
/**
 * Clase ejecutable AplicacionBanco ejercicio 3 del TP5.
 * 
 * @author (Ruiz Diaz Emmanuel) 
 * @version (2020)
 */    
public class AplicacionBanco
{
     public static void main (String [] args)    
     { 
                Scanner teclado = new Scanner(System.in);
                teclado.useDelimiter("\n");
            
                //Menu de opciones                
                System.out.println("*** Opciones *** ");
                System.out.println("1<---Operar con Empleados");
                System.out.println("2<---Operar con Cuentas Bancarias");
                System.out.println("0<---Para salir");
                int menu = teclado.nextInt();
                                
                while(menu != 0)
                {
                    switch(menu)
                    {
                        case 1:
                        {
                            System.out.println("Ingrese su Localidad: ");
                            String v_nombreLocalidad = teclado.next();
                            System.out.println("Ingrese su Provincia: ");
                            String v_nombreProvincia = teclado.next();
                            Localidad localidad1 = new Localidad(v_nombreLocalidad,v_nombreProvincia);
                            
                            System.out.println("Ingrese el Nombre del BANCO: ");
                            String v_nombreBanco = teclado.next();
                            System.out.println("Ingrese Nro de la Sucursal: ");
                            int v_nroSucursal = teclado.nextInt();
                            
                            teclado.nextLine();
                            System.out.println("Ingrese su Apellido: ");
                            String v_apellido = teclado.next();
                            System.out.println("Ingrese su Nombre: ");
                            String v_nombre = teclado.next();
                            System.out.println("Ingrese su Cuil: ");
                            long v_cuil = teclado.nextLong();
                            System.out.println("Ingrese su Sueldo Basico: ");
                            double v_sueldoBasico = teclado.nextDouble();
                            System.out.println("Ingrese su Año de Ingreso: ");
                            int v_anioNacimiento = teclado.nextInt();
                            System.out.println("Ingrese su Mes de Ingreso: ");
                            int v_mesNacimiento = teclado.nextInt();
                            System.out.println("Ingrese su Dia de Ingreso: ");
                            int v_diaNacimiento = teclado.nextInt();
                                
                            Calendar fecha1 = new GregorianCalendar(v_anioNacimiento, v_mesNacimiento, v_diaNacimiento);
                            Empleado empleado1 = new Empleado(v_cuil, v_apellido, v_nombre, v_sueldoBasico, fecha1);
                                                            
                            Banco banco1 = new Banco(v_nombreBanco,localidad1,v_nroSucursal,empleado1);
                            
                            System.out.println("Se ha agregado un empleado a la coleccion\n");
                            banco1.agregarEmpleado(empleado1);//se agrega un empleado a la coleccion
                            System.out.println("A continuacion ingrese los datos para agregar otro empleado\n");
                            
                            teclado.nextLine();
                            System.out.println("Ingrese su Apellido: ");
                            String v_apellido2 = teclado.next();
                            System.out.println("Ingrese su Nombre: ");
                            String v_nombre2 = teclado.next();
                            System.out.println("Ingrese su Cuil: ");
                            long v_cuil2 = teclado.nextLong();
                            System.out.println("Ingrese su Sueldo Basico: ");
                            double v_sueldoBasico2 = teclado.nextDouble();
                            System.out.println("Ingrese su Año de Ingreso: ");
                            int v_anioNacimiento2 = teclado.nextInt();
                            System.out.println("Ingrese su Mes de Ingreso: ");
                            int v_mesNacimiento2 = teclado.nextInt();
                            System.out.println("Ingrese su Dia de Ingreso: ");
                            int v_diaNacimiento2 = teclado.nextInt();
                
                            Calendar fecha2 = new GregorianCalendar(v_anioNacimiento2, v_mesNacimiento2, v_diaNacimiento2);
                            Empleado empleado2 = new Empleado(v_cuil2, v_apellido2, v_nombre2, v_sueldoBasico2, fecha2);
                            
                            System.out.println("Se ha agregado un empleado a la coleccion\n");         
                            banco1.agregarEmpleado(empleado2);//se agrega otro empleado a la coleccion
                            banco1.mostrar();
                                                                                                          
                        }break;
                        
                        case 2:
                        {
                            System.out.println("Ingrese su Localidad: ");
                            String v_nombreLocalidad = teclado.next();
                            System.out.println("Ingrese su Provincia: ");
                            String v_nombreProvincia = teclado.next();
                            Localidad localidad2 = new Localidad(v_nombreLocalidad, v_nombreProvincia);
                            
                            System.out.println("Ingrese el Nombre del BANCO: ");
                            String v_nombreBanco = teclado.next();
                            System.out.println("Ingrese Nro de la Sucursal: ");
                            int v_nroSucursal = teclado.nextInt();
                            
                            
                            System.out.println("Ingrese su Apellido: ");
                            String v_apellido = teclado.next();
                            System.out.println("Ingrese su Nombre: ");
                            String v_nombre = teclado.next();
                            System.out.println("Ingrese su Cuil: ");
                            long v_cuil = teclado.nextLong();
                            System.out.println("Ingrese su DNI: ");
                            int v_dni = teclado.nextInt();
                            System.out.println("Ingrese su Sueldo Basico: ");
                            double v_sueldoBasico = teclado.nextDouble();
                            System.out.println("Ingrese su Año de Nacimiento: ");
                            int v_anioNacimiento = teclado.nextInt();
                            System.out.println("Ingrese su Mes de Nacimiento: ");
                            int v_mesNacimiento = teclado.nextInt();
                            System.out.println("Ingrese su Dia de Nacimiento: ");
                            int v_diaNacimiento = teclado.nextInt();
                                
                            Calendar fecha3 = new GregorianCalendar(v_anioNacimiento, v_mesNacimiento, v_diaNacimiento);
                            Empleado empleado1 = new Empleado(v_cuil, v_apellido, v_nombre, v_sueldoBasico, fecha3);
                            
                            Persona persona1 = new Persona(v_dni, v_apellido, v_nombre,fecha3 );
                            CuentaBancaria cuenta1 = new CuentaBancaria(1111, persona1, v_sueldoBasico);
                            Banco banco1 = new Banco(v_nombreBanco, localidad2,v_nroSucursal, empleado1 );
                            
                            System.out.println("Se ha agregado una cuenta a la coleccion\n");
                            banco1.agregarCuentaBancaria(cuenta1);//se agrega una cuenta a la coleccion
                            System.out.println("A continuacion ingrese los datos para agregar otra cuenta\n");
                            
                            System.out.println("Ingrese su Apellido: ");
                            String v_apellido2 = teclado.next();
                            System.out.println("Ingrese su Nombre: ");
                            String v_nombre2 = teclado.next();
                            System.out.println("Ingrese su Cuil: ");
                            long v_cuil2 = teclado.nextLong();
                            System.out.println("Ingrese su DNI: ");
                            int v_dni2 = teclado.nextInt();
                            System.out.println("Ingrese su Sueldo Basico: ");
                            double v_sueldoBasico2 = teclado.nextDouble();
                            System.out.println("Ingrese su Año de Nacimiento: ");
                            int v_anioNacimiento2 = teclado.nextInt();
                            System.out.println("Ingrese su Mes de Nacimiento: ");
                            int v_mesNacimiento2 = teclado.nextInt();
                            System.out.println("Ingrese su Dia de Nacimiento: ");
                            int v_diaNacimiento2 = teclado.nextInt();
                                
                            Calendar fecha4 = new GregorianCalendar(v_anioNacimiento2, v_mesNacimiento2, v_diaNacimiento2);
                            Empleado empleado2 = new Empleado(v_cuil2, v_apellido2, v_nombre2, v_sueldoBasico2, fecha4);
                            
                            Persona persona2 = new Persona(v_dni2, v_apellido2, v_nombre2,fecha4 );
                            CuentaBancaria cuenta2 = new CuentaBancaria(2222, persona2, v_sueldoBasico2);
                            
                            System.out.println("Se ha agregado una cuenta a la coleccion\n");
                            banco1.agregarCuentaBancaria(cuenta2);//se agrega otra cuenta a la coleccion
                            
                            banco1.mostrarResumen();
                            banco1.mostrarSaldoCero();
                    
                        }break;

                        }
                        
                        System.out.println("*** Opciones ***");
                        System.out.println("1<---Operar con Empleados");
                        System.out.println("2<---Operar con Cuentas Bancarias");
                        System.out.println("0<---Para salir");
                        menu = teclado.nextInt();
                    }
                    
                    System.out.println("\n****Fin del programa****\n");
     }
                
                                
                                                                        
}



