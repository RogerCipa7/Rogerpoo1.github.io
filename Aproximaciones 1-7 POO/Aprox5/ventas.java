import java.util.Scanner;
public class ventas{
    public static void main(String Args[]) throws Exception{
        Scanner sc = new Scanner(System.in);        
        concesionario miConcesionario = new concesionario("123456","IED GonzaloArango","Suba");
        String identificacion, nombre;
        
        double promedio = 0;
        
        System.out.println("Digite el numero de Vendedor de la zona 1: ");
        int numVendedores1 = sc.nextInt();
        for(int i = 0; i < numVendedores1; i++){
            double venta1, venta2;
            System.out.println("Digite la Identificacion del Vendedor: ");
            identificacion = sc.next();
            System.out.println("Digite el nombre del Vendedor: ");
            nombre = sc.next();
            System.out.println("Digite primera Venta del Vendedor: ");
            venta1 = sc.nextDouble();
            System.out.println("Digite segunda Venta del Vendedor: ");
            venta2 = sc.nextDouble();            
            miConcesionario.adicionarvendedorZona1(identificacion, nombre, venta1, venta2);
        }
                
        System.out.println("Digite el numero de Vendedors de la zona 2 ");
        int numVendedores2 = sc.nextInt();
        for(int i = 0; i < numVendedores2; i++){
            double venta1, venta2, venta3;
            System.out.println("Digite la Identificacion del Vendedor: ");
            identificacion = sc.next();
            System.out.println("Digite el nombre del Vendedor: ");
            nombre = sc.next();
            System.out.println("Digite primera Venta del Vendedor: ");
            venta1 = sc.nextDouble();
            System.out.println("Digite segunda Venta del Vendedor: ");
            venta2 = sc.nextDouble();            
            System.out.println("Digite tercera Venta del Vendedor: ");
            venta3 = sc.nextDouble();
            miConcesionario.adicionarvendedorZona2(identificacion, nombre, venta1, venta2, venta3);
        }
        
        System.out.println("Digite el numero de Vendedor de la zona 3 ");
        int numVendedores3 = sc.nextInt();
        for(int i = 0; i < numVendedores3; i++){
            double venta1, venta2, venta3, venta4;            
            System.out.println("Digite la Identificacion del Vendedor: ");
            identificacion = sc.next();
            System.out.println("Digite el nombre del Vendedor: ");
            nombre = sc.next();
            System.out.println("Digite primera Venta del Vendedor: ");
            venta1 = sc.nextDouble();
            System.out.println("Digite segunda Venta del Vendedor: ");
            venta2 = sc.nextDouble();            
            System.out.println("Digite tercera Venta del Vendedor: ");
            venta3 = sc.nextDouble();
            System.out.println("Digite cuarta Venta del Vendedor: ");
            venta4 = sc.nextDouble();            
            miConcesionario.adicionarvendedorZona3(identificacion, nombre,  venta1, venta2, venta3, venta4);
        }
        
        promedio = miConcesionario.calcularPromedioGeneral();
        System.out.println("\n El promedio de ventas es: " + promedio); 
    }
}