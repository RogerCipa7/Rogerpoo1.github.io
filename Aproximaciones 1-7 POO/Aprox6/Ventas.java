import java.text.DecimalFormat;
import java.util.Scanner;

public class Ventas {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Concesionario miConcesionario = new Concesionario("123456", "IED GonzaloArango", "Suba");
        String id, nombre, sede;

        double promedio = 0;

        System.out.println("Digite el numero de vendedores de la zona 1 ");
        int numVendedores1 = sc.nextInt();
        for (int i = 0; i < numVendedores1; i++) {
            double venta1, venta2;
            System.out.println("Digite la Identificacion del vendedor: ");
            id = sc.next();
            System.out.println("Digite el nombre del vendedor: ");
            nombre = sc.next();
            System.out.println("Digite la sede del vendedor: ");
            sede = sc.next();
            System.out.println("Digite el total de ventas del primer mes del vendedor ");
            venta1 = sc.nextDouble();
            System.out.println("Digite el total de ventas del segundo mes del vendedor ");
            venta2 = sc.nextDouble();
            miConcesionario.adicionarVendedorZona1(id, nombre, sede, venta1, venta2);
        }

        System.out.println("Digite el numero de vendedores de Concesionario: ");
        int numVendedores2 = sc.nextInt();
        for (int i = 0; i < numVendedores2; i++) {
            double venta1, venta2, venta3;
            System.out.println("Digite la Identificacion del vendedor: ");
            id = sc.next();
            System.out.println("Digite el nombre del vendedor: ");
            nombre = sc.next();
            System.out.println("Digite la sede del vendedor: ");
            sede = sc.next();
            System.out.println("Digite el total de ventas del primer mes del vendedor: ");
            venta1 = sc.nextDouble();
            System.out.println("Digite el total de ventas del segundo mes del vendedor ");
            venta2 = sc.nextDouble();
            System.out.println("Digite el total de ventas del tercer mes del vendedor ");
            venta3 = sc.nextDouble();
            miConcesionario.adicionarVendedorZona2(id, nombre, sede, venta1, venta2, venta3);
        }

        System.out.println("Digite el numero de vendedores de Tecnico: ");
        int numVendedores3 = sc.nextInt();
        for (int i = 0; i < numVendedores3; i++) {
            double venta1, venta2, venta3, venta4;
            System.out.println("Digite la Identificacion del vendedor: ");
            id = sc.next();
            System.out.println("Digite el nombre del vendedor: ");
            nombre = sc.next();
            System.out.println("Digite la sede del vendedor: ");
            sede = sc.next();
            System.out.println("Digite el total de ventas del primer mes del vendedor ");
            venta1 = sc.nextDouble();
            System.out.println("Digite el total de ventas del segundo mes del vendedor ");
            venta2 = sc.nextDouble();
            System.out.println("Digite el total de ventas del tercer mes del vendedor ");
            venta3 = sc.nextDouble();
            System.out.println("Digite el total de ventas del cuarto mes del vendedor ");
            venta4 = sc.nextDouble();
            miConcesionario.adicionarVendedorZona3(id, nombre, sede, venta1, venta2, venta3, venta4);
        }

        promedio = miConcesionario.calcularPromedioGeneral();
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("\n El promedio de ventas totales es de: " + df.format(promedio));
    }
}
