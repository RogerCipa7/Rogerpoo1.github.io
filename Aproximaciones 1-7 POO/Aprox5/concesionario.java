public class concesionario
{
    private final String nit;
    private String nombreSede;
    private String direccion;
    private vendedorZona1[] vendedor1;
    private vendedorZona2[] vendedor2;
    private vendedorZona3[] vendedor3;    
    private int numeVendedores1;
    private int numeVendedores2;
    private int numeVendedores3;    
    
    public concesionario(String nit,String nombreSede,String direccion){
        if(nit != null) this.nit = nit;
        else this.nit = ""; 
        setnombreSede(nombreSede);
        setDireccion(direccion);        
        vendedor1 = new vendedorZona1[50];
        vendedor2 = new vendedorZona2[50];
        vendedor3 = new vendedorZona3[50];        
        numeVendedores1 = 0;
        numeVendedores2 = 0;
        numeVendedores3 = 0;        
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
    
    public int getnumeVendedores1(){
        return numeVendedores1;
    }
    
    public int getnumeVendedores2(){
        return numeVendedores2;
    }
    
    public int getnumeVendedores3(){
        return numeVendedores3;
    }    
    
    public double calcularPromedioGeneral(){
        double promedio = 0;
        for(int i = 0; i < numeVendedores1; i++){
            promedio = promedio + vendedor1[i].calcularPromedio() / numeVendedores1;
        }
        for(int i = 0; i < numeVendedores2; i++){
            promedio = promedio + vendedor2[i].calcularPromedio() / numeVendedores2;
        }
        for(int i = 0; i < numeVendedores3; i++){
            promedio = promedio + vendedor3[i].calcularPromedio() / numeVendedores3;
        }
        return promedio / 3;
    }
    public void adicionarvendedorZona1(String identificacion, String nombre,  double venta1, double venta2){
        vendedor1[numeVendedores1] = new vendedorZona1(identificacion, nombre,  venta1, venta2);
        numeVendedores1++;
    }
    
    public void adicionarvendedorZona2(String identificacion, String nombre,  double venta1, double venta2, double venta3){
        vendedor2[numeVendedores2] = new vendedorZona2(identificacion, nombre,  venta1, venta2, venta3);
        numeVendedores2++;
    }
    
    public void adicionarvendedorZona3(String identificacion, String nombre,  double venta1, double venta2, double venta3, double venta4){
        vendedor3[numeVendedores3] = new vendedorZona3(identificacion, nombre,  venta1, venta2, venta3, venta4);
        numeVendedores3++;
    }
}    