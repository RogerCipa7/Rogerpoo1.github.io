public class Vendedor{
    
    protected final String id;
    private String nombre;
    private String sede;
   
    public Vendedor(String id, String nombre, String sede){
      if(id != null)this.id  = id;
      else this.id = "";
      setNombre(nombre);
      setSede(sede);
    }
    double calcularPromedio () {
        return  0;
    }
    public String getId (){
       return id;
    }
       public String getNombre (){
       return nombre;
    }
   
    public void setNombre (String nombre){
        if(nombre != null ) this.nombre = nombre;
        else this.nombre = "";
    }
        public String getSede (){
       return sede;
    }
   
    public void setSede (String sede){
        if(sede != null ) this.sede = sede;
        else this.sede = "";
    }
}
