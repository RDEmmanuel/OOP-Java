
/**
 * Clase CuentaCorriente, ejercicio 7 del TP3.
 * 
 * @author (Ruiz Diaz Emmanuel) 
 * @version (2020)
 */
public class CuentaCorriente
{   
      private int nroCuenta;
      private double saldo;
      private double limiteDescubierto;
      private Persona titular; 
       
      /**
        * Constructores de la clase CuentaCorriente
        */
      public CuentaCorriente(int p_nroCuenta, Persona p_titular)
      {
           this.setNroCuenta(p_nroCuenta);
           this.setTitular(p_titular);
           this.setSaldo(0.0);
           this.setLimiteDescubierto(500.0);
      }
      
      public CuentaCorriente(int p_nroCuenta, Persona p_titular, double p_saldo)
      {
           this.setNroCuenta(p_nroCuenta);
           this.setTitular(p_titular);
           this.setSaldo(p_saldo);
           this.setLimiteDescubierto(500.0);
      }
      
      /**
       * Setters y Getters de la clase CuentaCorriente
       */
      private void setNroCuenta(int p_nroCuenta)
      {
           this.nroCuenta = p_nroCuenta;
      }
      public int getNroCuenta()
      {
           return this.nroCuenta; 
      }
        
      private void setTitular(Persona p_titular)
      {
           this.titular = p_titular;
      }
      public Persona getTitular()
      {
          return this.titular; 
      }
      
      private void setSaldo(double p_saldo)
      {
          this.saldo = p_saldo;
      }
      public double getSaldo()
      {
         return this.saldo;
      }
      
      private void setLimiteDescubierto(double p_limite)
      {
          this.limiteDescubierto = p_limite;
      }
      public double getLimiteDescubierto()
      {
          return this.limiteDescubierto;
      }
      
      /**
       * Metodo para realizar un deposito (saldo = saldo + p_importe)
       */
      public void depositar(double p_importe)
      {
          this.setSaldo(this.getSaldo() + p_importe);
      }
      
      /**
       * Metodo que devuelve verdadero si se puede realizar la extraccion, en caso contrario devuelve falso
       * @return true or false
       */
      private boolean puedeExtraer(double p_importe)
      {
         if((this.getSaldo() + this.getLimiteDescubierto()) >= p_importe)            
              return true;
         else
              return false;
      }
      
      /**
       * Metodo que realiza efectivamente la extraccion (saldo = saldo - p_importe)
       */
      private void extraccion(double p_importe)
      {
          this.setSaldo(this.getSaldo() - p_importe);          
      }
      
      /**
       * Metodo que coordina la operacion, de acuerdo a si se cumplen las condiciones, caso contrario
       * informa el motivo por el cual no se pudo realizar la extraccion.
       */
      public void extraer(double p_importe)
      {
          if(puedeExtraer(p_importe) == true)
          {
              extraccion(p_importe);
              System.out.println("Se ha realizado la extraccion con exito!---->$"+p_importe);
          }else
              {
                  System.out.println("El importe de extraccion sobrepasa el limite descubierto!");
              }
      }
      
      /**
       * Metodo que imprime en pantalla los datos de la Cuenta Corriente
       * Muestra nro de cuenta, saldo, nombre y apellido del titular, y el limite descubierto
       */
      public void mostrar()
        {
            System.out.println("*******************************************************************");
            System.out.println("Cuenta Corriente-");
            System.out.println("Nro. Cuenta: "+this.getNroCuenta()+" - Saldo:"+this.getSaldo());
            System.out.println("Titular: "+this.getTitular().getNombre()+" "+this.getTitular().getApellido());
            System.out.println("Descubierto: "+this.getLimiteDescubierto());
            System.out.println("*******************************************************************");
        }
}
























