
public abstract class Vendedor{
    protected final String identificacion;
    private String nombre;
    
    public Vendedor(String identificacion, String nombre)throws Exception{
        if(identificacion.trim().equals(""))
            throw new Exception("valor invalido en la identificacion");
        if(identificacion.matches(".*[a-zA-Z].*"))
            throw new Exception("La identificacion no puede tener caracteres");
        this.identificacion = identificacion;
        setNombre(nombre);
        
    }
    
    public abstract double promedio();
    
    public String getIdentificacion(){
        return identificacion;
    }
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        if(nombre != null) this.nombre = nombre;
        else this.nombre = "";
    }
    
    
}
