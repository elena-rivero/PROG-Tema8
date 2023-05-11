package ejercicio3;

public class ClaseCRUD {
	static Producto[] productos = new Producto[10];

	public static void menu() {
		System.out.println("1. Añadir producto");
		System.out.println("2. Listar productos");
		System.out.println("3. Modificar producto");
		System.out.println("4. Eliminar producto");
		System.out.println("0. Salir");

	}

	public static void nuevoProducto(Producto prod) {
		int pos = posicionLibre();
		int enc = buscaProducto(prod);
		
		if(pos<0) {
			System.out.println("No hay espacio libre");
		} else if(enc>=0) {
			System.out.println("Ya existe el producto");
		} else {
			productos[pos] = prod;
		}
	}

	public static void listarProductos() {
		for (Producto p : productos) {
			if (p != null) {
				System.out.println(p);
			}
		}
	}

	public static void modificarProducto(Producto prod) {
		int pos = buscaProducto(prod);
		int opcion;
		double precio;
		int diasACaducar;
		String tipo;
		
		if(pos < 0) {
			System.out.println("El producto no se encuentra");
		} else {
			System.out.println("¿Qué valor desea modificar?");
			System.out.println("1. Precio");
			
			if(prod instanceof Perecedero) {
				System.out.println("2. Dias a caducar");
			} else if(prod instanceof NoPerecedero) {
				System.out.println("2. Tipo");
			}
			
			opcion = ProductoPrincipal.sc.nextInt();
			ProductoPrincipal.sc.nextLine();
			
			switch(opcion) {
			case 1:
				System.out.println("Introduzca el precio");
				precio = ProductoPrincipal.sc.nextDouble();
				ProductoPrincipal.sc.nextLine();
				prod.setPrecio(precio);
				break;
			case 2:
				
				if(prod instanceof Perecedero) {
					System.out.println("Introduzca los días a caducar");
					diasACaducar = ProductoPrincipal.sc.nextInt();
					ProductoPrincipal.sc.nextLine();
					((Perecedero)productos[pos]).setDiasACaducar(diasACaducar);
				} else if(prod instanceof NoPerecedero) {
					System.out.println("Introduzca el tipo");
					tipo = ProductoPrincipal.sc.nextLine();
					((NoPerecedero)productos[pos]).setTipo(tipo);
				}
				
				break;
			}
			
		}
		
	}

	public static void eliminarProducto(Producto prod) {
		int pos = buscaProducto(prod);
		productos[pos] = null;
	}
	
	public static int posicionLibre() {
		int posicion = 0;

		while (posicion < productos.length && productos[posicion] != null) {
			posicion++;
		}
		if (posicion == productos.length) {
			posicion = -1;
		}

		return posicion;
	}

	public static int buscaProducto(Producto prod) {
		int pos = 0;
		while (pos < productos.length && (productos[pos]==null || !productos[pos].equals(prod))) {
			pos++;
		}

		if (pos == productos.length) {
			pos = -1;
		}
		return pos;
	}
}
