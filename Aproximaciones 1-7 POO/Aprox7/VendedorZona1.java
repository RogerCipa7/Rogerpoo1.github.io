
public class VendedorZona1 extends Vendedor{
    private double venta1;
    private double venta2;
    
    
    VendedorZona1(String identificacion, String nombre, double venta1, double venta2)throws Exception{
        super(identificacion, nombre);
        setventa1(venta1);
        setventa2(venta2);
    }

    public double promedio(){
        return (venta1 + venta2) / 2;    
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
    
}
