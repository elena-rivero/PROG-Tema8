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

	public static void nuevoProducto(String nombre, double precio) {
		int pos = posicionLibre();

		if (pos >= 0) {
			productos[pos] = new Producto(nombre, precio);
		} else {
			System.out.println("No hay espacio libre");
		}
	}

	public static void listarProductos() {
		for (Producto p : productos) {
			if (p != null) {
				System.out.println(p);
			}
		}
	}

	public static void modificarProducto(double precio, int pos) {
		productos[pos].setPrecio(precio);
	}

	public static void eliminarProducto(int pos) {
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

	public static int buscaProducto(String nombre) {
		int pos = 0;
		while (pos < productos.length && (productos[pos]==null || !productos[pos].getNombre().equals(nombre))) {
			pos++;
		}

		if (pos == productos.length) {
			pos = -1;
		}
		return pos;
	}
}
