

/**
 * Ejecutable RegistroCivil, ejercicio 10 del TP3.
 * 
 * @author (Ruiz Diaz Emmanuel) 
 * @version (2020)
 */
public class RegistroCivil
{
    public static void main(String [] args)
    {          
       Mujer mujer1 = new Mujer("Maria","Gomez",28); 
       Hombre hombre1 = new Hombre("Juan","Perez", 29);
       Hombre hombre2 = new Hombre("Pedro","Arias", 33);
       //muestro los datos 
       System.out.println("***Registro Civil***");
       System.out.println(hombre1.datos());
       System.out.println(mujer1.datos());
       System.out.println();
       
       //se casan mujer1 con hombre 1
       if(mujer1.getEstadoCivil() != "Casada")
       {
           mujer1.casarseCon(hombre1);
           hombre1.casarseCon(mujer1);
           System.out.println("Operacion exitosa!");
       }else
            {
                System.out.println("No es posible, ya se encuentra casada");      
            }
       
       //se muestra el estado civil 
       System.out.println();
       hombre1.mostrarEstadoCivil();
       mujer1.mostrarEstadoCivil();       
       System.out.println();
              
       hombre1.casadoCon();
       mujer1.casadaCon();
       System.out.println();

       //se intenta casar a una mujer YA CASADA con otro hombre
       if(mujer1.getEstadoCivil() != "Casada")
       {
           mujer1.casarseCon(hombre2);
           hombre2.casarseCon(mujer1);
           System.out.println("Operacion exitosa!");
       }else
            {
                System.out.println("No es posible, ya se encuentra casada!");      
            }
       
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
