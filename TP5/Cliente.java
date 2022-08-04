
/**
 * Ejercicio nro 3 del TP2.
 * 
 * @author (Ruiz Diaz Emmanuel) 
 * @version (2020)
 */

public class Cliente
{
    private int nroDni;
    private String apellido;
    private String nombre;
    private double saldo;
    
    /**
     * Constructor de la clase Cliente
     */
    public Cliente(int p_nroDni,String p_apellido,String p_nombre)
    {
        this.setNroDni(p_nroDni);
        this.setApellido(p_apellido);
        this.setNombre(p_nombre);
        
    }
    
    public Cliente(int p_nroDni,String p_apellido,String p_nombre,double p_importe)
    {
        this.setNroDni(p_nroDni);
        this.setApellido(p_apellido);
        this.setNombre(p_nombre);
        this.setSaldo(p_importe);
    }
    
    /**
     * Seters y Geters de la clase Cliente
     */
    private void setNroDni(int p_nroDni)
    {
        this.nroDni = p_nroDni;
    }
    public int getNroDni()
    {
        return nroDni;
    }
    
    private void setNombre(String p_nombre)
    {
        this.nombre = p_nombre;
    }
    public String getNombre()
    {
        return nombre;
    }
    
    private void setApellido(String p_apellido)
    {
        this.apellido = p_apellido;
    }
    public String getApellido()
    {
        return apellido;
    }
    
    private void setSaldo(double p_importe)
    {
        this.saldo = p_importe;
    }
    public double getSaldo()
    {
        return saldo;
    }
    
    /**
     * Metodo que muestra la salida impresa por pantalla
     */
    public void mostrar()
    {
        System.out.println(apeYNom() + " ("+getNroDni() + ")");       
        System.out.println("Saldo: $" +getSaldo()+ "\n");
    }
    
    /**
     * Metodo que reemplaza el saldo actual por el importe ingresado.
     * @Retorna nuevo saldo.
     */
    public double nuevoSaldo(double p_importe)
    {
        this.setSaldo(p_importe);
        return getSaldo();
    }
    
    /**
     * Metodo que actualiza el saldo actual.
     * @Retorna el saldo actualizado
     */
    public double agregarSaldo(double p_importe)
    {
        this.setSaldo(getSaldo() + p_importe);
        return getSaldo();
    }
    
    /**
     * Metodo que retorna apellido y nombre
     */
    public String apeYNom()
    {
        return "Apellido y Nombre: " +getApellido() + " " +getNombre();
    }
    
    /**
     * Metodo que retorna nombre y apellido
     */
    public String nomYApe()
    {
        return "Nombre y Apellido: " +getNombre() + " " +getApellido();
    }
}
