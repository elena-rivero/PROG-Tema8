package prueba;

public class Persona implements Sonido, Comparable<Persona> {
	String nombre;
	int edad;
	double estatura;

	public Persona(String nombre, int edad, double estatura) {
		this.nombre = nombre;
		this.edad = edad;
		this.estatura = estatura;
	}

	void mostrarDatos() {
		System.out.println(nombre);
		System.out.println(edad);
		System.out.println(estatura);
	}

	@Override
	public String toString() {
		String res = "";
		res += nombre;
		return res;
	}

	@Override
	public boolean equals(Object obj) {
		boolean res = false;

		Persona p = (Persona) obj;

		if (this.edad == p.edad && this.nombre.equals(p.nombre)) {
			res = true;
		}

		return res;
	}

	@Override
	public void voz() {
		System.out.println("Hola");
	}

	@Override
	public int compareTo(Persona o) {
		int res;
		res = this.edad - o.edad;
		
		return res;
	}

	 
}
