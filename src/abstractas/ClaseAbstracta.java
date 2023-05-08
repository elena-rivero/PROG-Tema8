package abstractas;

public abstract class ClaseAbstracta {
	int edad;
	String nombre;
	
	public String toString() {
		return edad + " " + nombre;
	}
	
	public abstract int dobleEdad();
}
