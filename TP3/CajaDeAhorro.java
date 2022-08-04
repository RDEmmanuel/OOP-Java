
/**
 * Clase CajaDeAhorro, ejercicio 7 del TP3.
 * 
 * @author (Ruiz Diaz Emmanuel) 
 * @version (2020)
 */
public class CajaDeAhorro
{
        private int nroCuenta;
        private double saldo;
        private int extraccionesPosibles;
        private Persona titular;
        
        /**
         * Constructores de la clase CajaDeAhorro
         */
        public CajaDeAhorro(int p_nroCuenta, Persona p_titular)
        {
            this.setNroCuenta(p_nroCuenta);
            this.setTitular(p_titular);
            this.setSaldo(0.0);
            this.setExtraccionesPosibles(10);
        }
        public CajaDeAhorro(int p_nroCuenta, Persona p_titular, double p_saldo)
        {
            this.setNroCuenta(p_nroCuenta);
            this.setTitular(p_titular);
            this.setSaldo(p_saldo);
            this.setExtraccionesPosibles(10);
        }
        
        /**
         * Setters y Getters de la clase CajaDeAhorro
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
        
        private void setExtraccionesPosibles(int p_extracciones)
        {
            this.extraccionesPosibles = p_extracciones;
        }
        public int getExtraccionesPosibles()
        {
            return this.extraccionesPosibles;
        }
        
        /**
         * Metodo que devuelve verdadero si se puede realizar la extraccion, caso contrario devuelve falso.
         * La extraccion es posible cuando el p_importe es menor o igual al saldo, y cuando las extracciones
         * posibles son mayores a 0.
         */
        private boolean puedeExtraer(double p_importe)
        {
            if((this.getSaldo() >= p_importe) && (this.getExtraccionesPosibles() > 0))            
                return true;
            else
                return false;
        }
        
        /**
         * Metodo que realiza el deposito (saldo = saldo + p_importe)
         */
        public void depositar(double p_importe)
        {
            this.setSaldo(this.getSaldo() + p_importe);
        }
        
        /**
         * Metodo que coordina la operacion, de acuerdo a si se cumplen las condiciones de extraccion.
         * Si no se puede realizar la extraccion, informa el motivo de la misma.
         */
        public void extraer(double p_importe)
        {
            if(puedeExtraer(p_importe) == true)
            {
                    extraccion(p_importe);
                    System.out.println("Se ha realizado la extraccion con exito!---->$"+p_importe);
            }else 
                    if(this.getExtraccionesPosibles() == 0)
                    {
                            System.out.println("No tiene habilitadas mas extracciones!");
                    }else 
                          if(p_importe > this.getSaldo()) 
                          {  
                                System.out.println("No puede extraer mas que el saldo!");
                          }
        }
        
        /**
         * Metodo que efectivamente realiza la extraccion y descuenta 1 al numero de extracciones posibles.
         */
        private void extraccion(double p_importe)
        {
            this.setSaldo(this.getSaldo() - p_importe);
            this.setExtraccionesPosibles(this.getExtraccionesPosibles() - 1);
        }
        
        /**
         * Metodo que imprime en pantalla los datos de la Caja de Ahorro
         * Muestra nro de cuenta, saldo, nombre y apellido del titular, y el nro de extracciones posibles.
         */
        public void mostrar()
        {
            System.out.println("-------------------------------------------------------------------");
            System.out.println("Caja de Ahorro-");
            System.out.println("Nro. Cuenta: "+this.getNroCuenta()+" - Saldo:"+this.getSaldo());
            System.out.println("Titular: "+this.getTitular().getNombre()+" "+this.getTitular().getApellido());
            System.out.println("Extracciones posibles: "+this.getExtraccionesPosibles());
            System.out.println("-------------------------------------------------------------------");
        }
}






















