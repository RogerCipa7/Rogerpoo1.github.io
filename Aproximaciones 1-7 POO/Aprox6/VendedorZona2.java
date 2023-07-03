public class VendedorZona2 extends Vendedor
{
    private double Venta1;
    private double Venta2;
    private double Venta3;
   
    public VendedorZona2(String id, String nombre, String sede, double Venta1, double Venta2, double Venta3){
      super (id, nombre, sede);
      setNombre(nombre);
      setSede(sede);
    }
   
     
    public double getVenta1(){
        return Venta1;
    }
    public void setVenta1(double Venta1){
        if(Venta1 >= 0) this.Venta1 = Venta1;
        else this.Venta1 = 0;
    }
   
    public double getVenta2(){
        return Venta2;
    }
    public void setVenta2(double Venta2){
        if(Venta2 >= 0) this.Venta2 = Venta2;
        else this.Venta2 = 0;
    }

    public double getVenta3(){
        return Venta3;
    }
    public void setVenta3(double Venta3){
        if(Venta3 >= 0) this.Venta3 = Venta3;
        else this.Venta3 = 0;
    }


    double calcularPromedio(){
        return (Venta1 + Venta2 + Venta3) / 3;
    }
}