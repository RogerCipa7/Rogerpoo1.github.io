
import java.util.Scanner;
public class Ventas
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numeroVendedores = 0, opcionMenu = 0;
        Vendedor[] losVendedores = new Vendedor[50];
        String identificacion, nombre;
        double ventasMes1, ventasMes2, ventasMes3;
        double promedio = 0;
        while(opcionMenu != 3){
            System.out.println("\nMenu de Opciones: ");
            System.out.println("1. Adicionar un Vendedor: ");
            System.out.println("2. calcular Promedio de ventas: ");
            System.out.println("3. Salir ");
            System.out.println("Escoja una opcion.... ");
            opcionMenu = sc.nextInt();
            if(opcionMenu== 1){
                System.out.println("Digite la identificacion del Vendedor: ");
                identificacion = sc.next();
                System.out.println("Digite el nombre del vendedor   ");
                nombre = sc.next();
                System.out.println("Digite ventas Mes 1 ");
                ventasMes1 = sc.nextDouble();
                System.out.println("Digite ventas Mes 2 ");
                ventasMes2 = sc.nextDouble();
                System.out.println("Digite ventas Mes 3 ");
                ventasMes3 = sc.nextDouble();
                Vendedor unVendedor = new Vendedor(identificacion, nombre,ventasMes1,ventasMes2,ventasMes3);
                losVendedores[numeroVendedores] = unVendedor;
                numeroVendedores++;
            }
            else if(opcionMenu==2){
                for(int i = 0; i < numeroVendedores; i++){
                    promedio = promedio + losVendedores[i].calcularPromedio() / numeroVendedores;       
                }
                System.out.println("\n El Promedio de ventas del Vendedor es: "+ promedio);
            }
        }
    
    }

}