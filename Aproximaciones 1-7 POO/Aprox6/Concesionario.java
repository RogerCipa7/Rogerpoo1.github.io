public class Concesionario {
    private final String nit;
    private String ciudadConcesionario;
    private String direccion;
    private Vendedor[] vendedores;
    private int numeroVendedores;

    public Concesionario(String nit, String ciudadConcesionario, String direccion) {
        if (nit != null) this.nit = nit;
        else this.nit = "";
        setCiudadConcesionario(ciudadConcesionario);
        setDireccion(direccion);
        vendedores = new Vendedor[50];
        numeroVendedores = 0;
    }

    public String getNit() {
        return nit;
    }

    public String getCiudadConcesionario() {
        return ciudadConcesionario;
    }

    public void setCiudadConcesionario(String ciudadConcesionario) {
        if (ciudadConcesionario != null) {
            this.ciudadConcesionario = ciudadConcesionario;
        } else {
            this.ciudadConcesionario = "";
        }
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        if (direccion != null) {
            this.direccion = direccion;
        } else {
            this.direccion = "";
        }
    }

    public double calcularPromedioGeneral() {
        double promedio = 0;
        for (int i = 0; i < numeroVendedores; i++) {
            promedio += vendedores[i].calcularPromedio();
        }
        return promedio / numeroVendedores;
    }

    public void adicionarVendedorZona1(String identificacion, String nombre, String sede, double venta1, double venta2) {
        vendedores[numeroVendedores] = new VendedorZona1(identificacion, nombre, sede, venta1, venta2);
        numeroVendedores++;
    }

    public void adicionarVendedorZona2(String identificacion, String nombre, String sede, double venta1, double venta2, double venta3) {
        vendedores[numeroVendedores] = new VendedorZona2(identificacion, nombre, sede, venta1, venta2, venta3);
        numeroVendedores++;
    }

    public void adicionarVendedorZona3(String identificacion, String nombre, String sede, double venta1, double venta2, double venta3, double venta4) {
        vendedores[numeroVendedores] = new VendedorZona3(identificacion, nombre, sede, venta1, venta2, venta3, venta4);
        numeroVendedores++;
    }
}
