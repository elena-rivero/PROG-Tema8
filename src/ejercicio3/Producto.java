package ejercicio3;

public class Producto {
	String nombre;
	double precio;

	public Producto(String nombre, double precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		String res = nombre + " - " + precio;
		return res;
	}
	
	public double calcular(int cantidad) {
		return cantidad * precio;
	}
}
