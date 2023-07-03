import java.util.Scanner;

public class ventas {
    public static void main(String Args[]) {
        Scanner sc = new Scanner(System.in);
        int numVendedores;
        vendedor[] losVendedores = new vendedor[50];
        String identificacion, nombre;
        double ventaMes1, ventaMes2, ventaMes3;
        double promedio = 0;

        System.out.println("Digite el número de vendedores: ");
        numVendedores = sc.nextInt();

        for (int i = 0; i < numVendedores; i++) {
            System.out.println("Digite la identificación del vendedor: ");
            identificacion = sc.next();
            System.out.println("Digite el nombre del vendedor: ");
            nombre = sc.next();
            System.out.println("Digite el valor de las ventas del mes 1: ");
            ventaMes1 = sc.nextDouble();
            System.out.println("Digite el valor de las ventas del mes 2: ");
            ventaMes2 = sc.nextDouble();
            System.out.println("Digite el valor de las ventas del mes 3: ");
            ventaMes3 = sc.nextDouble();
            vendedor unvendedor = new vendedor(identificacion,nombre, ventaMes1, ventaMes2, ventaMes3);
            losVendedores[i] = unvendedor;
        }
        
        for (int i = 0; i < numVendedores; i++) {
            promedio = promedio + losVendedores[i].calcularPromedio();
        }
        
        promedio = promedio / numVendedores;
        
        System.out.println("\nEl promedio de ventas es: " + promedio);
    }
}
