package ejercicio3;

public class Producto {
	String nombre = "";
	double precio = 0;

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
	
	@Override
	public boolean equals(Object obj) {
		boolean igual = false;
		Producto p = (Producto) obj;
		if(p.nombre.equals(this.nombre)) {
			igual = true;
		}
		return igual;
	}
	
	public double calcular(int cantidad) {
		return cantidad * precio;
	}
}
