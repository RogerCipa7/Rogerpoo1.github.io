public class concesionario
{
    private final String nit;
    private String nombreSede;
    private String direccion;
    private vendedor[] vendedor;
    private int numVendedores;
    
    public concesionario(String nit,String nombreSede,String direccion){
        if(nit != null) this.nit = nit;
        else this.nit = ""; 
        setNombreSede(nombreSede);
        setDireccion(direccion);        
        vendedor = new vendedor[50];
        numVendedores = 0;
    }
    
    public String getNit(){
        return nit;
    }
    
    public String getNombreSede(){
        return nombreSede;
    }
    
    public void setNombreSede(String nombreSede){
        if(nombreSede != null){
            this.nombreSede = nombreSede;
        }else{
            this.nombreSede = "";
        }        
    }
    
    public String getDireccion(){
        return direccion;
    }
    public void setDireccion(String direccion){
        if(direccion != null){
            this.direccion = direccion;
        }else{
            this.direccion = "";
        }        
    }
    
    public int getNumVendedores(){
        return numVendedores;
    }
    
    public double calcularPromedioGeneral(){
        double promedio = 0;
        for(int i = 0; i < numVendedores; i++){
            promedio = promedio + vendedor[i].calcularPromedio() / numVendedores;
        }
        return promedio;
    }
    
    public void adicionarVendedor(String identificacion, String nombre, double ventaMes1, double ventaMes2, double ventaMes3){
        vendedor e = new vendedor(identificacion,nombre, ventaMes1, ventaMes2, ventaMes3);
        vendedor[numVendedores] = e;
        numVendedores++;
    }
}   