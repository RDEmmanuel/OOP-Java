import java.util.Calendar;
import java.util.GregorianCalendar;
/**
 * Ejercicio nro 5 del TP2.
 * 
 * @author (Ruiz Diaz Emmanuel) 
 * @version (2020)
 */
public class Empleado
{
    private long cuil;
    private String apellido;
    private String nombre;
    private double sueldoBasico;
    private int anioIngreso;

    /**
     * Constructor de la clase Empleado
     */
    public Empleado(long p_cuil, String p_apellido, String p_nombre, double p_importe, int p_anio)
    {
        this.setCuil(p_cuil);
        this.setApellido(p_apellido);
        this.setNombre(p_nombre);
        this.setSueldoBasico(p_importe);
        this.setAnio(p_anio);        
    }
    
    /**
     * Seters y Geters de la clase Empleado
     */
    private void setCuil(long p_cuil)
    {
        this.cuil = p_cuil;
    }
    public long getCuil()
    {
        return cuil;
    }
    
    private void setApellido(String p_apellido)
    {
        this.apellido = p_apellido;
    }
    public String getApellido()
    {
        return apellido;
    }
    
    private void setNombre(String p_nombre)
    {
        this.nombre = p_nombre;
    }
    public String getNombre()
    {
        return nombre;
    }
    
    private void setSueldoBasico(double p_importe)
    {
        this.sueldoBasico = p_importe;
    }
    public double getSueldoBasico()
    {
        return sueldoBasico;
    }
    
    private void setAnio(int p_anio)
    {
        this.anioIngreso = p_anio;
    }
    public int getAnio()
    {
        return anioIngreso;
    }
    
    /**
     * Metodo que devuelve la cantidad de anios desde que ingreso a la empresa
     */
    public int antiguedad()
    {
        Calendar fechaHoy = new GregorianCalendar();
        int anioHoy = fechaHoy.get(Calendar.YEAR);
        int antiguedad = anioHoy - anioIngreso;
        return antiguedad;
    }
    
    /**
     * Metodo que corresponde al 2% del sueldo basico en concepto de la obra social + $12 de seguro de vida
     */
    public double descuento()
    {
        double descuento;
        descuento = (sueldoBasico * 2) / 100;
        descuento = descuento + 12;
        return descuento;
    }
    
    /**
     * Metodo que realiza una asignacion sobre el sueldo basico en base a la antiguedad
     */
    public double adicional()
    {
        double asignacion = 0.0;
        if(antiguedad() >= 10)
        {
            asignacion = asignacion + (sueldoBasico * 6) / 100; 
        }
        else if((antiguedad() <= 10) & (antiguedad() >=2))
        {
            asignacion = asignacion + (sueldoBasico * 4) / 100;
        }
        else
        {
            asignacion = asignacion + (sueldoBasico * 2) / 100;
        }
                    
        return asignacion;
    }
    
    /**
     * Metodo que calcula el sueldo neto, sumando el adicional y restando el descuento.
     */    
    public double sueldoNeto()
    {
        double neto = 0.0;
        neto = getSueldoBasico() + adicional() - descuento();
        return neto;
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
        return "Nombre y Apellido: " +getNombre() +" " +getApellido();
    }
    
    /**
     * Metodo para mostrar la salida impresa en pantalla
     */
    public void mostrar()
    {
            System.out.println(nomYApe());
            System.out.print("CUIL: " +cuil);
            System.out.print("  Antiguedad: ");
            System.out.print(antiguedad());
            System.out.println(" años de servicio");
            System.out.print("Sueldo Neto: $");
            System.out.print(sueldoNeto() + "\n\n");
    }
    
    /**
     * Metodo que muestra cuil, apellido y nombre, y el sueldo neto
     */
    public String mostrarLinea()
    {
        return +getCuil() + "   " +getApellido() +"," +getNombre() + "............$" +sueldoNeto() + "\n";
    }    
}
