import java.util.Scanner;

public class ventas 
{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroVendedores;
        Vendedor[] losVendedores = new Vendedor[50];
        String identificacion, nombre;
        double venta1, venta2, venta3;
        double promedio = 0;

        System.out.println("Digite la cantidad de vendedores: ");
        numeroVendedores = sc.nextInt();

        for (int i = 0; i < numeroVendedores; i++) {
            System.out.println("Digite la identificacion del vendedor: ");
            identificacion = sc.next();
            System.out.println("Digite nombre del vendedor: ");
            nombre = sc.next();
            System.out.println("Digite la venta 1 del vendedor: ");
            venta1 = sc.nextDouble();
            System.out.println("Digite la venta 2 del vendedor: ");
            venta2 = sc.nextDouble();
            System.out.println("Digite la venta 3 del vendedor: ");
            venta3 = sc.nextDouble();
            
            Vendedor unVendedor = new Vendedor();
            unVendedor.identificacion = identificacion;
            unVendedor.nombre = nombre;
            unVendedor.venta1 = venta1;
            unVendedor.venta2 = venta2;
            unVendedor.venta1 = venta3;
            
            losVendedores[i] = unVendedor;
        }

        for (int i = 0; i < numeroVendedores; i++) {
            double sum = (losVendedores[i].venta1 + losVendedores[i].venta2 + losVendedores[i].venta3) / 3;
            promedio = promedio + sum;
        }

        promedio = promedio / numeroVendedores;

        System.out.println("El promedio de ventas es: " + promedio);
    }
}

