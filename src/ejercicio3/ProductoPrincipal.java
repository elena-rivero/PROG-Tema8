package ejercicio3;

import java.util.Scanner;

public class ProductoPrincipal {

	public static void main(String[] args) {
		Producto[] productos = new Producto[10];
		int indice = 0;
		int opcion;
		String nombreProducto="";
		double precio=0;
		Scanner sc = new Scanner(System.in);
		ClaseCRUD.menu();

		System.out.println("Seleccione una opción:");
		opcion = sc.nextInt();
		sc.nextLine();
		
		while(opcion!=0) {
			switch(opcion) {
			case 1:
				System.out.println("Introduzca el nombre del producto");
				nombreProducto = sc.nextLine();
				System.out.println("Introduzca el precio del producto");
				precio = sc.nextDouble();
				sc.nextLine();
				ClaseCRUD.nuevoProducto(nombreProducto, precio);
				break;
			case 2:
				ClaseCRUD.listarProductos();
				break;
			case 3:
				System.out.println("Introduzca el nombre del producto");
				nombreProducto = sc.nextLine();
				indice = ClaseCRUD.buscaProducto(nombreProducto);
				if(indice>=0) {
					System.out.println("Introduzca el precio del producto");
					precio = sc.nextDouble();
					sc.nextLine();
					ClaseCRUD.modificarProducto(precio, indice);
				} else {
					System.out.println("No se encuentra el producto");
				}
				break;
			case 4:
				System.out.println("Introduzca el nombre del producto");
				nombreProducto = sc.nextLine();
				indice = ClaseCRUD.buscaProducto(nombreProducto);
				if(indice>=0) {
					ClaseCRUD.eliminarProducto(indice);
				}
			}
			ClaseCRUD.menu();
			System.out.println("Seleccione una opción:");			
			opcion = sc.nextInt();
			sc.nextLine();
		}
		
	}

}
