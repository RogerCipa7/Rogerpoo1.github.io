public class vendedorZona3{
    private final String identificacion;
    private String nombre;
    private double venta1;
    private double venta2;
    private double venta3;
    private double venta4;
    
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
    
    public double getventa1(){
        return venta1;
    }
    public void setventa1(double venta1){
        if(venta1 >= 0) this.venta1 = venta1;
        else this.venta1 = 0;
    }
    
    public double getventa2(){
        return venta2;
    }
    public void setventa2(double venta2){
        if(venta2 >= 0) this.venta2 = venta2;
        else this.venta2 = 0;
    }
    
    public double getventa3(){
        return venta3;
    }
    public void setventa3(double venta3){
        if(venta3 >= 0) this.venta3 = venta3;
        else this.venta3 = 0;
    }
    
    public double getventa4(){
        return venta4;
    }
    public void setventa4(double venta4){
        if(venta4 >= 0) this.venta4 = venta4;
        else this.venta4 = 0;
    }
    
    vendedorZona3(String identificacion, String nombre, double venta1, double venta2, double venta3, double venta4){
        if(identificacion != null) this.identificacion = identificacion;
        else this.identificacion = "";
        setNombre(nombre);
        setventa1(venta1);
        setventa2(venta2);
        setventa3(venta3);
        setventa4(venta4);        
    }
    
    double calcularPromedio(){
        return (venta1 + venta2 + venta3 + venta4) / 4;
    }
}