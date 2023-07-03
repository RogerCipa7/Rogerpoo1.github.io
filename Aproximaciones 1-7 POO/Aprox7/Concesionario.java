import java.util.ArrayList;
public class Concesionario
{
    private final String nit;
    private String nombreSede;
    private String direccion;
    private ArrayList Vendedor;
    
    public Concesionario(String nit,String nombreSede,String direccion){
        if(nit != null) this.nit = nit;
        else this.nit = ""; 
        setnombreSede(nombreSede);
        setDireccion(direccion);        
        Vendedor = Vendedor = new ArrayList();
    }
    
    public String getNit(){
        return nit;
    }
    
    public String getnombreSede(){
        return nombreSede;
    }
    public void setnombreSede(String nombreSede){
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
        
    public double calcularPromedioGeneral(){
        double promedio = 0;
        for(int i = 0; i < Vendedor.size(); i++){
            promedio += ((Vendedor)Vendedor.get(i)).promedio();
        }

        return promedio / 3;
    }
    
    public void adicionarVendedor(String identificacion, String nombre, String sede, double venta1, double venta2)throws Exception{
        Vendedor.add(new VendedorZona1(identificacion, nombre, venta1, venta2));
    }
    
    public void adicionarVendedor(String identificacion, String nombre, String sede, double venta1, double venta2, double venta3)throws Exception{
        Vendedor.add(new VendedorZona2(identificacion, nombre, venta1, venta2, venta3));
    }
    
    public void adicionarVendedor(String identificacion, String nombre, String sede,double venta1, double venta2, double venta3, double venta4)throws Exception{
        Vendedor.add(new VendedorZona3(identificacion, nombre, venta1, venta2, venta3, venta4));
    }
}    
