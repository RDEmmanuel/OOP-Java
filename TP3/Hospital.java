
/**
 * Clase hospital, ejercicio 8 TP3.
 * 
 * @author (Ruiz Diaz Emmanuel) 
 * @version (2020)
 */
public class Hospital
{
    private String nombreHospital;
    private String nombreDirector;
    private Paciente paciente;
    
    /**
     * Constructor de la clase Hospital
     */
    public Hospital(String p_nombreHospital, String p_nombreDirector)
    {
        this.setNombreHospital(p_nombreHospital);
        this.setNombreDirector(p_nombreDirector);
    }
    
    /**
     * Setters y Getters de la clase Hospital
     */
    private void setNombreHospital(String p_nombreHospital)
    {
        this.nombreHospital = p_nombreHospital;
    }
    public String getNombreHospital()
    {
        return this.nombreHospital;
    }
    
    private void setNombreDirector(String p_nombreDirector)
    {
        this.nombreDirector = p_nombreDirector;
    }
    public String getNombreDirector()
    {
        return this.nombreDirector;
    }
    
    /**
     *  Metodo que muestra por pantalla el nombre del hospital y el nombre del director.
     *  Nombre, historia clinica, localidad y provincia del paciente.
     */
    public void consultaDatosFiliatorios(Paciente p_paciente)
    {
        System.out.println("Hospital: "+this.getNombreHospital()+"   Director: "+this.getNombreDirector());
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("Paciente: "+p_paciente.getNombre()+"    Historia Clinica: "+p_paciente.getHistoriaClinica()+"   Domicilio: "+p_paciente.getDomicilio());
        System.out.println("Localidad: "+p_paciente.getVive().getNombre()+"     Provincia: "+p_paciente.getVive().getProvincia());
    }
}
















