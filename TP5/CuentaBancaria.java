
/**
 * Clase CuentaBancaria, Ejercicio 5 del TP3.
 * 
 * @author (Ruiz Diaz Emmanuel) 
 * @version (2020)
 */
public class CuentaBancaria
{
   private int nroCuenta;
   private double saldo;
   private Persona persona;
   
   /**
    * Constructores de la clase CuentaBancaria
    */
   public CuentaBancaria(int p_nroCuenta, Persona p_persona)
   {
       this.setNroCuenta(p_nroCuenta);
       this.setPersona(p_persona);
       this.setSaldo(0.0);
   }
   
   public CuentaBancaria(int p_nroCuenta, Persona p_persona, double p_saldo)
   {
       this.setNroCuenta(p_nroCuenta);
       this.setPersona(p_persona);
       this.setSaldo(p_saldo);
   }
   
   /**
    * Setters y Getters de la clase CuentaBancaria
    */
   private void setNroCuenta(int p_nroCuenta)
   {
       this.nroCuenta = p_nroCuenta;
   }
   public int getNroCuenta()
   {
       return this.nroCuenta;
   }
   
   private void setPersona(Persona p_persona)
   {
       this.persona = p_persona;
   }
   public Persona getPersona()
   {
       return this.persona;
   }
   
   private void setSaldo(double p_saldo)
   {
       this.saldo = p_saldo;
   }
   public double getSaldo()
   {
       return this.saldo;
   }
   
   /**
    * Metodo para realizar un deposito en la cuenta
    * Retorna la suma del importe con el saldo
    */
   public double depositar(double p_importe)
   {
       this.setSaldo(this.getSaldo() + p_importe);
       return this.getSaldo();       
   }
   
   /**
    * Metodo para extraer el importe ingresado, si el importe es menor o igual al saldo de la cuenta se realiza la extraccion
    */
   public double extraer(double p_importe)
   {
      if(this.getSaldo() >= p_importe)
       {
           this.setSaldo(this.getSaldo() - p_importe); 
           return this.getSaldo();
       }else
            {
                return this.getSaldo();
            }
    }
   
    /**
     * Metodo para mostrar en pantalla los datos de la cuenta bancaria
     * Muestra nombre, apellido y edad del titular, y el saldo de la cuenta
     */
   public void mostrar()
   {
       System.out.println("- Cuenta Bancaria -");
       System.out.println("Titular: "+this.getPersona().getNombre()+" "+ this.getPersona().getApellido() +" ("+this.getPersona().edad()+" años)");
       System.out.println("Saldo: "+this.getSaldo());
    }
   
    /**
     * Metodo que retorna una cadena formada por la concatenacion del nro de cuenta, nombre y apellido del titular
     * y el saldo
     */
   public String toStrinf()
   {
       return this.getPersona().getDNI()+"     "+this.getPersona().getNombre()+" "+this.getPersona().getApellido();
    }
}
























