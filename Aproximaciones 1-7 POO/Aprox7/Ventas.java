import java.util.Scanner;
import java.text.DecimalFormat;

public class Ventas {
    public static void main(String Args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        Concesionario miConcesionario = new Concesionario("123456", "IED GonzaloArango", "Suba");
        String identificacion, nombre, sede;
        double venta1, venta2, venta3, venta4;
        double promedio = 0;
        int opcionMenu = 0;

        do {
            System.out.println("\nMenu de Opciones");
            System.out.println("[1]- Adicionar Vendedor Zona 1: ");
            System.out.println("[2]- Adicionar Vendedor Zona 2: ");
            System.out.println("[3]- Adicionar Vendedor Zona 3: ");
            System.out.println("[4]- Calcular Promedio ");
            System.out.println("[5]- Salir \n");
            System.out.println("Escoja una Opcion: ");
            opcionMenu = sc.nextInt();
            switch (opcionMenu) {
                case 1:
                    sc.nextLine();
                    System.out.println("Digite la Identificacion del Vendedor: ");
                    identificacion = sc.next();
                    System.out.println("Digite el nombre del Vendedor: ");
                    nombre = sc.next();
                    System.out.println("Digite la sede del Concesionario: ");
                    sede = sc.next();
                    System.out.println("Digite primera Venta del Vendedor: ");
                    venta1 = sc.nextDouble();
                    System.out.println("Digite segunda Venta del Vendedor: ");
                    venta2 = sc.nextDouble();
                    try {
                        miConcesionario.adicionarVendedor(identificacion, nombre, sede, venta1, venta2);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    System.out.println("********************");
                    break;
                case 2:
                    sc.nextLine();
                    System.out.println("Digite la Identificacion del Vendedor: ");
                    identificacion = sc.next();
                    System.out.println("Digite el nombre del Vendedor: ");
                    nombre = sc.next();
                    System.out.println("Digite la sede del Concesionario: ");
                    sede = sc.next();
                    System.out.println("Digite primera Venta del Vendedor: ");
                    venta1 = sc.nextDouble();
                    System.out.println("Digite segunda Venta del Vendedor: ");
                    venta2 = sc.nextDouble();
                    System.out.println("Digite tercera Venta del Vendedor: ");
                    venta3 = sc.nextDouble();
                    try {
                        miConcesionario.adicionarVendedor(identificacion, nombre, sede, venta1, venta2, venta3);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    System.out.println("********************");
                    break;
                case 3:
                    sc.nextLine();
                    System.out.println("Digite la Identificacion del Vendedor: ");
                    identificacion = sc.next();
                    System.out.println("Digite el nombre del Vendedor: ");
                    nombre = sc.next();
                    System.out.println("Digite la sede del Concesionario: ");
                    sede = sc.next();
                    System.out.println("Digite primera Venta del Vendedor: ");
                    venta1 = sc.nextDouble();
                    System.out.println("Digite segunda Venta del Vendedor: ");
                    venta2 = sc.nextDouble();
                    System.out.println("Digite tercera Venta del Vendedor: ");
                    venta3 = sc.nextDouble();
                    System.out.println("Digite cuarta Venta del Vendedor: ");
                    venta4 = sc.nextDouble();
                    try {
                        miConcesionario.adicionarVendedor(identificacion, nombre, sede, venta1, venta2, venta3, venta4);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    System.out.println("********************");
                    break;
                case 4:
                    sc.nextLine();
                    promedio = miConcesionario.calcularPromedioGeneral();
                    DecimalFormat df = new DecimalFormat("#.##");
                    System.out.println("\nEl promedio de Ventas es: $" + df.format(promedio));
                    break;
                default:
                    System.out.println("Ha Seleccionado Salir");

            }
        } while (opcionMenu != 5);
    }
}
