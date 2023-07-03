public class VendedorZona2 extends Vendedor{
    private double venta1;
    private double venta2;
    private double venta3;
    
    VendedorZona2(String identificacion, String nombre, double venta1, double venta2, double venta3)throws Exception{
        super(identificacion, nombre);
        setventa1(venta1);
        setventa2(venta2);
        setventa3(venta3);
    }
    
    public double promedio(){
        return (venta1 + venta2 + venta3) / 3;
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
    
}