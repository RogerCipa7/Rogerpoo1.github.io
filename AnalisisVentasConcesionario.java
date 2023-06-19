import java.util.Scanner;

public class AnalisisVentasConcesionario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de Vendores: ");
        int vendedores = scanner.nextInt();

        double totalVentas = 0;

        for (int i = 1; i <= vendedores; i++) {
            System.out.print("Ingrese el ID del Vendedor: ");
            int id = scanner.nextInt();

            System.out.print("Ingrese el nombre del Vendedor: ");
            String nombre = scanner.next();

            double ventasMes1, ventasMes2, ventasMes3;

            System.out.print("Ingrese el valor de ventas del mes 1: ");
            ventasMes1 = scanner.nextDouble();

            System.out.print("Ingrese el valor de ventas del mes 2: ");
            ventasMes2 = scanner.nextDouble();

            System.out.print("Ingrese el valor de ventas del mes 3: ");
            ventasMes3 = scanner.nextDouble();

            totalVentas += ventasMes1 + ventasMes2 + ventasMes3;
        }

        double promedioVentas = totalVentas / (vendedores * 3);
        System.out.println("El promedio de ventas del concesionario es:$" + promedioVentas);

        scanner.close();
    }
}
