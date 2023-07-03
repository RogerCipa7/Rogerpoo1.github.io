public class VendedorZona1 extends Vendedor
{
    private double Venta1;
    private double Venta2;
   
    public VendedorZona1(String id, String nombre, String sede, double venta1, double venta2){
      super (id, nombre, sede);
      setNombre(nombre);
      setSede(sede);
    }
   
    double calcularpromedio () {
        return  (Venta1 + Venta2)/ 2;
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
    double calcularPromedio(){
        return (Venta1 + Venta2 ) / 2;
    }
}