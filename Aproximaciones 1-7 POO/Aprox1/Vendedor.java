
public class Vendedor
{
    String identificacion;
    String nombre;
    
    double ventasMes1;
    double ventasMes2;
    double ventasMes3;
    
    Vendedor(String identificacion, String nombre, double ventasMes1, double ventasMes2, double ventasMes3){
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.ventasMes1 = ventasMes1;
        this.ventasMes2 = ventasMes2;
        this.ventasMes3 = ventasMes3;
    }
    
    double calcularPromedio(){
        return (ventasMes1 + ventasMes2 + ventasMes3) / 3;
    }
}