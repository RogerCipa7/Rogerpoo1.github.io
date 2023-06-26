public class vendedor {
    private String identificacion;
    private String nombre;
    private double ventaMes1;
    private double ventaMes2;
    private double ventaMes3;
    
    public String getIdentificacion() {
        return identificacion;
    }
    
    public void setIdentificacion(String identificacion) {
        if (identificacion != null) {
            this.identificacion = identificacion;
        } else {
            this.identificacion = "";
        }
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        if (nombre != null) {
            this.nombre = nombre;
        } else {
            this.nombre = "";
        }
    }
    
    public double getVentaMes1() {
        return ventaMes1;
    }
    
    public void setVentaMes1(double ventaMes1) {
        if (ventaMes1 >= 0) {
            this.ventaMes1 = ventaMes1;
        } else {
            this.ventaMes1 = 0;
        }
    }
    
    public double getVentaMes2() {
        return ventaMes2;
    }
    
    public void setVentaMes2(double ventaMes2) {
        if (ventaMes2 >= 0) {
            this.ventaMes2 = ventaMes2;
        } else {
            this.ventaMes2 = 0;
        }
    }
    
    public double getVentaMes3() {
        return ventaMes3;
    }
    
    public void setVentaMes3(double ventaMes3) {
        if (ventaMes3 >= 0) {
            this.ventaMes3 = ventaMes3;
        } else {
            this.ventaMes3 = 0;
        }
    }
    
    public vendedor(String identificacion, String nombre, double ventaMes1, double ventaMes2, double ventaMes3) {
        setIdentificacion(identificacion);    
        setNombre(nombre);
        setVentaMes1(ventaMes1);
        setVentaMes2(ventaMes2);
        setVentaMes3(ventaMes3);
    }
    
    public double calcularPromedio() {
        return (ventaMes1 + ventaMes2 + ventaMes3) / 3;
    }
}
