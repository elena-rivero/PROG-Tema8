package ejercicio3;

import java.util.Scanner;

public class ProductoPrincipal {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int indice = 0;
		int opcion;
		String nombreProducto="";
		String tipoProducto="";
		double precio=0;	
		int diasACaducar=0;
		String tipo="";
		Producto prod = null;
		
		
		ClaseCRUD.menu();
		System.out.println("Seleccione una opción:");
		opcion = sc.nextInt();
		sc.nextLine();
		
		while(opcion!=0) {
			switch(opcion) {
			case 1:
				prod = creaProducto();
				ClaseCRUD.nuevoProducto(prod);
				break;
			case 2:
				ClaseCRUD.listarProductos();
				break;
			case 3:
				prod = creaProducto();
							
				ClaseCRUD.modificarProducto(prod);
				
				break;
			case 4:
				System.out.println("Introduzca el nombre del producto");
				nombreProducto = sc.nextLine();
				System.out.println("Introduzca el precio");
				precio = sc.nextDouble();
				sc.nextLine();
				
				prod = new Producto(nombreProducto, precio);
				ClaseCRUD.eliminarProducto(prod);
				
			}
			ClaseCRUD.menu();
			System.out.println("Seleccione una opción:");			
			opcion = sc.nextInt();
			sc.nextLine();
		}
		
		sc.close();
	}

	private static Producto creaProducto() {
		Producto prod = null;
		String nombreProducto;
		String tipoProducto;
		double precio;
		int diasACaducar;
		String tipo;
		System.out.println("Introduzca el nombre del producto");
		nombreProducto = sc.nextLine();
		System.out.println("Introduzca el precio del producto");
		precio = sc.nextDouble();
		sc.nextLine();
		System.out.println("Introduzca el tipo de producto");
		tipoProducto = sc.nextLine();
		
		switch(tipoProducto) {
		case "Perecedero":
			System.out.println("Introduzca los días que le quedan para caducar:");
			diasACaducar = sc.nextInt();
			sc.nextLine();
			prod = new Perecedero(nombreProducto,precio,diasACaducar);
			break;
			
		case "No Perecedero":
			System.out.println("Introduzca el tipo de producto:");
			tipo = sc.nextLine();
			prod = new NoPerecedero(nombreProducto, precio, tipo);
			break;
		}
		return prod;
	}

}
